<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		 <c:forEach var="shawl" items="${shawls}">
		 
		
   
   <c:set var="path" value="${shawl.p_imagename}" scope="request"/>
		 	
		 	<% String p=request.getAttribute("path").toString();
		 	p="img\\"+p+"  ";	
		 	out.print(p);
		 	%>

		 
		 	
		 
		 	<tr>
		 	
		 		<td><c:out value="${shawl.p_name}"/></td>
		 		<td><c:out value="${shawl.p_price}"/></td>
		 		<td>col3</td>
		 	
		 	</tr>
		 
		 
		 
		 </c:forEach>
	
	
	
	</table>

</body>
</html>