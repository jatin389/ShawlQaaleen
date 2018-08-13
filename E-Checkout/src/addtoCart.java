

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DAO.*;
/**
 * Servlet implementation class addtoCart
 */
@WebServlet("/addtoCart")
public class addtoCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addtoCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session=request.getSession();
		int cid=Integer.parseInt(session.getAttribute("cid").toString());
		
		
		 int pid = Integer.parseInt(request.getParameter("pid"));
		 String page=request.getParameter("name");
		 
		 
		 System.out.println("pid  = "  + pid  + " name =" + page);
		 
		 
		 JunctionDAO obj=new JunctionDAO();
		 int f=0;
		 
		 try {
		 f=obj.addProduct(cid,pid);
		 }
		 
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 
		 
		 
		 PrintWriter out=response.getWriter();
			response.setContentType("text/html");
		 
			
		RequestDispatcher rd=request.getRequestDispatcher("shop.jsp");
		
/*			if(page.equals("shawl")) {
				 request.setAttribute("pid", pid); 
				rd=request.getRequestDispatcher("shawl.jsp");
			}
			else
			{
				 request.setAttribute("pid", pid); 
				 rd=request.getRequestDispatcher("carpet.jsp");
			}
			
		
		 
		 if(f>0)
		 {
			 request.setAttribute("message", "ADDED TO CART");
		 }
		 else
		 {
			 request.setAttribute("message", "NOT ADDED");
		 }
	
		*/ 
		
		 
		 if(f>0)
		 {
			 out.println("<script type=\"text/javascript\">");
			   out.println("alert('ADDED TO CART...!!!');");
			   out.println("location='shop.jsp';");
			   out.println("</script>");
		 }
		 
		 else
		 {
			 out.println("<script type=\"text/javascript\">");
			   out.println("alert('NOT ADDED... Please try after some time...');");
			   out.println("location='shop.html';");
			   out.println("</script>");
		 }
	
		 
		// rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
