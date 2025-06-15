<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login & Registration</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<h1>Login & Registration</h1>
	<div class="reg">
		<form:form action="/userlogin" method="post"
			modelAttribute="userLogin">
			<div class="field">
				<form:label path="email">Email:</form:label>
				<form:input path="email" />
			</div>
			<br>
			<div class="field">

				<form:label path="password">Password: </form:label>
				<form:input path="password" type="password" />
			</div>
			<br>

			<input type="submit" value="Login" />

			<h3>Summary:</h3>

			<form:errors path="email" />
			<br>
			<form:errors path="password" />
			<br>

		</form:form>


		<form:form action="/usersignup" method="post"
			modelAttribute="userSignup">
			<div class="field">

				<form:label path="firstName">First Name:</form:label>
				<form:input path="firstName" />
			</div>

			<br>
			<div class="field">

				<form:label path="lastName">Last Name:</form:label>
				<form:input path="lastName" />
			</div>

			<br>
			<div class="field">

				<form:label path="password">password: </form:label>
				<form:input path="password" type="password" />
			</div>

			<br>
			<div class="field">

				<form:label path="confirmPassword">confirm password: </form:label>
				<form:input path="confirmPassword" type="password" />
			</div>

			<br>
			<div class="field">

				<form:label path="email">email:</form:label>
				<form:input path="email" />
			</div>

			<br>
			<input type="submit" value="Sign up" />

			<h3>Summary:</h3>

			<form:errors path="firstName" />
			<br>
			<form:errors path="lastName" />
			<br>
			<form:errors path="password" />
			<br>
			<form:errors path="email" />
			<br>
			<form:errors path="confirmPassword" />
		</form:form>
	</div>

</body>
</html>