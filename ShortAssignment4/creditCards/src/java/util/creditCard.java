package java.util;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.jws.WebService;
import javax.servlet.http.HttpServlet;

@WebService("/creditCard")
public class creditCard extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ServletResponse response;

    /**
     * Default constructor. 
     */
    public creditCard() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	//this code allows the servlet to save the credit information on a html
	response.setContentType("text/html");  
	java.io.printWriter pw = response.getWriter(); 
	
	try{  
	    String Fname = request.getParameter("fname");  
	    String Lname = request.getParameter("lname");
	    String CCard = request.getParameter("creditCard");
	}
}