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
<title>Medecin</title>
</head>
<body>

<h3>Bienvenue Dr ${medecin.getNomMedecin()}</h3>


<table>

			<tr>
				<td>Nom :</td>
				<td>${medecin.nomMedecin}</td>
			</tr>
						<tr>
				<td>Departement :</td>
				<td>${medecin.departement.nomDepartement}</td>
			</tr>


		</table>
		
		
		<a href="http://localhost:1010/Creneau/init?id=${medecin.idMedecin}">Gerer son emploi du temps</a>
		<a href="http://localhost:1010/Consultation/init?id=${medecin.idMedecin}">Creer une consultation</a>
		
		
		





</body>
</html>