<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Page</title>
</head>
<body>

	<h1>${product.name}</h1>
	<a href="/">Home</a>

	<h2>Categories:</h2>
	<c:forEach var="category" items="${categories}">
		
			<p>- ${category.name}</p>
		
	</c:forEach>
	<form action="/addCategory/${product.id}" method="post">
	<h2>Add Category:</h2>
		<select name="category" >
			<c:forEach var="category" items="${restCategories}">
				<option value="${category.id}">
                        ${category.name} 
                    </option>
			</c:forEach>
		</select>
	<input type="submit" value="Add" />
		
	</form>

</body>
</html>


