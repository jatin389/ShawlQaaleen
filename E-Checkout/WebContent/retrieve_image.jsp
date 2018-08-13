<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 


 <html>
 <head>
 <style type="text/css">
 	.pic{
 		height: 20px;
    width: 50%;
 	}
 
 </style>
 
 </head>  
 <body>  
     <div class="pic" >
     
      <%
            Connection connection = null;     

            String connectionURL = "jdbc:oracle:thin:@localhost:1521:xe";

            ResultSet rs = null;
      
            PreparedStatement psmnt = null;

            try {

                Class.forName("oracle.jdbc.driver.OracleDriver");

                connection = DriverManager.getConnection(connectionURL, "echeck", "abcd");
                psmnt = connection.prepareStatement("SELECT p_image FROM product WHERE p_id = ?");

                psmnt.setInt(1, 5022);
          //      psmnt.setInt(2, 5023);
                rs = psmnt.executeQuery();
                if(rs.next()) {
                      byte[] bytearray = new byte[1048576];
                      int size=0;
                      InputStream sImage = rs.getBinaryStream(1);
                      //response.reset();
                      response.setContentType("image/jpeg");

                      while((size=sImage.read(bytearray))!= -1 ){

                            response.getOutputStream().write(bytearray,0,size);
				      }
			    }
		    }
            catch(Exception ex){
				out.println("error :"+ex);
            }
	
           finally {
                // close all the connections.
                rs.close();
                psmnt.close();
                connection.close();
           }
			
     %>
     
     </div>
	</body>
	</html>