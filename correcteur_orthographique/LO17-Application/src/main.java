import java.util.StringTokenizer;
import java.util.regex.*;

public class main {

	public static void main(String args[]){

		String str = new String();
		String request = new String (Saisie.main(args));
		//request = request.toLowerCase();
		
		// PRE-TRAITEMENT
		
		// étape 1 : transformer d'... -> de ...
		request = request.replaceAll("d'","de ");
		request = request.replaceAll("l'","le ");
		
		// étape 2 : écrits/publiés en/avant/après -> date en/avant/après
		request = request.replaceAll("ecrit[es]{0,2} en|publie[es]{0,2} en|paru[es]{0,2} en", "date en");
		request = request.replaceAll("ecrit[es]{0,2} avant|publie[es]{0,2} avant|paru[es]{0,2} avant", "date avant");
		request = request.replaceAll("ecrit[es]{0,2} apres|publie[es]{0,2} apres|paru[es]{0,2} apres", "date apres");
			
		// étape 3 : accoler jour et annee lorsqu'on détecte des chaines de chiffres

		Pattern r = Pattern.compile("[0-9]{4}");
		Matcher m = r.matcher(request);
		StringBuffer sb = new StringBuffer(request);
		if (m.find()){
			sb.insert(m.end()-4,"annee ");
		}
		request = sb.toString();
		
		r = Pattern.compile(" [0-9]{1,2}$");
		m = r.matcher(request);
		sb = new StringBuffer(request);
		if (m.find()){
			sb.insert(m.end()-2,"jour ");
		}
		request = sb.toString();
		
		// étape 4 : transformer " ne .. pas  " en "sans .."
		if (request.matches("(.*)ne(.*)pas(.*)")){
			request = request.replaceAll("ne", "sans");
			request = request.replaceAll(" pas", "");
		}
		System.out.println("requete : "+request);
		
		// étape 5 : si "qui" en début de requête -> vouloir
		// car les autres "qui" sont dans la stoplist
		if (request.matches("^qui(.*)")){
			request = request.replaceFirst("qui", "vouloir");
		}
		
		StringTokenizer requestTokens = new StringTokenizer(request);
		String token = new String();
				
		int n = requestTokens.countTokens();
		
	    String[][] requeteTable = new String[n][2];
		
	    // split la requête en tokens, dans un tableau
	    int i = 0 ;
		while (requestTokens.hasMoreTokens()) {
			token = requestTokens.nextToken();
			requeteTable[i][0] = token ;
			requeteTable[i][1] = "0";
			i++;
		}
		
		// remove stop words 
		String file = "stoplist.txt";
		requeteTable = Lexique.removeStoplist(requeteTable,file,n);
		
		n = requeteTable.length ;
		
		for (i = 0 ; i < n ; i++){
			System.out.print(requeteTable[i][0]+" ");
		}
				
		// application du lexique de structure
		file = "structure.txt";
		requeteTable = Lexique.correct(requeteTable,file,n);
		
		System.out.print("\n");
		for (i = 0 ; i < n ; i++){
			System.out.print(requeteTable[i][0]+" ");
		}
		
		// correction orthographique
		file = "lexique_corpus.txt" ;
		requeteTable = Lexique.correct(requeteTable, file, n);
		
		// traitement du "et" : supprimer "et" si entre deux classes
		// donc "et" conservé lorsqu'entre deux valeurs d'une classe
		int etIndex = 0 ;
		while ((etIndex < n) && (requeteTable[etIndex][0].compareTo("et") != 0)){
			etIndex ++ ;
		}
		if (etIndex < n){
			if ((requeteTable[etIndex+1][0].compareTo("article") == 0) 
					|| (requeteTable[etIndex+1][0].compareTo("mot") == 0)
					|| (requeteTable[etIndex+1][0].compareTo("auteur") == 0)
					|| (requeteTable[etIndex+1][0].compareTo("numero") == 0)
					|| (requeteTable[etIndex+1][0].compareTo("rubrique") == 0)
					|| (requeteTable[etIndex+1][0].compareTo("date") == 0))
			{				
				requeteTable[etIndex][0] = "" ;
			}
		}
		
		// remettre la requête sous forme de string
		String normalizedRequest = new String();
		normalizedRequest = requeteTable[0][0];
		for (i = 1 ; i < n ; i++){
			normalizedRequest = normalizedRequest+" "+requeteTable[i][0];
		}
		
		System.out.println("\n"+normalizedRequest);
		
		
		// appeler parser antlr pour produire requête SQL
		String SQLRequest = TalMain3.main(normalizedRequest);
		
		// POST-TRAITEMENT REQUÊTE PSEUDO-SQL
		
		// remove brackets
		SQLRequest = SQLRequest.replace("(", "");
		SQLRequest = SQLRequest.replace(")", "");
		
		// remove excess spaces
		SQLRequest = SQLRequest.trim().replaceAll(" +", " "); 
				
		StringTokenizer sqlTokens = new StringTokenizer(SQLRequest);
		n = sqlTokens.countTokens();
		String[] sqlTable = new String[n]; 
		i = 0 ;
				
		while (sqlTokens.hasMoreTokens()) {
			token = sqlTokens.nextToken();
			sqlTable[i] = token ;
			i++ ;
		}
		
		// find "from" positions
		int fromFirstIndex = 0, fromSecondIndex = 0 ;
		while (sqlTable[fromFirstIndex].compareTo("from") != 0){
			fromFirstIndex++ ;
		}
		fromSecondIndex = fromFirstIndex + 1 ;
		while ((fromSecondIndex < n) && (sqlTable[fromSecondIndex].compareTo("from") != 0)){
			fromSecondIndex++ ;
		}
				
		// if need a join even if only one "from" : for email and date
		if ((sqlTable[2].compareTo("email.email") == 0) || (sqlTable[2].compareTo("date.jour") == 0)){
			
			String table = new String();
			
			if (sqlTable[2].compareTo("email.email") == 0){
				table = "email";
			} else {
				table = "date";
			}
						
			// concatenate 2nd table to 1st table
			str = ", "+table;
			sqlTable[fromFirstIndex+1] = sqlTable[fromFirstIndex+1].concat(str);
			
			// tokens back to string
			SQLRequest = sqlTable[0];
			for (i = 1 ; i < n ; i++){
				SQLRequest = SQLRequest+" "+sqlTable[i];
			}
						
			// add join condition
			str = " AND titretexte.fichier = "+table+".fichier";
			SQLRequest = SQLRequest.concat(str);
			
			System.out.println("\n SQL final : "+SQLRequest);			
		}
		
		// if there are two "from" in the request, create a join
		if (fromSecondIndex < n){
			
			String firstTable = sqlTable[fromFirstIndex+1];
			String secondTable = sqlTable[fromSecondIndex+1];
			
			// add select TABLE.param
			str = "."+sqlTable[fromFirstIndex-1] ;
			sqlTable[fromFirstIndex-1] = firstTable.concat(str);
			
			// concatenate 2nd table to 1st table
			str = ", "+sqlTable[fromSecondIndex+1];
			sqlTable[fromFirstIndex+1] = sqlTable[fromFirstIndex+1].concat(str);
			
			// delete 2nd "where" and 2nd "from"
			sqlTable[fromSecondIndex+2] = "";
			sqlTable[fromSecondIndex] = "AND";
			sqlTable[fromSecondIndex+1] = "";
			
			// tokens back to string
			SQLRequest = sqlTable[0];
			for (i = 1 ; i < n ; i++){
				SQLRequest = SQLRequest+" "+sqlTable[i];
			}
						
			// add join condition
			str = " AND "+secondTable+".fichier = "+firstTable+".fichier";
			SQLRequest = SQLRequest.concat(str);
			
			System.out.println("\n SQL final : "+SQLRequest);
		}
		
		// interrogation BDD avec la requête SQL finale
		try{
			interrogPostgresql.main(SQLRequest);
		} catch(Exception e) {  }		

	}
}

// EXEMPLES REQUÊTES QUI FONCTIONNENT 
/*
 * je veux les articles ecrits en 24 janvier 2012
 * je souhaite les fichiers qui contiennent les mots numerique technologique
 * je veux les articles ecrits en 2012 et qui parlent de recherche
 * quels sont les fichiers qui ne sont pas dans la rubrique focus
 * qui a ecrit au sujet d'economie
 * qui a ecrit dans la rubrique focus
 * je veux les articles dont la rubrique est focus
 * je veux les articles qui parlent d'economie et ecrits en 15 janvier 2012
 */

// EXEMPLES REQUÊTES A FAIRE FONCTIONNER 
/* 
 * 
 * 
 */