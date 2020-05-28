<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRM Login Page</title>
</head>
<body>
<h1>Welcome to CRM Login Page</h1>
<body>
   <h1>Login</h1>
   <form:form action="/spring-crm-project/authenticateTheUser" method="POST">
	<c:if test="${param.error != null}">
	
	<i class="failed">Sorry! You entered invalid username or password...</i>
	</c:if>
	<p> User name: <input type="text" name="username"></p>
	<p> Password: <input type="text" name="password"></p>
	<input type="submit" value="Login"></input>
	</form:form>
</body>
</body>
</html>