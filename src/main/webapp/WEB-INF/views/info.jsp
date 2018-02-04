<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BJIT</title>
</head>
<body>
	<h1>User Information</h1>
	<table>
		<tr>
			<td>Name</td>
			<td>${user.name}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${user.email}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${user.age}</td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>${user.gender}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${user.address}</td>
		</tr>
		<tr>
			<td>Type</td>
			<td>${user.type}</td>
		</tr>
		
	</table>
		<a href="/Spring12MVC/user">Add User</a>
		<a href="/Spring12MVC/viewUser">ViewAll</a>
</body>
</html>