

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.*;
import bean.*;

/**
 * Servlet implementation class cart_controller
 */
@WebServlet("/cart_controller")
public class cart_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cart_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		try {
			listcart(request,response);
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
	
	
	
	}

	
	
	/**********************************************************************************************************/	
    protected void listcart(HttpServletRequest request1, HttpServletResponse response1)throws SQLException, IOException, ServletException {
       ProductDAO obj=new ProductDAO();
       JunctionDAO obj1=new JunctionDAO();
    	
       try {
       HttpSession session=request1.getSession();
       int cid=Integer.parseInt(session.getAttribute("cid").toString());
       
       
       System.out.println("cart session id = " + cid);
       
    // int  cid=1043;
       
       List<Integer> products=obj1.listProducts(cid);
       
       
    	List<Product> cartPro = obj.getCart(products);
    	
	
        request1.setAttribute("cartPro", cartPro);
            
        RequestDispatcher dispatcher = request1.getRequestDispatcher("cart.jsp");
        dispatcher.forward(request1, response1);
       }
       
       catch(NullPointerException e)
       {
    	   response1.sendRedirect("cart.html");
    	   
    	   
    	   return;  			// if we dont return it will cause some exception 
								//Otherwise the code will continue to run and hit some session.getAttribute() method further down in the block causing exactly this exception.

       }
       
  }
 
	
	
	
    /**********************************************************************************************************/	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
