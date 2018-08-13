

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductDAO;
import bean.Product;

/**
 * Servlet implementation class carpet
 */
@WebServlet("/carpet")
public class carpet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public carpet() {
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
			listCarpet(request,response);
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}
	
	
	/**********************************************************************************************************/	
    protected void listCarpet(HttpServletRequest request1, HttpServletResponse response1)throws SQLException, IOException, ServletException {
       ProductDAO obj=new ProductDAO();
    	
    	List<Product> carpets = obj.listcarpet();
        request1.setAttribute("carpets", carpets);
        
        request1.setAttribute("pid",0);
        
     /*   HttpSession session=request1.getSession();
        	String ses=session.getAttribute("cid").toString();
        	
        	System.out.println("session id" + ses);
       */ 	
        
        RequestDispatcher dispatcher = request1.getRequestDispatcher("carpet.jsp");
        dispatcher.forward(request1, response1);
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
