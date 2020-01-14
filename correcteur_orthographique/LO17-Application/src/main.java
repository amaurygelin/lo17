import java.util.StringTokenizer;
import java.util.regex.*;

public class main {

	public static void main(String args[]){

		String str = new String();
		String request = new String (Saisie.main(args));
		request = request.toLowerCase();
		
		// PRE-TRAITEMENT
		
		// étape 1 : transformer d'... -> de ...
		request = request.replaceAll("d'","de ");
		request = request.replaceAll("l'","le ");
		request = request.replaceAll("n'","ne ");
		
		// étape 2 : écrits/publiés en/avant/après -> date en/avant/après
		request = request.replaceAll("ecrit[es]{0,2} en|ecrit[es]{0,2} le|publie[es]{0,2} en|publie[es]{0,2} au|paru[es]{0,2} en|dat[aent]{0,3} du", "date en");
		request = request.replaceAll("ecrit[es]{0,2} avant|publie[es]{0,2} avant|paru[es]{0,2} avant", "date avant");
		request = request.replaceAll("ecrit[es]{0,2} apres|publie[es]{0,2} apres|paru[es]{0,2} apres", "date apres");

		if (request.matches(".*1er.*") == true){
			request = request.replaceFirst("1er", "01");
		}
		
		// étape 3 : accoler jour et annee lorsqu'on détecte des chaines de chiffres
		Pattern r = Pattern.compile("[0-9]{4}");
		Matcher m = r.matcher(request);
		StringBuffer sb = new StringBuffer(request);
		if (m.find()){
			sb.insert(m.end()-4,"annee ");
		}
		request = sb.toString();
		
		r = Pattern.compile(" [0-9]{2} ");
		m = r.matcher(request);
		sb = new StringBuffer(request);
		if (m.find()){
			sb.insert(m.end()-3,"jour ");
		}
		request = sb.toString();
		
		// étape 4 : transformer " ne .. pas  " en "sans .."
		if (request.matches("(.*)ne(.*)pas(.*)")){
			request = request.replaceAll(" ne ", " sans ");
			request = request.replaceAll(" pas", "");
		}
		
		// étape 5 : si "qui" en début de requête -> vouloir
		// car les autres "qui" sont dans la stoplist
		if (request.matches("^qui(.*)")){
			request = request.replaceFirst("qui", "vouloir");
		}
		
		if (request.matches("^tous(.*)")){
			request = "vouloir "+request ;
		}
		
		System.out.println("pré-traitement : "+request);
		
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
		
		System.out.print("\nSupprimer les stopwords : ");
		for (i = 0 ; i < n ; i++){
			System.out.print(requeteTable[i][0]+" ");
		}
				
		// application du lexique de structure
		file = "structure.txt";
		requeteTable = Lexique.correct(requeteTable,file,n);
		
		System.out.print("\n Lexique de structure : ");
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
				
		if ( !(etIndex == n)){
			requeteTable[etIndex+1][0] = requeteTable[etIndex+1][0].trim();
		}
		
		if (etIndex < n){
			if ((requeteTable[etIndex+1][0].compareTo("article") == 0) 
					|| (requeteTable[etIndex+1][0].compareTo("mot") == 0)
					|| (requeteTable[etIndex+1][0].compareTo("auteur") == 0)
					|| (requeteTable[etIndex+1][0].compareTo("numero") == 0)
					|| (requeteTable[etIndex+1][0].compareTo("rubrique") == 0)
					|| (requeteTable[etIndex+1][0].compareTo("date") == 0)
					|| (requeteTable[etIndex+1][0].compareTo("titre") == 0))
			{
				requeteTable[etIndex][0] = "" ;
			}
		}
		
		for (i = 0 ; i < n-2 ; i++){
			if (requeteTable[i][0].compareTo(requeteTable[i+1][0]) == 0){
				requeteTable[i][0] = "" ;
			}
		}
						
		// remettre la requête sous forme de string
		String normalizedRequest = new String();
		normalizedRequest = requeteTable[0][0];
		for (i = 1 ; i < n ; i++){
			normalizedRequest = normalizedRequest+" "+requeteTable[i][0];
		}
		
		System.out.println("\n Requête normalisée : "+normalizedRequest);
		
		int etFlag = 0 ;
		if (normalizedRequest.matches("(.*)et(.*)")){
			etFlag = 1 ;
		}
		
		// appeler parser antlr pour produire requête SQL
		String SQLRequest = TalMain3.main(normalizedRequest);
		
		// remove brackets
		SQLRequest = SQLRequest.replace("( ", "");
		SQLRequest = SQLRequest.replace(" )", "");
		
		// remove excess spaces
		SQLRequest = SQLRequest.trim().replaceAll(" +", " "); 
		
		System.out.println("Requête pseudo-SQL : "+SQLRequest);
		
		// POST-TRAITEMENT REQUÊTE PSEUDO-SQL
		
		StringTokenizer sqlTokens = new StringTokenizer(SQLRequest);
		n = sqlTokens.countTokens();
		String[] sqlTable = new String[n+100]; 
		
		i = 0 ;	
		while (sqlTokens.hasMoreTokens()) {
			token = sqlTokens.nextToken();
			sqlTable[i] = token ;
			i++ ;
		}
				
		// select count(distinct table.col) from ...
		if (sqlTable[1].compareTo("count(distinct") == 0){
			str = "count(distinct "+sqlTable[2]+")" ;
			sqlTable[1] = str ;
			i = 2 ;
			while (i < n-1){
				sqlTable[i] = sqlTable[i+1] ;
				i ++ ;
			}
			
			sqlTable[i] = "";
						
			// tokens back to string
			SQLRequest = sqlTable[0];
			for (i = 1 ; i < n ; i++){
				SQLRequest = SQLRequest+" "+sqlTable[i];
			}
			
			System.out.println("Transformation select count : "+SQLRequest);
			
			StringTokenizer sqlTokens3 = new StringTokenizer(SQLRequest);
			n = sqlTokens3.countTokens();
			i = 0;
			while (sqlTokens3.hasMoreTokens()) {
				token = sqlTokens3.nextToken();
				sqlTable[i] = token ;
				i++ ;
			}
		}
				
		// indice des tables t1, t2 etc
		int indexTable = 1 ;
				
		// if "et" between 2 values
		if ((etFlag == 1) && (sqlTable[6].compareTo(sqlTable[10]) == 0)){
			
			str = " t"+indexTable+", "+sqlTable[4]+" t"+(indexTable+1) ;
			sqlTable[4] = sqlTable[4].concat(str);
			
			str = "t"+indexTable+".";
			sqlTable[2] = str.concat(sqlTable[2]);
			
			int dotIndex = sqlTable[6].indexOf(".") ;
			str = sqlTable[6].substring(0,dotIndex)	;
			sqlTable[6] = sqlTable[6].replaceFirst(str, "t"+indexTable);			
			sqlTable[10] = sqlTable[10].replaceFirst(str, "t"+(indexTable+1));
						
			dotIndex = sqlTable[6].indexOf(".") ;
			//String param = sqlTable[6].substring(dotIndex+1);
						
			// tokens back to string
			SQLRequest = sqlTable[0];
			for (i = 1 ; i < n ; i++){
				SQLRequest = SQLRequest+" "+sqlTable[i];
			}
			
			// add join condition
			str = " AND t"+indexTable+".fichier = t"+(indexTable+1)+".fichier" ;
			SQLRequest = SQLRequest.concat(str);
			
			indexTable = indexTable + 2 ;
			
			System.out.println("et SQL : "+SQLRequest);
		}
		
		i = 0 ;		
		
		StringTokenizer sqlTokens2 = new StringTokenizer(SQLRequest);
		n = sqlTokens2.countTokens();
		while (sqlTokens2.hasMoreTokens()) {
			token = sqlTokens2.nextToken();
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
				
		// if need a join even if only one "from" : for rubrique, email and date
		if ((sqlTable[2].compareTo("rubrique.rubrique") == 0) || (sqlTable[2].compareTo("email.email") == 0) || (sqlTable[2].compareTo("date.jour") == 0)){
			
			String table = new String();
			
			if (sqlTable[2].compareTo("rubrique.rubrique") == 0){
				table = "rubrique";
			} else if (sqlTable[2].compareTo("email.email") == 0){
				table = "email";
			} else {
				table = "date";
			}
			
			// add join condition
			String strAnd = " AND "+sqlTable[fromFirstIndex+1]+".fichier = "+table+".fichier";
						
			// concatenate 2nd table to 1st table
			str = ", "+table;
			sqlTable[fromFirstIndex+1] = sqlTable[fromFirstIndex+1].concat(str);
			
			// tokens back to string
			SQLRequest = sqlTable[0];
			for (i = 1 ; i < n ; i++){
				SQLRequest = SQLRequest+" "+sqlTable[i];
			}
			
			SQLRequest = SQLRequest.concat(strAnd);
			
			System.out.println("\n 2 tables join SQL : "+SQLRequest);			
		}
		
		// if there are two "from" in the request, create a join
		if (fromSecondIndex < n){
			
			String firstTable = sqlTable[fromFirstIndex+1];
			String secondTable = sqlTable[fromSecondIndex+1];
						
			// if firstTable = secondTable, don't do join
			if (firstTable.compareTo(secondTable) == 0){
				
				int whereFirstIndex = 0 ;
				while (sqlTable[whereFirstIndex].compareTo("where") != 0){
					whereFirstIndex++ ;
				}
				
				// if same table and same column : need to declare table multiple times
				// ex : t1.mot = "x" and t2.mot="y" and t1.fichier = t2.fichier				
				if (sqlTable[whereFirstIndex+1].split("\\.")[1].compareTo(sqlTable[fromSecondIndex+3].split("\\.")[1]) == 0){
					
					if (indexTable == 1){
						str = " t"+(indexTable-1) ;
						sqlTable[fromFirstIndex + 1] = sqlTable[fromFirstIndex + 1].concat(str);
						sqlTable[whereFirstIndex + 1] = sqlTable[whereFirstIndex + 1].replaceAll(firstTable, str);
						
						sqlTable[fromFirstIndex - 1] = str+"."+sqlTable[fromFirstIndex - 1];
					}
					
					// voir si ce if peut passer avant le traitement du "et"
					
					str = ", "+firstTable+" t"+indexTable ;
					sqlTable[whereFirstIndex - 1] = sqlTable[whereFirstIndex - 1].concat(str);
					
					str = "t"+indexTable ;
					sqlTable[fromSecondIndex + 3] = sqlTable[fromSecondIndex + 3].replaceAll(firstTable, str) ;
					
					sqlTable[fromSecondIndex] = "AND t"+indexTable+".fichier = t"+(indexTable-1)+".fichier AND";
				
				// if same table but different columns, no join needed
				} else {
					sqlTable[fromSecondIndex] = "AND";
				}
				
				sqlTable[fromSecondIndex + 1] = "";
				sqlTable[fromSecondIndex + 2] = "";
				
			} else {
			
				// add select TABLE.param (if not select count)
				if (sqlTable[fromFirstIndex-1].matches(".*count.*") == false){ 
					str = "."+sqlTable[fromFirstIndex-1] ;
					sqlTable[fromFirstIndex-1] = firstTable.concat(str);
				}
				
				// concatenate 2nd table to 1st table
				str = ", "+sqlTable[fromSecondIndex+1];
				sqlTable[fromFirstIndex+1] = sqlTable[fromFirstIndex+1].concat(str);
				
				// delete 2nd "where" and 2nd "from"
				sqlTable[fromSecondIndex+2] = "";
				sqlTable[fromSecondIndex] = "AND";
				sqlTable[fromSecondIndex+1] = "";
				
			}
				
			// tokens back to string
			SQLRequest = sqlTable[0];
			for (i = 1 ; i < n ; i++){
				SQLRequest = SQLRequest+" "+sqlTable[i];
			}
			
			if (firstTable.compareTo(secondTable)!=0){
				// add join condition
				str = " AND "+secondTable+".fichier = "+firstTable+".fichier";
				SQLRequest = SQLRequest.concat(str);
			}
			
			System.out.println("\n 2 from : "+SQLRequest);
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
 * tous les articles sur le CNRS et l'innovation
 * je souhaite les fichiers qui contiennent les mots propulsion et technologique
 * je veux les articles qui parlent de propulsion et technologie
 * je voudrais les articles publies en 2011 sur l'enseignement
 * je veux les articles ecrits en 2012 et qui parlent de recherche
 * je veux les articles qui parlent de recherche et numerique
 * quels sont les fichiers qui ne sont pas dans la rubrique focus
 * qui a ecrit au sujet d'economie
 * qui a ecrit dans la rubrique focus
 * je veux les articles dont la rubrique est focus
 * je veux les articles qui parlent d'economie et ecrits en 15 janvier 2012
 * je veux les articles qui parlent de recherche et numerique mais qui ne parlent pas d'economie
 * combien d'articles parlent du cnrs et sont ecrits en 2012
 */

// EXEMPLES REQUÊTES A FAIRE FONCTIONNER 
/* 
 * 
 * Trouve des articles au sujet de l'energie mais qui ne parlent pas du nucleaire
 */