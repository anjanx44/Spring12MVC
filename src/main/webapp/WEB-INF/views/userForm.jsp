<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BJIT</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<div class="container">
		<h2>User Input From</h2>
		<hr />
		<form:form action="saveUser" method="post" modelAttribute="user">
			<table class="table table-bordered table-striped">
				<tr>
					<th>Name</th>
					<td><form:input path="name" /> <form:errors path="name"
							cssClass="error" /></td>
				</tr>
				<tr>
					<th>Age</th>
					<td><form:input path="age" /> <form:errors path="age"
							cssClass="error" /></td>
				</tr>
				<tr>
					<th>Address</th>
					<td><form:textarea path="address"/> <form:errors path="address"
							cssClass="error" /></td>
				</tr>
				<tr>
					<th>Gender</th>
					<td><form:radiobutton path="gender" value="Male" label="Male" />
						<form:radiobutton path="gender" value="Female" label="Female" />
						<form:errors path="gender" cssClass="error" /></td>
				</tr>
				<tr>
					<th>Email</th>
					<td><form:input path="email" /> <form:errors path="email"
							cssClass="error" /></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><form:password path="password" /> <form:errors path="password"
							cssClass="error" /></td>
				</tr>
				<tr>
					<th>Type</th>
					<td><form:radiobutton path="type" value="user" label="User" />
						<form:radiobutton path="type" value="admin" label="Admin" />
						<form:errors path="type" cssClass="error" /></td>
				</tr>
				
				<tr>
					<td><button type="submit">Submit</button></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>