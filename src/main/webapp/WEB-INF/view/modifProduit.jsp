<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html>
<html>
<head>
<meta-charset="utf-8">
<title>Créer un produit</title>
</head>
<body>
	
	<form action="updateProduit" method="post">
		<pre>
			id : <input type="text" hidden name="idProduit" value="${produit.idProduit}">
			nom: <input type="text" name="nomProduit" value="${produit.nomProduit}">
			prix: <input type="text" name="prixProduit" value="${produit.prixProduit}">
			Date création: 
			<fmt:formatDate pattern="yyyy-MM-dd" value="${produit.dateCreation}" var="formatDate" /> 
			<input type="date" name="date" value="${formatDate}"></input>	
			<input type="submit" value="Modifier" />	
		</pre>
	</form>
	
	
	${msg}
	<br/>
	<a href="showCreate">Créer Produit</a>
	
	<br/>
	<a href="ListeProduits">Liste Produits</a>
</body>
</html>