<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
</head>
<body>

	Selectionner les plats à ajouter au menu suivant :
	${MenuUpdate.toString()}
	<form:form method="post">

		<table>

			<tr>
				<td>Id du plat</td>
				<td>Nom du plat</td>

			</tr>



			<c:forEach items="${lstPlats}" var="x">
				<tr>
					<td>${x.idPlat}</td>
					<td>${x.nomPlat}</td>
					<td><input type="checkbox" id="${x.idPlat}" name="plats" value="${x.idPlat}" checked="checked"/>
					</td>

				</tr>
			</c:forEach>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>



		</table>
	</form:form>




	<!-- <a href="/">Retour au menu de l'application</a> -->

</body>
</html>