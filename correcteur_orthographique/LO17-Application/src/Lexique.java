import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Lexique {

	public static Hashtable<String,String> lexique ;
	
	public static void main(String args[]){
		String[] lex = new String[1];
		lex[0] = "test.txt";
		
		lexique = Cat.main(lex);
		
		String request = new String (Saisie.main(args));
		request = request.toLowerCase();
		
		StringTokenizer request_tokens = new StringTokenizer(request);
		String token = new String();
		
		while (request_tokens.hasMoreTokens()) {
			token = request_tokens.nextToken();
			
			List<String> lemmesCandidats = new ArrayList<String>();
			
			if (getLemmeFromLexique(token) != null){
				lemmesCandidats.add(getLemmeFromLexique(token));
			}
						
			if (lemmesCandidats.isEmpty()){
				lemmesCandidats = getLemmeCandidats(token);
			}
			
			int length = lemmesCandidats.size();
			
			if (length == 0){
				System.out.println("Pas de lemme candidat.");
			} else {
				for (int i=0 ; i<length ; i++){
					System.out.println("lemme : "+lemmesCandidats.get(i));
				}
			}
		}
	}
	
	public Lexique() {
		lexique = new Hashtable<String,String>();
	}
	
	public Lexique(Hashtable<String,String> lex){
		lexique = lex ;
	}
	
	public Lexique(String[] lexFile){
		lexique = Cat.main(lexFile);
	}
		
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
	
	public static List<String> getLemmeCandidats(String word){
		List<String> list = new ArrayList<String>() ;
		list = getLemmePrefixe(word);
		//if (list.isEmpty()) {
		//	list = getLemmeLevenshtein(word);
		//}
		return list ;
	}
	
	public static List<String> getLemmePrefixe(String word){
		List<String> list = new ArrayList<String>();

		Set<String> lex = lexique.keySet();
		int scoreMin = 60 ;
		int seuilLettresCommunes = 4 ;
		int i = 0, prox ;
		
		for (String key: lex){
			prox = 0 ;
			if (word.length() >= 3 && lexique.get(key).length() >= 3){
				if (Math.abs(word.length()-lexique.get(key).length()) <= 4){
					i = 0 ;
					while ((i < Math.min(word.length(),lexique.get(key).length())) && (word.charAt(i) == lexique.get(key).charAt(i))){
						i += 1 ;
					}
					if (i >= seuilLettresCommunes){
						prox = (i*100)/Math.max(word.length(),lexique.get(key).length());
					}
				}
			}
			System.out.println(word+" "+lexique.get(key)+" "+ i +" "+prox);
			if (prox >= scoreMin){
				list.add(lexique.get(key));
			}
		}
		
		return list ;
	}
	
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
			// comment choisir le seuil maximal de distance? 
			// bug à ce test
			if (dist[word.length()][lexique.get(key).length()] <= 4){
				list.add(lexique.get(key));
			}
		}

		return list ;
	}
	
}
