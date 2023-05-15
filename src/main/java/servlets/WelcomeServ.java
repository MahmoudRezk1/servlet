package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class WelcomeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public WelcomeServ() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter res = response.getWriter();
		String name = request.getParameter("name");
		if(name.length()<4) {
			response.sendRedirect("small.html");
		}else {
			response.sendRedirect("welcome.html");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
