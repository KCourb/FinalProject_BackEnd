<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menus</title>
</head>
<body>
	<div>
		<form:form method="post" modelAttribute="Menu">
			<table>
				<tr>
					<td>IdMenu</td>
					<td><form:input path="idMenu" /></td>
				</tr>
				<tr>
					<td>Nom :</td>
					<td><form:input path="nomMenu" /></td>
				</tr>
				<tr>
					<td>Prix</td>
					<td><form:input path="prixMenu" /></td>
				</tr>

				<tr>
					<td>Vegan</td>
					<td>Oui<input type="radio" name="unique" value="True"/></td>
					<td>Non<input type="radio" name="unique" value="False"/></td>
				</tr>



				<tr>
					<td><input type="submit" value="Ajouter" /></td>
				</tr>
			</table>
		</form:form>
	</div>


	<table>

		<c:forEach items="${listeMenus}" var="x">
			<tr>
				<td>${x.idMenu}</td>
				<td>${x.nomMenu}</td>
				<td>${x.prixMenu}</td>
				<td>${x.vegan}</td>
				<td><a href="Menu/Update?menu=${x.idMenu}">Modifier</a></td>
				<td><a href="Menu/Supp?toto=${x.idMenu}">Supprimer</a></td>
				<td><a href="Menu/Plats?toto=${x.idMenu}">Gerer les plats du Menu</a></td>
				

			</tr>
		</c:forEach>



	</table>




	<!-- <a href="/">Retour au menu de l'application</a> -->

</body>
</html>