<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<f:form action="login" method="post" modelAttribute="user">
	Username : <f:input path="name"/><br/>
	Password : <f:password path="password"/><br/>
	<input type="submit" value="Submit">
</f:form>
</body>
</html>