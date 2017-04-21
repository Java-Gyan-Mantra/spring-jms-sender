<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<style type="text/css">
div {
	text-align: center;
	color: navy;
	background: lavender;
}
</style>
</head>
<body>
	<div>
		<h1>This Data will send over network to other application.
			sending.....</h1>
	</div>
	<h1 align="center">${msg}</h1>
	<form action="${pageContext.request.contextPath}/send">
		<table align="center">
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Location :</td>
				<td><input type="text" name="location"></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address"></td>
			</tr>
		</table>
		<center>
			<input type="submit" value="SEND">
		</center>
	</form>
</body>
</html>