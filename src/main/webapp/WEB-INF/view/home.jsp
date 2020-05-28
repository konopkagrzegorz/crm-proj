<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<head>
 <link href="resources/css/style.css" rel="stylesheet" type="text/css" />
 <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
<body>
	<div id="container">
		<div id="header">
			<h2>CRM Main App</h2>
		</div>
		<div id="main-page">
			<h1>Welcome to CRM Home Page</h1>
			<div class="square">
			<a href="/spring-crm-project/login">Go to Login page</a>
			</div>
			<div id="square">
				<a href="/spring-crm-project/info">Go to General Info</a>
			</div>
		</div>
		<div id="footer">
			<p> Property of "Company". All rights reserved</p>
		</div>
	</div>
</body>
</html>
