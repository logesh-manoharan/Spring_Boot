<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Form</title>
</head>
<body>
	<div style="border: 2px solid grey">
		<h2>Confirmation Page</h2><br>
		<table border="0">
			<tr>
				<td>Employee ID: </td>
				<td>${employee.employeeId}</td>
			</tr>
			<tr>
				<td>Employee Name: </td>
				<td>${employee.employeeName}</td>
			</tr>
			<tr>
				<td>Employee Age: </td>
				<td>${employee.employeeAge}</td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td>
					<a href="/">Go to Home</a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>