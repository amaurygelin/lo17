import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class Cat{
     public static Hashtable<String,String> readLexique(String arg) {
    	
	     BufferedReader br=null;
	     String chaine;
	     String[] string ;
	     Hashtable<String,String> table = new Hashtable<String,String>();
	     
	     try {
	          try {
	              br = new BufferedReader(new FileReader(arg));
	               while ((chaine=br.readLine())!=null){
	            	   string = chaine.split("\t");
	            	   table.put(string[0], string[1]);
	               }
	          } catch(EOFException e) {
	               br.close();
	          } 
	     } catch(FileNotFoundException e) {
	          System.out.println("fichier inconnu : " + arg);
	     } catch(IOException e) {
	          System.out.println("IO Exception");
	     }
	     
	     return table ;
     }
     
     public static List<String> readStopList(String arg) {
     	
	     BufferedReader br=null;
	     String chaine;
	     List<String> table = new ArrayList<String>();
	     
	     try {
	          try {
	              br = new BufferedReader(new FileReader(arg));
	               while ((chaine=br.readLine())!=null){
	            	   table.add(chaine);
	               }
	          } catch(EOFException e) {
	               br.close();
	          } 
	     } catch(FileNotFoundException e) {
	          System.out.println("fichier inconnu : " + arg);
	     } catch(IOException e) {
	          System.out.println("IO Exception");
	     }
	     
	     return table ;
     }
}