<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
    <h2>Registration Form</h2>
	<form action="storeDetail" method="post">
		<span>Full Name:</span> <span><input type="text" name="fullname" /></span><br><br>
		<span>User name:</span> <span><input type="email" name="username" /></span><br><br>
		<span>Password:</span> <span><input type="password" name="password" /></span><br><br>
		<input type="submit" />
	</form>
</body>
<style>
* {
font-family: "Century gothic";
margin-left: 50px;
}
h2, input {
padding: 7px;
}
</style>
</html>