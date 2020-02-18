<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Introduisez un permis</title>
</head>
<body>
<form action="ServletPermis" method="post">




<p>Choisir état</p>
<p>
    default <input type="radio" name="etat" value="default" checked="checked"/><br />
	en cours <input type="radio" name="etat" value="en cours" /><br />
	délivré <input type="radio" name="etat" value="délivré"/>
</p>


<p>Choisir architecte</p>
<select name="archi" multiple="yes">

<option value="default" selected="selected"> default</option>

<c:forEach items="${lstArchi}" var="cl">


 <option value="${cl.idArchi}">${cl.nomArchi}</option>

	
	

</c:forEach>
</select>
<br>



<p>Choisir bénéficiaire</p>
<select name="bene" multiple="yes">

<option value="default" selected="selected"> default</option>

<c:forEach items="${lstBene}" var="cr">


	<option value="${cr.idBene}">${cr.adresseBene}</option>
	

</c:forEach>
</select>

<table>
<tr>
<td><input type="text" placeholder="idPermis" name="idPermis" ></td>
<td><input type="text" placeholder= "typeAmenagement" name="typeAmenagement" defaultValue="default"></td>
<td><input type="text" placeholder="annee" name="annee" defaultValue="default"></td>


<td><input type="submit" value="ajoutPermis" name="action" ></td>
<td><input type="submit" value="supprPermis" name="action"></td>
<td><input type="submit" value="modifierPermis" name="action"></td>
<td><input type="submit" value="test" name="action"></td>

</tr>
</table>



</form>

</body>
</html>