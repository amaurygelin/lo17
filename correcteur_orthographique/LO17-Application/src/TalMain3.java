import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;


public class TalMain3 {

public static String main(String arg) {
                //Scanner scanner = new Scanner(System.in);
                //System.out.print("Texte : ");
                //String s = scanner.nextLine();
               	String s = arg ;
               	String arbre = new String();
                //while (!s.equals("*")) {
                	try{
                		tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
                		CommonTokenStream tokens = new CommonTokenStream(lexer);
                		tal_sqlParser parser = new tal_sqlParser(tokens);
                		arbre = parser.listerequetes();
                		//System.out.println(arbre);
                	} catch(Exception e) {  }
            		return arbre ;
               //}
        }
}
