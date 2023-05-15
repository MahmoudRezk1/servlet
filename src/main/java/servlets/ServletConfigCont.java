package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ServletConfigCont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletConfigCont() {
        super();
    }
    
 
    
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email =getServletConfig().getInitParameter("email");
		String phone= getServletContext().getInitParameter("phone");
				
		PrintWriter res = response.getWriter();
		res.println("<html><body>");
		res.println("<b>your email : "+ email +"</b> <br>");
		res.println("<b>your phone : "+ phone +"</b>");
		res.println("</body>");
		res.println("</html>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
