<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modif Menu</title>
</head>
<body>
${MenuUpdate.toString() }
<form:form method="post" action="/Menu/Update?menu=${MenuUpdate.getIdMenu()}" modelAttribute="MenuUpdate">
		<table>
			<tr>
				<td>IdMenu</td>
				<td>${MenuUpdate.idMenu}</td>
			</tr>
			<tr>
				<td>Nom :</td>
				<td><form:input name="${MenuUpdate.nomMenu}" path="nomMenu" /></td>
			</tr>
			<tr>
				<td>Prix</td>
				<td><form:input name="${MenuUpdate.prixMenu}" path="prixMenu" /></td>
			</tr>
			
							<tr>
					<td>Vegan</td>
					<td>Oui<input type="radio" name="unique" value="True"/></td>
					<td>Non<input type="radio" name="unique" value="False"/></td>
				</tr>



			<tr>
				<td><input type="submit" value="Valider" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>