<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Datepicker - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( ".datepicker" ).datepicker();
  } );
  </script>
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
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/login">Login</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Departement/All">Departement</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Medecin/All">Medecin</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Patient/All">Patient</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Creneau/init">Rdv</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Rdv/init">Rdv</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Consultation/All">Consultation</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Facture/All">Facture</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Prescription/All">Prescription</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/User/All">User</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Role/All">Role</a>
		</li>	
	</ul>

	<h3>Page Médecin</h3>
	<br>
	<form:form action="Ajout" method="post">
		<table>
			<tr>
				<td>ID patient<input type="text" name="idPatient"></td>
				<td>Nom patient<input type="text" name="nomPatient"></td>
				<td>Prénom patient<input type="text" name="prenomPatient"></td>
				<td>Sexe<input type="text" name="sexe"></td>
				<td>Date de Naissance<input type="text" class="datepicker" id="datepicker1" name="dateNaissance"></td>
				<td>Num sécu<input type="text" name="numSecu"></td>
				<td>e-mail<input type="text" name="mailPatient"></td>
				<td><input class="btn btn-primary" type="submit"
					value="Ajouter un patient" name="action"></td>
			</tr>
		</table>
	</form:form>
	<br>

	<form:form action="Update" method="post">
		<table>
			<tr>
				<td>ID patient<input type="text" name="idPatient"></td>
				<td>Nom patient<input type="text" name="nomPatient"></td>
				<td>Prénom patient<input type="text" name="prenomPatient"></td>
				<td>Sexe<input type="text" name="sexe"></td>
				<td>Date de Naissance<input type="text" class="datepicker" id="datepicker2" name="dateNaissance"></td>
				<td>Num sécu<input type="text" name="numSecu"></td>
				<td>e-mail<input type="text" name="mailPatient"></td>
				<td><input class="btn btn-primary" type="submit"
					value="Mettre à jour un patient" name="action"></td>
			</tr>
		</table>
	</form:form>
	<br>

	<form:form action="Supp" method="post">
		<table>
			<tr>
				<td>ID patient<input type="text" name="idPatient"></td>
				<td><input class="btn btn-primary" type="submit"
					value="Supprimer un patient" name="action"></td>
			</tr>
		</table>
	</form:form>
	<br>

	<form:form action="ByID" method="get">
		<table>
			<tr>
				<td>ID patient<input type="text" name="idPatient"></td>
				<td><input class="btn btn-primary" type="submit"
					value="Rechercher un patient par ID" name="action"></td>
			</tr>
		</table>
	</form:form>

	<br>
	<form:form action="All" method="get">
		<input class="btn btn-primary" type="submit"
			value="afficher tous les patients" name="action">
		<br>
		<br>
		<p>
			<b>Liste des patients </b>
		</p>
		<br>
		<table class="table table-striped">
			<tr>
				<th>ID patient</th>
				<th>nom patient</th>
				<th>prénom patient</th>
				<th>sexe</th>
				<th>date de naissance</th>
				<th>num sécu</th>
				<th>email</th>
			</tr>
			<c:forEach items="${listeDesPatients}" var="pa">
				<tr>
					<td>${pa.idPatient}</td>
					<td>${pa.nomPatient}</td>
					<td>${pa.prenomPatient}</td>
					<td>${pa.sexe}</td>
					<td>${pa.dateNaissance}</td>
					<td>${pa.numSecu}</td>
					<td>${pa.mailPatient}</td>
				</tr>
			</c:forEach>
		</table>
	</form:form>


</body>
</html>