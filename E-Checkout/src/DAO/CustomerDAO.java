package DAO;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import bean.*;
import static DriverProvider.Driver.*;

public class CustomerDAO {
	
		private String driver=DRIVER;
	    private String url= CONNECTION_URL;
	    private String username=USERNAME;
	    private String password=PASSWORD;
	    private Connection conn =null;
		
/***************************************************************************************************/
	    
	    protected void connect() throws SQLException {
	        if (conn == null || conn.isClosed()) {
	            try {
	                Class.forName(driver);
	            } catch (ClassNotFoundException e) {
	                throw new SQLException(e);
	            }
	            conn = DriverManager.getConnection(url, username, password);
	        }
	    }
	     
	    
	    
/**********************************************************************************/
	    protected void disconnect() throws SQLException {
	        if (conn!= null &&!conn.isClosed()) {
	            conn.close();
	        }
	    }
	     
	    
	    
	    
/**********************************************************************************/
	    
	    
	    public Map checkUser(String email, String pass )
	    {
	    	boolean flag=false;
	    	int cid=0;
	    	String cname;
	    	
	    	Map map=new HashMap();
	    	
	    	try {
	    	connect();
	    	
	    	
	    	
	    	String sql="select c_id,c_name from customer where c_email=? and c_pass=? ";
	    	
	    	PreparedStatement ps=conn.prepareStatement(sql);
	    	
	    	ps.setString(1, email);
	    	ps.setString(2, pass);
	    	ResultSet rs=ps.executeQuery();
	    	
	    	
	    	flag=rs.next();
	    	
	    	if(flag) {
	    		cid=rs.getInt(1);
	    		cname=rs.getString(2);
	    		
	    		map.put("cid", cid);
	    		map.put("cname", cname);
	    		map.put("cemail", email);
	    		
	    	}
	    	
	    	
	    	disconnect();
	    	
	    	
	    	
	    	}
	    	
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	
	    //	return cid;
	    	return map;
	    }
	    
	    
/*************************************************************************/
	    public int register(Customer obj)
	    {
	    	int rows=0;
	    	try {
	    		connect();
	    		String sql="insert into customer(c_name,c_email,c_pass,c_address,c_phone) values(?,?,?,?,?)";
	    		PreparedStatement ps=conn.prepareStatement(sql);
	    		ps.setString(1, obj.getC_name());
	    		ps.setString(2, obj.getC_email());
	    		ps.setString(3, obj.getC_pass());
	    		ps.setString(4, obj.getC_address());
	    		ps.setLong(5, obj.getC_phone());
	    		
	    		System.out.println(obj.getC_name() + obj.getC_email() + obj.getC_pass()  +obj.getC_address() +obj.getC_phone());
	    		
	    		rows=ps.executeUpdate();  
	    		disconnect();
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	
	    	return rows;
	    }

}
