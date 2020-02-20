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
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/User/All">User</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="http://localhost:8090/Role/All">Role</a>
		</li>	
	</ul>
	
	<h3>Prendre rendez-vous</h3>
<br>	
	<form:form action="SelectDep" method="post">
		<table>
			<tr>				
				<td>Département<select name="idDepartement" multiple="multiple">
						<c:forEach items="${lstdep}" var="id">
							<option value="${id.idDepartement}">${id.nomDepartement}</option>							
						</c:forEach>
				</select></td>				
				<td><input class="btn btn-primary" type="submit"
					value="Choisir département" name="action"></td>
			</tr>
		</table>
	</form:form>
	<form:form action="AllDep" method="get">
	<input class="btn btn-primary" type="submit"
			value="afficher tous les départements" name="action">
	</form:form>
	

</body>
</html>