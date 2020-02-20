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

<title>Insert title here</title>
</head>
<body>
	<script src="jquery-3.4.1.min.js"></script>

	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<h3>Merci de renseigner les éléments suivants :</h3>
	<br>
	<form:form action="PostInscription" method="post">
		<table>
			<tr>
			
				<td>Nom : <input type="text" name="nomPatient"></td>
				<td>Prenom :<input type="text" name="prenomPatient"></td>
				<td>Sexe :<input type="text" name="sexe"></td>
				<td>Date :<input type="text" name="dateNaissance"></td>
				<td>Numéro de sécurité sociale :<input type="number"
					name="numSecu"></td>
				<td>Email : <input type="text" name="mailPatient"></td>




				<td><input class="btn btn-primary" type="submit"
					value="Valider" name="action"></td>
			</tr>
		</table>
	</form:form>
	<br>




</body>
</html>