<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${pageContext.request.contextPath}
	<c:if test="${not empty product}">
		<form method="POST" action="editProduct">
			<input type="hidden" name="code" value="${product.code}" />
			<table border="0">
				<tr>
					<td>Code</td>
					<td style="color: red;">${product.code}</td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" value="${product.name}" /></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><input type="text" name="price" value="${product.price}" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit" /> <a
						href="productList">Cancel</a></td>
				</tr>
			</table>
		</form>
	</c:if>
</body>
</html>