<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Plats</title>
</head>
<body>
<div>
<form:form method="post" modelAttribute="Plat">
		<table>
			<tr>
				<td>IdPlat</td>
				<td><form:input path="idPlat" /></td>
			</tr>
			<tr>
				<td>Nom :</td>
				<td><form:input path="nomPlat" /></td>
			</tr>
			<tr>
				<td>Prix</td>
				<td><form:input path="prixPlat" /></td>
			</tr>



			<tr>
				<td><input type="submit" value="Ajouter" /></td>
			</tr>
		</table>
	</form:form>
</div>


<table>

			<c:forEach items="${listePlats}" var="x">
				<tr>
					<td>${x.idPlat}</td>
					<td>${x.nomPlat}</td>
					<td>${x.prixPlat}</td>
					<td><a
                        href="Plat/Update?plat=${x.idPlat}">Modifier</a></td>
                        					<td><a
                        href="Plat/Supp?toto=${x.idPlat}">Supprimer</a></td>
					
				</tr>
			</c:forEach>
			

			
			</table>
		
			


<!-- <a href="/">Retour au menu de l'application</a> -->

</body>
</html>