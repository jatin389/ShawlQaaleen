

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerDAO;
import bean.*;
/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String name=request.getParameter("c_name");
		Long phone=Long.parseLong(request.getParameter("c_phone"));
		String address=request.getParameter("c_address");
		String email=request.getParameter("c_email");
		String pass=request.getParameter("c_pass");
		
		
		Customer obj=new Customer(name,email,pass,address,phone);
		CustomerDAO obj1=new CustomerDAO();
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		if(obj1.register(obj)>0)
		{
			
			   out.println("<script type=\"text/javascript\">");
			   out.println("alert('Successfully Registered.... click ok to go to Login Page');");
			   out.println("location='cust_login.html';");
			   out.println("</script>");
		}
		
		else
		{
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('Not Registered....');");
			   out.println("location='sign_up.html';");
			   out.println("</script>");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
