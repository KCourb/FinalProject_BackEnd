<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modif Plat</title>
</head>
<body>
${PlatUpdate.toString() }
<form:form method="post" action="/Plat/Update?pl=${PlatUpdate.getIdPlat()}" modelAttribute="PlatUpdate">
		<table>
			<tr>
				<td>IdPlat</td>
				<td>${PlatUpdate.idPlat}</td>
			</tr>
			<tr>
				<td>Nom :</td>
				<td><form:input name="${PlatUpdate.nomPlat}" path="nomPlat" /></td>
			</tr>
			<tr>
				<td>Prix</td>
				<td><form:input name="${PlatUpdate.prixPlat}" path="prixPlat" /></td>
			</tr>



			<tr>
				<td><input type="submit" value="Valider" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>