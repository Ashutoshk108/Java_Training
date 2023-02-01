<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
</head>
<body>
	<h2>About</h2>

	<%
	String aboutVar = (String) request.getAttribute("aboutKey");
	List<String> friends = (List<String>) request.getAttribute("f");
	%>

	<h2><%=aboutVar%></h2>

	<%
	for (String s : friends) {
		out.println(s);
	}
	%>
</body>
</html>