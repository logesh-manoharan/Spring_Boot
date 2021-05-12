<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration Form</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
</head>
<body>
<h1>Employee Registration Form</h1>
<div style="border: 1px solid grey; padding: 10px;" >
	<form:form action="register" method="post" modelAttribute="employeeForm">
		<table border="0">
			<tr>
				<td>Employee Name:</td>
				<td>
				<!-- 'path' value should be same as the variable in Model file -->
					<form:input path="employeeName"/> 
				</td>
			</tr>
			<tr></tr>
			<tr>
				<td>Age:</td>
				<td>
					<form:input path="age"/>
				</td>
			</tr>
			<tr></tr>
			<tr>
				<td>City</td>
				<td>
					<form:input path="city"/>
				</td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td><input type="submit" class="btn btn-primary" value="Register"/></td>
			</tr>
			
		</table>
	</form:form>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
</div>
</body>
<style>
* {
	font-family: "Century gothic";
}
input {
	padding: 6px;
	font-size: 15px;
	font-weight: bold;
}
td {
	font-size: 15px;
	font-style: italic;
}
</style>
</html>