package com.jspDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	static Connection connect() throws SQLException {
		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		String url = "jdbc:oracle:thin@localhost:1521/orcl.iiht.tech";
		String username = "system";
		String password = "system";
		
		Connection con = DriverManager.getConnection(url, username,password);
		
		return con;
	}

}
