import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet")
public class ServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public ServletClass() {
        super();
    }
    
    public void init() {
    	String msg = "Lahari";
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName	= request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(userName.isEmpty() || password.isEmpty())
		{
			out.println("<html><body>");
			out.println("<h1>Login Failed: Try again</h1>");
			out.println("/<body></html>");
		}
		else {
			out.println("<html><body>");
			out.println("<h1>Login Successful: Welcome "+userName + "!</h1>");
			out.println("/<body></html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
