//Caleb Miller//
package java.util;

import java.io.IOException;
import javax.jws.WebService;
import javax.servlet.Servlet*
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet*;


@WebService("/creditCard")
public class creditCard extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ServletResponse response;

    public creditCard() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	response.setContentType("text/html");  
	java.io.printWriter pw = response.getWriter(); 
	
	try{  
	    String Fname = request.getParameter("fname");  
	    String Lname = request.getParameter("lname");
	    String CCard = request.getParameter("creditCard");
	}
}