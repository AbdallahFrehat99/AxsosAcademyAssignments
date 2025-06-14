<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Product</title>
</head>
<body>
<h1>New Product</h1>

<a href = "/">Home</a>

<form:form action="/products/add" method="post" modelAttribute="product">
	<form:label path="name">Name:</form:label>
	<form:input path="name"/>
	
	<form:label path="description">Description:</form:label>
	<form:input path="description" />
	
	<form:label path="price">Price : </form:label>
	<form:input path="price" />
	
	<input type="submit" value="Submit" />
	
	<h3>Summary:</h3>

	<form:errors path="name"/>
	<br>
	<form:errors path="description"/>
	<br>
	<form:errors path="price"/>
</form:form>

</body>
</html>