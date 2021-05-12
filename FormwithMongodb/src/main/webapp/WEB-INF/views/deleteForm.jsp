<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Form</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
</head>
<body>
<h2>Delete Form</h2>
<div style="border: 1px solid grey">
	<form:form method="POST" action="/deleteEmployee" modelAttribute="deleteForm">
		<table border="0">
			<tr>
				<td>Employee name: </td>
				<td><form:input path="employeeName"/></td>
			</tr>
			<tr></tr>
			<br>
			<tr>
				<td></td>
				<td><input class="btn btn-danger" type="submit" value="Delete"/></td>
			</tr>
		</table>
	</form:form>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
</div>
</body>
</html>