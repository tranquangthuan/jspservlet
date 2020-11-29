<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${test}
	<table border="1" cellpadding="5" cellspacing="1">
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Price</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>
				<td><c:out value="${product.code}"></c:out> ${product.code}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td><a href="editProduct?code=${product.code}">Edit</a></td>
				<td><a href="deleteProduct?code=${product.code}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

	<a href="createProduct">Create Product</a>
</body>
</html>