<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
	<div class="jus">
		<h1>Welcome ${loggedUser.firstName}</h1>
		<a href="/logout">Log out</a>
	</div>
	<hr>
	<div class="jus">
		<h1>TalkTracker Dashboard</h1>
		<a href="/addtalk">Add a Talk</a>
	</div>

	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>Talk Title</th>
				<th>Talk Date</th>
				<th>Speaker</th>


			</tr>
			<hr>
		</thead>
		<tbody>

			<c:forEach var="talk" items="${talks}">
				<tr>
					<td><c:out value="${talk.id}"></c:out></td>
					<td><a href="/talk/${talk.id}">${talk.talkTitle}</a></td>
					<td><c:out value="${talk.talkDate}"></c:out></td>
					<td><c:out value="${talk.user.firstName}"></c:out></td>
				</tr>
				
			</c:forEach>
		</tbody>
	</table>

</body>
</html>