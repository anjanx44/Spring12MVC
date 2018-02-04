<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" width="100%">
		<tr>
			<th>name</th>
			<th>age</th>
			<th>address</th>
			<th>gender</th>
			<th>email</th>
			<th>password</th>
			<th>type</th>
			<th>Operations</th>
		</tr>
		<c:forEach var="row" items="${userList}">
			<tr>
				<td><c:out value="${row.name}" /></td>
				<td><c:out value="${row.age}" /></td>
				<td><c:out value="${row.address}" /></td>
				<td><c:out value="${row.gender}" /></td>
				<td><c:out value="${row.email}" /></td>
				<td><c:out value="${row.password}" /></td>
				<td><c:out value="${row.type}" /></td>
				<td>
				
				<a  href='<c:url value='/delete?email=${row.email}'></c:url>' onclick="if (confirm('Want to delete?')){ return true; }else { return false; }">Delete</a>
				<a  href='<c:url value='/update?email=${row.email}'></c:url>' onclick="if (confirm('Want to update?')){ return true; }else { return false; }">Update</a>
				</td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>