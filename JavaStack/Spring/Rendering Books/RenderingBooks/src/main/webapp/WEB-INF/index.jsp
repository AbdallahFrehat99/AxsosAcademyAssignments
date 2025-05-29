<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reading Books</title>
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
<div class="table-container">
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
         <!-- loop over all the books to show the details as in the wireframe! -->
         <c:forEach var="book" items="${books}">
        	<tr>
        	    <td><c:out value="${book.id}"></c:out></td>
          		<td><c:out value="${book.title}"></c:out></td>
          		<td><c:out value="${book.language}"></c:out></td>
          		<td><c:out value="${book.numberOfPages}"></c:out></td>
          		
        	</tr>
        </c:forEach>
         
    </tbody>
</table>
</div>
</body>
</html>