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
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/login">Login</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Departement/init">Departement</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Medecin/init">Medecin</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Patient/init">Patient</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Creneau/init">Créneau</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Rdv/init">Rdv</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Consultation/init">Consultation</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Facture/init">Facture</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Prescription/init">Prescription</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/User/init">User</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Role/init">Role</a>
		</li>	
	</ul>

	<br>


	<p>
		<b>Facture</b>
	</p>
	<br>
	<table class="table table-striped">
		<tr>
			<th>ID Facture</th>
			<th>Date d'édition</th>
			<th>Montant</th>
			<th>Consultation</th>
			<th>Payée</th>
		</tr>

		<tr>
			<td>${lafacture.idFacture}</td>
			<td>${lafacture.dateEdition}</td>
			<td>${lafacture.montant}</td>
			<td>${lafacture.consultation}</td>
			<td>${lafacture.payee}</td>
		</tr>
		

	</table>

<form:form action="Txt" method="get">
	<table>
			<tr>
				<td>ID facture<input type="text"  name="idFacture" value="${lafacture.idFacture}"></td>
<!-- 				<td>ID facture<input type="text"  name="idFacture"></td> -->
				<td><input class="btn btn-primary" type="submit" value="Exporter la facture en txt" name="action"></td>
			</tr>
		</table>
	</form:form>

<a href="http://localhost:8090/Consultation/init">Consultation</a>




</body>
</html>