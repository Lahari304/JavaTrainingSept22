package com.LoginDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserLoginPage")
public class UserLoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserLoginPage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String username = request.getParameter("uname");
			String password = request.getParameter("pwd");
			Connection con = DBConnect.connect();

			String query = "Select * from student where STUD_NAME=\'"+username+"\'";
			Statement stmt = con.createStatement();
			
			ResultSet values = stmt.executeQuery(query);

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			if(!values.next() || values.getString(5).compareTo(password)!=0) {
				out.println("<html><body>");
				out.println("<h4>Invalid Cresentials: Login Failed</h4>");
				out.println("</html></body>");
			}
			else {
				out.println("<html><body>");
				out.println("<h4>Welcome "+username+"</h4>");
				out.println("</html></body>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
