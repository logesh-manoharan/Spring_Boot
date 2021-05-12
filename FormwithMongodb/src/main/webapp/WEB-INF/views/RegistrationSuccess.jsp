<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success Page</title>
</head>
<body>
<div style="border: 1px solid grey; padding: 10px;">
	<h2>Registered Successfully</h2>
	<tabel border="0">
		<tr>
			<td id="label">Employee Name:</td>
			<td> ${employeeForm.employeeName} </td>
		</tr>
		<br>
		<tr>
			<td id="label">Employee Age:</td>
			<td> ${employeeForm.age} </td>
		</tr>
		<br>
		<tr>
			<td id="label">Employee City:</td>
			<td> ${employeeForm.city} </td>
		</tr>
	</tabel>
</div>
</body>
<style>
* {
	font-family: "Century gothic";
}
td {
	font-size: 10px;
}
#label {
	font-style: bold;
}
</style>
</html>