<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Category</title>
</head>
<body>
<h1>New Category</h1>

<a href = "/">Home</a>

<form:form action="/categories/add" method="post" modelAttribute="category">
	<form:label path="name">Name:</form:label>
	<form:input path="name"/>
	
	
	<input type="submit" value="Submit" />
	
	<h3>Summary:</h3>

	<form:errors path="name"/>
	
</form:form>
</body>
</html>