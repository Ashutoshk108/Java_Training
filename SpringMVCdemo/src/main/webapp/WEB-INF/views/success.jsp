<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response Page</title>
</head>
<body>

	<h1>Welcome ${user.userName}!</h1>
	<h2>Your email address is ${user.email}</h2>
	<h2>Your mobile number is ${user.mobileNumber}</h2>
	<h3>We will contact you with a week!</h3>


</body>
</html>