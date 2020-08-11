<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		response.setHeader("cache-control", "no-cache, no-store, must-revalidate");

	if (session.getAttribute("usr") == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	Welcome ${usr} !

	<form action="logout">

		<input type="submit" value="logout">

	</form>

</body>
</html>