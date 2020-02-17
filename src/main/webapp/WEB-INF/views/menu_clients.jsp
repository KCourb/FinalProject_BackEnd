<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clients</title>
</head>
<body>
<div>
<form:form method="post" modelAttribute="Client">
		<table>
			<tr>
				<td>IdClient</td>
				<td><form:input path="idClient" /></td>
			</tr>
			<tr>
				<td>Nom :</td>
				<td><form:input path="nomClient" /></td>
			</tr>
			<tr>
				<td>Numéro de téléphone</td>
				<td><form:input path="numTelephone" /></td>
			</tr>



			<tr>
				<td><input type="submit" value="Ajouter" /></td>
			</tr>
		</table>
	</form:form>
</div>


<table>

			<c:forEach items="${listeClients}" var="x">
				<tr>
					<td>${x.idClient}</td>
					<td>${x.nomClient}</td>
					<td>${x.numTelephone}</td>
					<td><a
                        href="Client/Update?client=${x.idClient}">Modifier</a></td>
                        					<td><a
                        href="Client/Supp?toto=${x.idClient}">Supprimer</a></td>
					
				</tr>
			</c:forEach>
			

			
			</table>
		
			


<!-- <a href="/">Retour au menu de l'application</a> -->

</body>
</html>