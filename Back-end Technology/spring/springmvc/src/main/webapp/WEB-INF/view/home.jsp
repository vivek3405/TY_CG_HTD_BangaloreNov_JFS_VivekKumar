<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>   
<jsp:useBean id="user" class="com.capgemini.springmvc.beans.User" scope="session"/>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome <%=user.getName()%></h1>
	<h2><%=user.getEmail()%></h2>
	<h2><%=user.getGender()%></h2>
</body>
</html>