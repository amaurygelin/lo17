import java.sql.*;

public class interrogPostgresql  {
	public static void main(String arg) throws SQLException {

	String username;
	String password;
	String url;

	// ---- configure START
	
	username = "lo17xxx";
	password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
	// Syntax: jdbc:TYPE:machine:port/DB_NAME
	url = "jdbc:postgresql://tuxa.sme.utc/dblo17";

	String requete = arg;
	
	// Code pour saisir la requête SQL directement
	/*BufferedReader br=null;
	try {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("requete : ");
			requete=br.readLine();
		} 
		catch(EOFException e) {
			br.close();
		}
	} 
	catch(IOException e) {
		System.out.println("IO Exception");
	}*/

	// INSTALL/load the Driver (Vendor specific Code)
	try {
		Class.forName("org.postgresql.Driver");
	} catch(java.lang.ClassNotFoundException e) {
	System.err.print("ClassNotFoundException: ");
	System.err.println(e.getMessage());
	}

	try {
		Connection con;
		Statement stmt;
	    
		// Establish Connection to the database at URL with usename and password
		con = DriverManager.getConnection(url, username, password);
		stmt = con.createStatement();
		 // Send the query and bind to the result set
		ResultSet rs = stmt.executeQuery(requete);
		ResultSetMetaData metadata = rs.getMetaData();
		int nbFields = metadata.getColumnCount();
		String[] fieldsNames = new String[nbFields+1];
		for (int i = 1; i <= nbFields; i++) {
			fieldsNames[i] = metadata.getColumnName(i);
		}
		while (rs.next()) {
			for (int i = 1; i <= nbFields; i++) {
				String s = rs.getString(fieldsNames[i]);
				System.out.print(s);
				System.out.print("\t");	
			}
			System.out.println();
		}
	// Close resources
	stmt.close();
	con.close();
	    
	} 
	// print out decent erreur messages
	catch(SQLException ex) {
		System.err.println("==> SQLException: ");
		while (ex != null) {
		System.out.println("Message:   " + ex.getMessage ());
		System.out.println("SQLState:  " + ex.getSQLState ());
		System.out.println("ErrorCode: " + ex.getErrorCode ());
		ex = ex.getNextException();
		System.out.println("");
		}
	}

	}
}
