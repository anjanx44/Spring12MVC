<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>User Login</h1>
	${email}

	<form:form action="updateUser" method="post" modelAttribute="updateUser">
		<table>
			<tr>
				<td>name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>email</td>
				<td><form:input path="email" /></td>
			</tr>
			
			<tr>
				<td>age</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>address</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>gender</td>
				<td><form:input path="gender" /></td>
			</tr>
			<tr>
				<td>type</td>
				<td><form:input path="type" /></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td><button type="submit">Login</button></td>
			</tr>
		</table>
	</form:form>

</body>
</html>