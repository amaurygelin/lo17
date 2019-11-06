import java.io.*;
import java.util.Hashtable;

class Cat{
     public static Hashtable<String,String> main(String[] args) {
    	
	     BufferedReader br=null;
	     String chaine;
	     String[] string ;
	     Hashtable<String,String> table = new Hashtable<String,String>();
	     
	     try {
	          try {
	              br = new BufferedReader(new FileReader(args[0]));
	               while ((chaine=br.readLine())!=null){
	            	   string = chaine.split("\t");
	            	   table.put(string[0], string[1]);
	               }
	          } catch(EOFException e) {
	               br.close();
	          } 
	     } catch(FileNotFoundException e) {
	          System.out.println("fichier inconnu : " + args[0]);
	     } catch(IOException e) {
	          System.out.println("IO Exception");
	     }
	     
	     return table ;
     }
}