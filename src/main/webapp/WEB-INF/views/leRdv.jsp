<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script src="jquery-3.4.1.min.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		crossorigin="anonymous">
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

<a href="<c:url value="/logout"/>"> Logout</a>

<ul class="nav">
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/">Home</a>
		</li>

	</ul>
	
	<br>
	
		
		<p>
			<b>Votre rendez-vous a bien été pris en compte</b>
		</p>
		<br>
		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Motif</th>
				<th>Médecin</th>	
				<th>Créneau</th>	
				<th>Patient</th>			
			</tr>
		
				<tr>
					<td>${lerdv.idRdv}</td>
					<td>${lerdv.motif}</td>
					<td>${lerdv.medecin.nomMedecin}</td>
					<td>${lerdv.creneau.horaire}</td>
					<td>${lerdv.patient.idPatient}</td>
				</tr>
		


		</table>
		
		<a href="http://localhost:1010">Retour Menu</a>


	
	



</body>
</html>