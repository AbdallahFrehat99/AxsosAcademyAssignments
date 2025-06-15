<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A Talk Details</title>
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
	<div class="jus">
		<h1>Welcome ${loggedUser.firstName}</h1>
		<a href="/logout">Log out</a>
	</div>

	<div>
		<h2>
			<c:out value="${talk.talkTitle}"></c:out>
			By ${talk.user.firstName} ${talk.user.lastName}
		</h2>
		<h3>
			<em>This Talk will be on <c:out value="${talk.talkDate}"></c:out></em>
		</h3>
		<p>
			<c:out value="${talk.talkDetails}"></c:out>
		</p>
	</div>
	<c:if test="${talk.user.id == sessionScope.loggedUser.id}">
		<div class="jus">
			<a href="/updatetalk/${talk.id}">Edit The Talk</a>
			<form action="/deletetalk/${talk.id}" method="post">
				<input type="hidden" name="_method" value="delete"> <input
					type="submit" value="Delete The Talk">
			</form>
		</div>
	</c:if>
</body>
</html>