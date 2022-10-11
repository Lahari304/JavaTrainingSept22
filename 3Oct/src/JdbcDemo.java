import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	
	public static void main(String [] args) {
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			String url = "jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String userName = "system";
			String password = "system";
			
			Connection con = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is successful");
			
//			Statement stmt = con.createStatement();
			
//			String query = "CREATE TABLE STUDENT("+
//								"STUD_ID VARCHAR2(6) PRIMARY KEY,"
//								+ "STUD_NAME VARCHAR2(20) NOT NULL,"
//								+ "ADDRESS VARCHAR2(20) NOT NULL,"
//								+ "BRANCH VARCHAR2(20) NOT NULL)";
			
//			String query = "INSERT INTO STUDENT VALUES('ST101', 'JOHN', "
//					+ "'BRAZIL', 'CS'";		
//			
//			stmt.execute(query);
//			System.out.println("Table 'Student' created");
			
			PreparedStatement stmt = con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?)");
			
			stmt.setString(1, "ST102");
			stmt.setString(2, "Pearl");
			stmt.setString(3, "UAE");
			stmt.setString(4, "ECE");
			
			int count = stmt.executeUpdate();
			
			System.out.println(count+ " row(s) inserted..");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
