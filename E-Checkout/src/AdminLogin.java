

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		
/*		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(email.equals("admin@gmail") && pass.equals("abc123"))	
			out.println("<html><body><h1>admin success....</h1></body></html>");
		else
			out.println("<html><body><h1> admin not .......success....</h1></body></html>");
*/
		

		
		
		if(email.equals("ad@gmail") && pass.equals("123"))
		{
			RequestDispatcher rd =request.getRequestDispatcher("adminwork.jsp");
			rd.forward(request, response);
		}
		
		else
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
	//		out.println("<h2>invalid credentials....</h2>");
			
	/*		RequestDispatcher rd1 =request.getRequestDispatcher("addminx.html");
			rd1.include(request, response);
*/
			
			   out.println("<script type=\"text/javascript\">");
			   out.println("alert('Email or password incorrect');");
			   out.println("location='addminx.html';");
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
