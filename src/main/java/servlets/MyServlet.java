package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count =0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LocalDateTime a=LocalDateTime.now();
		
		count++;
		PrintWriter res = response.getWriter();
		res.println("<html><body>");
		res.println("<b>hi iam mahmoud now time is "+a+"</b> <br> <hr size=1 color=red> </body>");
		res.println("<b>you are visitor  number : "+ count +"</b>");
		if (count == 10) {
			res.print("<b>mabrouk >>>>>>>>> </b> ");
		}
		res.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
