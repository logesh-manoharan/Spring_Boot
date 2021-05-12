<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Employee Form</title>
</head>
<body>
	<div style="border: 2px solid grey">
		<h2> ${ title } </h2>
		<form action="${ method }">
			<input type="number" name="employeeId" placeholder="Employee ID"/>
			<input type="submit"/>
		</form>
	</div>
</body>
</html>