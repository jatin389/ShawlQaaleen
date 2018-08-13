package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.*;
import static DriverProvider.Driver.*;

public class ProductDAO {
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
    

    public List<Product> listshawl() throws SQLException {
        List<Product> shawls = new ArrayList<>();
         
        String sql = "SELECT p_id, p_name, p_price,p_imagename FROM product where p_type='shawl'";
         
        connect();
         
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
            long id = resultSet.getLong("p_id");
            String name = resultSet.getString("p_name");
            String image = resultSet.getString("p_imagename");
            float price = resultSet.getFloat("p_price");             
            Product book = new Product(id,name,price,image);
            shawls.add(book);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return shawls;
    }
     




   
    
/**********************************************************************************/
    

    public List<Product> listcarpet() throws SQLException {
        List<Product> carpets = new ArrayList<>();
         
        String sql = "SELECT p_id, p_name, p_price,p_imagename FROM product where p_type='carpet'";
         
        connect();
         
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
            long id = resultSet.getLong("p_id");
            String name = resultSet.getString("p_name");
            String image = resultSet.getString("p_imagename");
            float price = resultSet.getFloat("p_price");             
            
            Product book = new Product(id,name,price,image);
            carpets.add(book);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return carpets;
    }
     




    /**********************************************************************************/




    public List<Product> getCart(List<Integer> products) throws SQLException {
        List<Product> cartPro = new ArrayList<>();
         
        connect();
        
        for(Integer pid:products)
        {
        
        
        String sql = "SELECT p_id, p_name, p_price,p_imagename FROM product where p_id=?";
        
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1, pid);        
       
        
        ResultSet resultSet = ps.executeQuery();
         
        while (resultSet.next()) {
            long id = resultSet.getLong("p_id");
            String name = resultSet.getString("p_name");
            String image = resultSet.getString("p_imagename");
            float price = resultSet.getFloat("p_price");     
            
            //object of product
            Product book = new Product(id,name,price,image);
            cartPro.add(book);
        }
        
        
        resultSet.close();
        ps.close();
        
        }
         
       
         
        disconnect();
         
        return cartPro;
    }
     





}
