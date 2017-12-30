<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vinay JSP</title>
</head>
<body>
<%
Date date = new Date();
%>
<p> <font color ="red"> ${errorMessage}</font></p>
<form action="/login.do" method="post">
Enter your name : <input type = "text" name = "inputname"/>
Enter Password : <input type ="password"  name = "inputPassword"/>
<input type = "submit" value = "Login"/>
</form>
</body>
</html>