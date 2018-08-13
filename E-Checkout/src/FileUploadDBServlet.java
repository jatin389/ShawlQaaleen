

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class FileUploadDBServlet
 */
@WebServlet("/FileUploadDBServlet")
@MultipartConfig(maxFileSize = 16177215)    
public class FileUploadDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	    private String dbUser = "echeck";
	    private String dbPass = "abcd";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUploadDBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String ProductName = request.getParameter("ProductName");
		String Price = request.getParameter("Price");
		String Stock = request.getParameter("Stock");
		String Brand = request.getParameter("Brand");
		String Type = request.getParameter("Type");
		String size = request.getParameter("size");
		String image_name=request.getParameter("image_name");
		InputStream inputStream = null;
		int id = 0;
		
		Part filePart = request.getPart("photo");
        if (filePart != null) {
        	System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
            
            inputStream = filePart.getInputStream();

        }
        Connection conn = null; 
        String message = null;  

        try {
        	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
        String sql = "INSERT INTO product (p_name, p_price, p_stock,p_brand,p_type,p_size,p_image,p_imagename) values (?,?,?,?,?,?,?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, ProductName );
        statement.setString(2, Price);
        statement.setString(3, Stock);
        statement.setString(4, Brand);
        statement.setString(5, Type);
        statement.setString(6, size);
        statement.setString(8, image_name);
        
        if (inputStream != null) {
            
            statement.setBinaryStream(7, inputStream,(int)filePart.getSize());
        }
        int row = statement.executeUpdate();
        /******************************************************************************************/
        
        
        
        sql="select max(p_id) from product";
        statement = conn.prepareStatement(sql);
        ResultSet rs=statement.executeQuery();
        if(rs.next())
        	id=rs.getInt(1);
        
        
        sql="select p_image from product where p_id=?";
        statement = conn.prepareStatement(sql);
        statement.setInt(1, id);
        
        rs=statement.executeQuery();
        
        if(rs.next())
        {
        	Blob b=rs.getBlob(1);
        	byte b1[]=new byte[(int)b.length()];
        	b1=b.getBytes(1, (int)b.length());
        		
        	String s=getServletContext().getRealPath("/");			// to get the current path on server
        	s=s+"img\\";
        		System.out.println(s);
        		System.out.println("image length: " + b.length());
        		File f=new File(s+image_name);
        		FileOutputStream fos=new FileOutputStream(f);      
        		fos.write(b1);
        		
        	fos.close();
        	
        	
        }
        		
        
        
        
        
        
        
        
        
        /******************************************************************************************/
        if (row > 0) {
            message = "File uploaded and saved into database";
        }
        } catch (SQLException ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            // sets the message in request scope
            request.setAttribute("Message", message);
             
            // forwards to the message page
            getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
        }
    }
}

