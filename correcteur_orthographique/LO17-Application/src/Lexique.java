import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class Lexique {

	public static Hashtable<String,String> lexique ;
	public static List<String> stoplist ;
	
	// correction orthographique
	public static String[][] correct(String[][] request, String file, int n){
						
		String token = new String();
		String[][] newRequest = new String[n][2];
		String[] args = new String[1];
		
		// copy request
		for (int i=0 ; i < n ; i++){
			newRequest[i][0] = request[i][0];
			newRequest[i][1] = request[i][1];
		}
		
		lexique = Cat.readLexique(file);
		
		// check every token to find best lemme
		// check only if never checked before -> request[i][1] = "0"
		for (int i = 0; i < n ; i++) {
			
			if (request[i][1].equals("0")){
								
				token = request[i][0];
				
				List<String> lemmesCandidats = new ArrayList<String>();
				
				if (getLemmeFromLexique(token) != null){
					lemmesCandidats.add(getLemmeFromLexique(token));
				}
							
				if (lemmesCandidats.isEmpty()){
					lemmesCandidats = getLemmeCandidats(token);
				}
				
				int length = lemmesCandidats.size();
				
				if (length == 1){
					newRequest[i][0] = lemmesCandidats.get(0);
					newRequest[i][1] = "1";
					
				} else if (length > 1){
					
					int check = 0 ;
					newRequest[i][1] = "1";
					
					do {
						int j = 0 ;			
						System.out.println("\nVeuillez choisir parmi les lemmes suivants :");
						for (j=0 ; j<length ; j++){
							System.out.println("lemme : "+lemmesCandidats.get(j));
						}
						// vérifier que la saisie correspond à l'un des lemmes candidats
						String newToken = Saisie.main(args);
						j = 0 ;
						while ((j < length) && (check != 1)){
							if (newToken.compareTo(lemmesCandidats.get(j)) == 0){
								newRequest[i][0] = lemmesCandidats.get(j);
								check = 1 ;
							} else {
								j++ ;
							}
						}
						
					} while (check != 1) ;
					
				}
			}
		}
		
		return newRequest ; 
	}
	
	// remove stopwords from the request
	public static String[][] removeStoplist(String[][] request, String file, int n){
		
		String token = new String();
		String[][] newRequest = new String[n][2];
		for (int i=0 ; i < n ; i++){
			newRequest[i][0] = request[i][0];
			newRequest[i][1] = request[i][1];
		}
		
		stoplist = Cat.readStopList(file);
		
		int m = n, k = 0, j = 0, l = 0, flag = 0 ;
		
		for (int i = 0; i < n ; i++) {
			token = request[i][0];
			k = 0 ; flag = 0 ;
			
			while ((k < stoplist.size()) && (flag == 0)){
				
				if (stoplist.get(k).equals(token)){
					
					// create smaller tab
					String[][] copyRequest = new String[m-1][2];
					
					// if first word in the sentence
					if (i == 0){
						for (j = i ; j < m-1 ; j++){
							copyRequest[j][0] = newRequest[j+1][0];
							copyRequest[j][1] = newRequest[j+1][1];
						}
					
					// if last word in the sentence
					} else if (i == n-1) {
						for (j = 0 ; j < m-1 ; j++){
							copyRequest[j][0] = newRequest[j][0];
							copyRequest[j][1] = newRequest[j][1];
						}						
						
					// other cases
					} else {

						j = 0 ;
						while (newRequest[j][0].equals(token) == false){
							copyRequest[j][0] = newRequest[j][0];
							copyRequest[j][1] = newRequest[j][1];
							j ++ ;
						}					
						
						while (j < m - 1){
							copyRequest[j][0] = newRequest[j+1][0];
							copyRequest[j][1] = newRequest[j+1][1];
							j ++ ;
						}
					}
					
					newRequest = copyRequest ;
					
					/*for (j = 0 ; j < newRequest.length ; j++){
						System.out.println(j+" "+newRequest[j][0]+" : "+newRequest[j][1]);
					}*/
					
					m = m-1 ;
					flag = 1 ;
				}
				k++ ;
			}
		}		
		return newRequest ; 
	}
	
	public Lexique() {
		lexique = new Hashtable<String,String>();
	}
	
	public Lexique(Hashtable<String,String> lex){
		lexique = new Hashtable<String,String>(lex) ;
	}
	
	public Lexique(String lexFile){
		lexique = new Hashtable<String,String>(Cat.readLexique(lexFile));
	}
	
	// look if word already exists in Lexique
	public static String getLemmeFromLexique(String word){
		String lemme = null ;
		Set<String> lex = lexique.keySet();
		for (String key: lex){
			if (key.equals(word)){
				lemme = new String(lexique.get(key)) ;
			}
		}
		return lemme ;
	}
	 
	// look for the best candidates with proximité orthographique algortihms
	public static List<String> getLemmeCandidats(String word){
		List<String> list = new ArrayList<String>() ;
		list = getLemmePrefixe(word);
		/*if (list.isEmpty()) {
			list = getLemmeLevenshtein(word);
		}*/
		return list ;
	}
	
	// méthode du préfixe
	public static List<String> getLemmePrefixe(String word){
		List<String> list = new ArrayList<String>();

		Set<String> lex = lexique.keySet();
		int scoreMin = 60 ;
		int bestScore = 0 ;
		int seuilLettresCommunes = 4 ;
		int i = 0, prox ;
		
		for (String key: lex){
			prox = 0 ;
			if (word.length() >= 3 && key.length() >= 3){
				if (Math.abs(word.length()-key.length()) <= 4){
					i = 0 ;
					while ((i < Math.min(word.length(),key.length())) && (word.charAt(i) == key.charAt(i))){
						i += 1 ;
					}
					if (i >= seuilLettresCommunes){
						prox = (i*100)/Math.max(word.length(),key.length());
					}
				}
			}
			//System.out.println(word+" "+key+" "+ i +" "+prox);
			if ( (prox >= scoreMin) && (prox >= bestScore)){
				if (prox == bestScore){
					list.add(lexique.get(key));
				} else {
					bestScore = prox ;
					list.clear();
					list.add(lexique.get(key));
				}
			}
		}
		
		return list ;
	}
	
	// méthode de Levenshtein 
	public static List<String> getLemmeLevenshtein(String word){
		List<String> list = new ArrayList<String>();
		
		Set<String> lex = lexique.keySet();
		int dist[][] ;
		int d1, d2, d3 ;
		
		for (String key : lex){			
			dist = new int[word.length()][lexique.get(key).length()];
			dist[0][0] = 0 ;
			for (int i=1; i<word.length(); i++){
				dist[i][0] = dist[i-1][0] + 1; 
			}
			for (int j=1; j<lexique.get(key).length(); j++){
				dist[j][0] = dist[0][j-1] + 1; 
			}
			for (int i=1; i<word.length(); i++){
				for (int j=1; j<lexique.get(key).length(); j++){
					d1 = dist[i-1][j-1]+1;
					d2 = dist[i-1][j]+1;
					d3 = dist[i][j-1]+1;
					dist[i][j] = Math.min(Math.min(d1,d2),d3);
				}
			}
			if (dist[word.length()-1][lexique.get(key).length()-1] <= 4){
				list.add(lexique.get(key));
			}
		}

		return list ;
	}
	
}
