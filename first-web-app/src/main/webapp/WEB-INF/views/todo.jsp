<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todo Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}

.footer .container {
width: auto;
max-width: 680px;
padding: 0 15px;
}
</style>
</head>
<body>
	<h1>Welcome ${name}</h1>
	<div>
		Your Todos are
		<ol>
			<c:forEach items="${todos}" var="todo">
				<li>${todo.name}<a href="/deletetodo.do?todo=${todo.name}">Delete</a></li>
			</c:forEach>
		</ol>

		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<form method="POST" action="/todo.do">
			New Todo : <input name="todo" type="text" /> <input name="add"
				type="submit" />
		</form>

	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>