
import DAO.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CustLogin
 */
@WebServlet("/CustLogin")
public class CustLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustLogin() {
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
		
		CustomerDAO obj=new CustomerDAO();
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		//RequestDispatcher rs=request.getRequestDispatcher("cust_login.html");
		
		//int cid=obj.checkUser(email,pass);
		Map map=obj.checkUser(email,pass);
		
		if(!map.isEmpty())	
		{
			int cust_id=Integer.parseInt(map.get("cid").toString());
			String cust_name=map.get("cname").toString();
			
			
			HttpSession session=request.getSession();
			session.setAttribute("cid", cust_id);
			session.setAttribute("cname", cust_name);
			session.setAttribute("cemail", email);
			
		//	RequestDispatcher rs=request.getRequestDispatcher("shop.html");
			RequestDispatcher rs=request.getRequestDispatcher("index2.jsp");
			rs.forward(request, response);
	//		out.println("<html><body><h1>success....</h1></body></html>");
		}
		else
		{
//			response.setContentType("text/html/css");
	//		PrintWriter out=response.getWriter();
			
			out.println("<h2 style='color:red;'>invalid credentials....</h2>");
			
			RequestDispatcher rd1 =request.getRequestDispatcher("cust_login.html");
			rd1.include(request, response);

		}
		}
		
		
		//rs.include(request, response);
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
