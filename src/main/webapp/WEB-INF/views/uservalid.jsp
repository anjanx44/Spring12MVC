<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BJIT</title>
</head>
<body>
	<h2>User Success From</h2>
	<hr />

	<table>
		<tr>
			<th>Name</th>
			<td>${user.name}</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>${user.email}</td>
		</tr>
		<tr>
			<th>Gender</th>
			<td>${user.gender}</td>
		</tr>
		
	</table>
</body>
</html>