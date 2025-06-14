<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Home Page</h1>

	<a href="/products/new">New Product</a>
	<br>
	<a href="/categories/new">New Category</a>
	<hr>
	<c:set var="maxSize"
		value="${fn:length(products) > fn:length(categories) ? fn:length(products) : fn:length(categories)}" />

	<table border ="1">
		<tr>
			<th>Product</th>
			<th>Category</th>
		</tr>
		<c:forEach var="i" begin="0" end="${maxSize - 1}">
			<tr>
				<td><c:if test="${i < fn:length(products)}">
						<a href="/products/${products[i].id}">${products[i].name}</a>
					</c:if></td>
				<td><c:if test="${i < fn:length(categories)}">
						<a href="/categories/${categories[i].id}">${categories[i].name}</a>
					</c:if></td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>