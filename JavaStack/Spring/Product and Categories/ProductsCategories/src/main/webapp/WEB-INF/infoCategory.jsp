<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Categoty Page</title>
</head>
<body>
	<h1>${category.name}</h1>

	<a href="/">Home</a>

	<h2>Products:</h2>
	<c:forEach var="product" items="${products}">
			<p>- ${product.name}</p>
	</c:forEach>
	<form action="/addProduct/${category.id}" method="post">
		<h2>Add Product:</h2>
		<select name="product">
			<c:forEach var="product" items="${restProducts}">
				<option value="${product.id}">
                        ${product.name} 
                    </option>
			</c:forEach>
		</select>
		<input type="submit" value="Add" />
	</form>

</body>
</html>