<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>New Dojo</title>
  <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

  <div class="container">
  <div>
    <h1>Dojos</h1>
    <h2><a href="/ninjas/new">Add Ninja</a></h2>
    </div>

    <table >
      <thead>
        <tr>
          <th>Dojo Name</th>
          <th>Action</th>
        </tr>
      </thead>
      <tbody>

		<c:forEach var="dojo" items="${dojos}">
        	<tr>
        	    <td><c:out value="${dojo.name}"></c:out></td>
          		<td><a href="/dojos/${dojo.id}">Show Ninjas</a></td>
        	</tr>
        </c:forEach>
      </tbody>
    </table>



<form:form action="/dojos/new" method="post" modelAttribute="dojo">
    <h2>New Dojo:</h2>
	<p>
		<div class="inputs">
        	<form:label path="name">Name: </form:label>        
        	<form:textarea path="name" />
        </div>
        <form:errors path="name" cssClass="error"/>
    </p>
    <input Class="button" type="submit" value="Submit"/>
</form:form>
    

  </div>
</body>
</html>
