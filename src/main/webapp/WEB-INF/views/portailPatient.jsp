<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		crossorigin="anonymous">
<title>Accueil Patients</title>
</head>
<body>

	<script src="jquery-3.4.1.min.js"></script>

	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>



Se connecter

<form action="Patient/Login" method="post">
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





					<ul class="nav">

		<li class="nav-item"><a class="nav-link" href="http://localhost:1010/Patient/Inscription">Creer un nouveau compte</a>
		</li>		
		<li class="nav-item"><a class="nav-link" href="http://localhost:1010">Retour au menu/a>
		</li>
	</ul>

<br> <br> 

<a href="http://localhost:1010">Retour au menu</a>







</body>
</html>