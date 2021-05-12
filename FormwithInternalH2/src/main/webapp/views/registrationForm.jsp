<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<div style="border: 2px solid grey">
	<h2>Register</h2>
		<form action="addData">
			<input type="number" name="employeeId" placeholder="Employee ID"/>
			<input type="text" name="employeeName" placeholder="Employee Name"/>
			<input type="number" name="employeeAge" placeholder="Employee Age"/>
			<input type="submit" value="Register"/>
		</form>
	</div>
</body>
</html>