import java.util.StringTokenizer;
import java.util.regex.*;

public class main {

	public static void main(String args[]){

		String request = new String (Saisie.main(args));
		//request = request.toLowerCase();
		
		// PRE-TRAITEMENT
		
		// �tape 1 : transformer d'... -> de ...
		request = request.replaceAll("d'","de ");
				
		// �tape 2 : �crits/publi�s en/avant/apr�s -> date en/avant/apr�s
		request = request.replaceAll("ecrit[es]{0,2} en|publie[es]{0,2} en|paru[es]{0,2} en", "date en");
		request = request.replaceAll("ecrit[es]{0,2} avant|publie[es]{0,2} avant|paru[es]{0,2} avant", "date avant");
		request = request.replaceAll("ecrit[es]{0,2} apres|publie[es]{0,2} apres|paru[es]{0,2} apres", "date apres");
			
		// �tape 3 : accoler jour et annee lorsqu'on d�tecte des chaines de chiffres
		Pattern r = Pattern.compile("[0-9]{4}");
		Matcher m = r.matcher(request);
		StringBuffer sb = new StringBuffer(request);
		if (m.find()){
			sb.insert(m.end()-4,"annee ");
		}
		request = sb.toString();
		
		r = Pattern.compile("[0-9]{1,2}");
		m = r.matcher(request);
		sb = new StringBuffer(request);
		if (m.find()){
			sb.insert(m.end()-2,"jour ");
		}
		request = sb.toString();
		
		// �tape 4 : transformer "  ..  " en "sans .."
		if (request.matches("(.*)ne(.*)pas(.*)")){
			request = request.replaceAll("ne", "sans");
			request = request.replaceAll(" pas", "");
		}
		System.out.println("requete : "+request);
		
		// �tape 5 : si "qui" en d�but de requ�te -> vouloir
		// car les autres "qui" sont dans la stoplist
		if (request.matches("^qui(.*)")){
			request = request.replaceFirst("qui", "vouloir");
		}
		
		StringTokenizer requestTokens = new StringTokenizer(request);
		String token = new String();
				
		int n = requestTokens.countTokens();
		
	    String[][] requeteTable = new String[n][2];
		
	    // split la requ�te en tokens, dans un tableau
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
		
		// remettre la requ�te sous forme de string
		String normalizedRequest = new String();
		normalizedRequest = requeteTable[0][0];
		for (i = 1 ; i < n ; i++){
			normalizedRequest = normalizedRequest+" "+requeteTable[i][0];
		}
		
		System.out.println("\n"+normalizedRequest);
		
		// appeler parser antlr pour produire requ�te SQL
		String SQLRequest = TalMain3.main(normalizedRequest);
		
		// POST-TRAITEMENT REQU�TE PSEUDO-SQL
		int count = (SQLRequest.split("from", -1).length) - 1;		
		if (count > 1){
			int indexFrom = SQLRequest.lastIndexOf("from");
			int indexTable = indexFrom + 5 ;
			int indexWhere = SQLRequest.lastIndexOf("where");
			System.out.println(SQLRequest.length()+" "+indexFrom+" "+SQLRequest.charAt(90));
		
			int indexFirstWhere = SQLRequest.indexOf("where");
			
			//indexTable = 
		}
		
		// interrogation BDD avec la requ�te SQL
		try{
			interrogPostgresql.main(SQLRequest);
		} catch(Exception e) {  }		

	}
}

// EXEMPLES REQU�TES QUI FONCTIONNENT 
/*
 * je veux les articles ecrits en 24 janvier 2012
 * je souhaite les fichiers qui contiennent les mots numerique technologique
 * quels sont les fichiers sans rubrique Focus
 */

// EXEMPLES REQU�TES A FAIRE FONCTIONNER 
/*
 * je veux les articles qui parlent d'economie et ecrits en 15 janvier 2012
*/