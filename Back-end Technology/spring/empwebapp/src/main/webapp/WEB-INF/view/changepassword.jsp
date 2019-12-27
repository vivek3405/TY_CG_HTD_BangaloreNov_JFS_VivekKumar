<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./home">Home</a>
	<a href="./logout" style="float: right">Logout</a>
	<form action="./changepassword">
		<table>
			<tr>
				<td>Enter Password</td>
				<td> <input type="password" name="password"></td>
				<td> <input type="submit" value="change password"></td>
			</tr>
		</table>

	</form>
</body>
</html>