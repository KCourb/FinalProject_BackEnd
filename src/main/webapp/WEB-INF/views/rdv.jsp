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
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Rdv/All">Rdv</a>
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
	
	<h3>Prendre rendze-vous</h3>
<br>
<table class="table table-striped">
			<tr>
				<th>idDépartement</th>
				<th>nom Département</th>
				<th>ListeMédecins</th>				
			</tr>
		
				<tr>
					<td>${ledep.idDepartement}</td>
					<td>${ledep.nomDepartement}</td>
					<td>${ledep.lstMedecin}</td>
				</tr>
		


		</table>	
	<form:form action="Ajout" method="post">
		<table>
			<tr>
				<td>ID RDV<input type="text" name="idRdv"></td>
				<td>Date<input type="text" id="datepicker" name="date"></td>
				<td>Motif<input type="text" name="motif"></td>				
							<td>Medecin<select name="test" multiple="multiple">
						<c:forEach items="${ledep.lstMedecin}" var="id">
							<option value="${id.idMedecin}">${id.nomMedecin}</option>
						</c:forEach>
				</select></td>				
				<td>Patient<input type="text" name="patient.idPatient"></td>
				<td><input class="btn btn-primary" type="submit"
					value="Ajouter un RDV" name="action"></td>
			</tr>
		</table>
	</form:form>
	<form:form action="AllDep" method="get">
	<input class="btn btn-primary" type="submit"
			value="afficher tous les départements" name="action">
	</form:form>
	<form:form action="AllMedecins" method="get">
	<input class="btn btn-primary" type="submit"
			value="afficher tous les médecins" name="action">
	</form:form>
	<br>
	
<%-- 	<form:form action="Update" method="post"> --%>
<!-- 		<table> -->
<!-- 			<tr> -->
<!-- 				<td>Introduire l'id du département<input type="text" -->
<!-- 					name="idDepartement"></td> -->
<!-- 				<td>Introduire le nom<input type="text" -->
<!-- 					name="nomDepartement"></td>				 -->
<!-- 				<td><input class="btn btn-primary" type="submit" -->
<!-- 					value="Mettre à jour un département" name="action"></td> -->
<!-- 			</tr> -->
<!-- 		</table> -->
<%-- 	</form:form> --%>
<!-- 	<br> -->

<%-- 	<form:form action="Supp" method="post"> --%>
<!-- 		<table> -->
<!-- 			<tr> -->
<!-- 				<td>Introduire l'id du département<input type="text" -->
<!-- 					name="idDepartement"></td> -->
<!-- 				<td><input class="btn btn-primary" type="submit" -->
<!-- 					value="Supprimer un département" name="action"></td> -->
<!-- 			</tr> -->
<!-- 		</table> -->
<%-- 	</form:form> --%>
<!-- 	<br> -->
	
<%-- 	<form:form action="ByID" method="get"> --%>
<!-- 		<table> -->
<!-- 			<tr> -->
<!-- 				<td>Introduire l'id du département<input type="text" -->
<!-- 					name="idDepartement"></td> -->
<!-- 				<td><input class="btn btn-primary" type="submit" -->
<!-- 					value="Rechercher un département par ID" name="action"></td> -->
<!-- 			</tr> -->
<!-- 		</table>		 -->
<%-- 	</form:form> --%>
	
<!-- 	<br> -->
<%-- 	<form:form action="All" method="get"> --%>
<!-- 		<input class="btn btn-primary" type="submit" -->
<!-- 			value="afficher tous les RDV" name="action"> -->
<!-- 		<br> -->
<!-- 		<br> -->
<!-- 		<p> -->
<!-- 			<b>Liste des RDV </b> -->
<!-- 		</p> -->
<!-- 		<br> -->
<!-- 		<table class="table table-striped"> -->
<!-- 			<tr> -->
<!-- 				<th>idDepartement</th> -->
<!-- 				<th>nomDepartement</th> -->
<!-- 			</tr> -->
<%-- 			<c:forEach items="${listeDesDepartements}" var="de"> --%>
<!-- 				<tr> -->
<%-- 					<td>${de.idDepartement}</td> --%>
<%-- 					<td>${de.nomDepartement}</td> --%>
<!-- 				</tr> -->
<%-- 			</c:forEach> --%>
<!-- 		</table> -->
<%-- 	</form:form> --%>


</body>
</html>