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
    $( ".datetimepicker" ).datetimepicker();
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
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/">Home</a>
		</li>
		
	</ul>
	<h3>Créer une consultation</h3>
<br>
		
		<form:form action="Ajout" method="post">
		<table>
			<tr>
				<td>ID Consultation<input type="text" name="idConsultation"></td>
				<td>RDV<select name="rdv" multiple="multiple">
				<c:forEach items="${lstrdv}" var="id">
							<option value="${id.idRdv}">${id.idRdv}</option>
						</c:forEach></select></td>			
				<td>Bilan<input type="text" name="bilanPrescription"></td>											
				<td><input class="btn btn-primary" type="submit"
					value="Ajouter une consultation" name="action"></td>
			</tr>
		</table>
	</form:form>
	
	<form:form action="Update" method="post">
		<table>
			<tr>
				<td>ID Consultation<input type="text" name="idConsultation"></td>
				<td>RDV<select name="rdv.idRdv" multiple="multiple">
				<c:forEach items="${lstrdv}" var="id">
							<option value="${id.idRdv}">${id.idRdv}</option>
						</c:forEach></select></td>	
				<td>Bilan<input type="text" name="bilanPrescription"></td>											
				<td><input class="btn btn-primary" type="submit"
					value="Mettre à jour une consultation" name="action"></td>
			</tr>
		</table>
	</form:form>
	<form:form action="AllRdv" method="get">
	<input class="btn btn-primary" type="submit"
			value="afficher tous les RDV" name="action">
	</form:form>
	
	<form:form action="ByID" method="get">
	<table>
			<tr>
				<td>ID Consultation<input type="text" name="idConsultation"></td>														
				<td><input class="btn btn-primary" type="submit" value="rechercher une consultation" name="action"></td>
			</tr>
		</table>	
	</form:form>
	
	<form:form action="All" method="get">
		<input class="btn btn-primary" type="submit"
			value="afficher toutes les consultations" name="action">
		<br>
		<br>
		<p>
			<b>Liste des consultations </b>
		</p>
		<br>
		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>RDV</th>
				<th>Bilan</th>
			</tr>
			<c:forEach items="${listeDesConsultations}" var="co">
				<tr>
					<td>${co.idConsultation}</td>
					<td>${co.rdv.idRdv}</td>
					<td>${co.bilanPrescription}</td>					
				</tr>
			</c:forEach>
		</table>
	</form:form>
	
	

</body>
</html>