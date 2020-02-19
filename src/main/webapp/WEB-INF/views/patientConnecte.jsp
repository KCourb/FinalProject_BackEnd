<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Bienvenue ${patient.prenomPatient}</h3>


<table>
			<tr>
				<td>Id :</td>
				<td>${patient.idPatient}</td>
			</tr>
			<tr>
				<td>Nom :</td>
				<td>${patient.nomPatient}"</td>
			</tr>
						<tr>
				<td>Prenom :</td>
				<td>${patient.prenomPatient}"</td>
			</tr>
						<tr>
				<td>Sexe :</td>
				<td>${patient.sexe}"</td>
			</tr>
						<tr>
				<td>Date de naissance :</td>
				<td>${patient.dateNaissance}"</td>
			</tr>
			<tr>
				<td>Numéro de sécurité sociale</td>
				<td>${patient.numSecu}</td>
			</tr>
						<tr>
				<td>E mail</td>
				<td>${patient.mailPatient}</td>
			</tr>

		</table>
		
		
		





</body>
</html>