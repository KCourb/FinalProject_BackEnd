<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modif Client</title>
</head>
<body>
${clientUpdate.toString() }
<form:form method="post" action="/Client/Update?idclt=${clientUpdate.getIdClient()}" modelAttribute="clientUpdate">
		<table>
			<tr>
				<td>IdClient</td>
				<td>${clientUpdate.idClient}</td>
			</tr>
			<tr>
				<td>Nom :</td>
				<td><form:input name="${clientUpdate.nomClient}" path="nomClient" /></td>
			</tr>
			<tr>
				<td>Numéro de téléphone</td>
				<td><form:input name="${clientUpdate.numTelephone}" path="numTelephone" /></td>
			</tr>



			<tr>
				<td><input type="submit" value="Valider" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>