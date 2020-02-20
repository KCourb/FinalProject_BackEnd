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

<ul class="nav">
		<li class="nav-item"><a class="nav-link" href="http://localhost:1010/">Home</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:1010/Creneau/Return?id=${medecin.idMedecin}">Retour</a>
		</li>

			
	</ul>
	
	<h3>Créneaux du Dr ${medecin.nomMedecin}</h3>
<br>

			
		
		<form:form action="Ajout?id=${medecin.idMedecin}" method="post">
		<table>
			<tr>											
				<td>Horaire<input type="text" name="horaire"></td>		
				<td>Réservé<input type="text" name="reserve"></td>
				<td><input class="btn btn-primary" type="submit"
					value="Ajouter un Créneau" name="action"></td>
			</tr>
		</table>
	</form:form>
	

	
	<form:form action="All" method="get">
		<input class="btn btn-primary" type="submit"
			value="afficher tous les créneaux" name="action">
		<br>
		<br>
		<p>
			<b>Liste des créneaux </b>
		</p>
		<br>
		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Médecin</th>
				<th>Horaire</th>
				<th>Réservé</th>
				
			</tr>
			<c:forEach items="${listeDesCreneaux}" var="cr">
				<tr>
					<td>${cr.id}</td>
					<td>${cr.medecin}</td>
					<td>${cr.horaire}</td>
					<td>${cr.reserve}</td>					
				</tr>
			</c:forEach>
		</table>
	</form:form>
	
		<form:form action="Update" method="post">
		<table>
			<tr>
				<td>ID<input type="text" name="id"></td>
				<td>Médecin<input type="text" name="medecin"></td>											
				<td>Horaire<input type="text" name="horaire"></td>		
				<td>Réservé<input type="text" name="reserve"></td>
				<td><input class="btn btn-primary" type="submit"
					value="Mettre à jour un Créneau" name="action"></td>
			</tr>
		</table>
	</form:form>
	
	<br> <br> <br>
	
	<form:form action="Supp" method="post">
		<table>
			<tr>
				<td>ID<input type="text" name="id"></td>
				<td><input class="btn btn-primary" type="submit"
					value="Supprimer un Créneau" name="action"></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>