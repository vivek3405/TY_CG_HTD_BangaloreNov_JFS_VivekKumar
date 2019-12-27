<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./register" method="post" style="margin-top: 60px">
		<h1 style="color: royalblue; margin-left: 39%;">Registration Form</h1>
		<fieldset style="width: 25%; margin-left: 35%; margin-top: 20px">
			<legend>Employee Details</legend>
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
		</fieldset>
		<fieldset style="width: 25%; margin-left: 35%; margin-top: 20px">
			<legend>Permanent Address</legend>
			<table>
				<tr>
					<td>Address type:</td>
					<td><select name="addressBeans[0].addType">
							<option value="select">---select---</option>
							<option value="P">permanent</option>
							<option value="T">temporary</option>
					</select></td>
				</tr>
				<tr>
					<td>Address1:</td>
					<td><input type="text" name="addressBeans[0].address1"></td>
				</tr>
				<tr>
					<td>Address2:</td>
					<td><input type="text" name="addressBeans[0].address2"></td>
				</tr>
			</table>
		</fieldset>
		<fieldset style="width: 25%; margin-left: 35%; margin-top: 20px">
			<legend>Temporary Address</legend>
			<table>
				<tr>
					<td>Address type:</td>
					<td><select name="addressBeans[1].addType">
							<option value="select">---select---</option>
							<option value="T">temporary</option>
							<option value="P">permanent</option>
					</select></td>
				</tr>
				<tr>
					<td>Address1:</td>
					<td><input type="text" name="addressBeans[1].address1"></td>
				</tr>
				<tr>
					<td>Address2:</td>
					<td><input type="text" name="addressBeans[1].address2"></td>
				</tr>
			</table>
		</fieldset>
		<input type="submit" value="Register" name="register"
			style="width: 25%; margin-left: 36%; margin-top: 20px">
	</form>
</body>
</html>