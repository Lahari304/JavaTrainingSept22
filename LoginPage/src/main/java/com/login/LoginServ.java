package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginserv")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public LoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if(username.compareTo("Lahari")==0 && password.compareTo("mmf123")==0) {
			out.println("<html><body>");
			out.println("<h1>Hello to "+username+"</h1>");
			out.println("</html></body>");
			
//			response.sendRedirect("success.html");
//			ServletContext sc = getServletContext();
//			sc.getRequestDispatcher("/success.html").forward(request, response);
		}
		else {
			out.println("<html><body>");
			out.println("<h1>Invalid credentials</h1>");
			out.println("</html></body>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
