<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome, again</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
	<h2 class="center">Welcome <c:out value="${name}"/>!</h2>
</body>
</html>