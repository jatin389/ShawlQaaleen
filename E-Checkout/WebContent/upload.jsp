<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
body
 {
background-image: url("upload.jpg");
margin: 0; padding: 0; 
  
 no-repeat center center fixed;
 webkit-background-size: cover;
 moz-background-size: cover; 
o-background-size: cover; 
background-size: cover; 
}. 

</style>

</head>
<body>
<center>
        <h1>File Upload to Database Demo</h1>
        <form method="post" action="FileUploadDBServlet" 
        enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td>Product Name: </td>
                    <td><input type="text" name="ProductName" size="50"/></td>
                </tr>
                <tr>
                    <td>Price: </td>
                    <td><input type="text" name="Price" size="50"/></td>
                </tr>
                <tr>
                    <td>Stock: </td>
                    <td><input type="text" name="Stock" size="50"/></td>
                </tr>
                <tr>
                    <td>Brand: </td>
                    <td><input type="text" name="Brand" size="50"/></td>
                </tr>
                <tr>
                    <td>Type: </td>
                    <td><input type="text" name="Type" size="50"/></td>
                </tr>
                <tr>
                    <td>Size: </td>
                    <td><input type="text" name="size" size="50"/></td>
                </tr>
                <tr>
                    <td>Image Name: </td>
                    <td><input type="text" name="image_name" size="50" required/></td>
                </tr>
                <tr>
                    <td>Portrait Photo: </td>
                    <td><input type="file" name="photo" size="50"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save">
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>