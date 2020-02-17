<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Ceci est la page login

<form action="login" method="post">
<table>
<tr>
<td>Login</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>Pass word</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td><input type="submit" value="Login"></td>
</tr>
</table>
</form>

</body>
</html>