package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.*;
import static DriverProvider.Driver.*;




public class JunctionDAO {

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
    
    public List<Integer> listProducts(int cid) throws SQLException {
        List<Integer> products = new ArrayList<>();
         
        String sql = "SELECT pid FROM junction where cid=?";
         
        connect();
         
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1, cid);
        
        ResultSet resultSet = ps.executeQuery();
         
        while (resultSet.next()) {
            int pid=resultSet.getInt(1);
            products.add(pid);
        }
         
        resultSet.close();
        ps.close();
         
        disconnect();
         
        return products;
    }
     
	
	





/**********************************************************************************/

public int addProduct(int cid,int proid) throws SQLException {
    
     
    String sql = "insert into junction values(?,?)";
    int row=0; 
    
    connect();
     
    PreparedStatement ps=conn.prepareStatement(sql);
    ps.setInt(1, cid);
    ps.setInt(2,proid);
    
    row= ps.executeUpdate();
     

    ps.close();
     
    disconnect();
     
    return row;
}
 


}

