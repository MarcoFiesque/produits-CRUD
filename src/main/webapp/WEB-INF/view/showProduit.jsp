<%@ page language="java" contentType="text/html; charset=utf-8"
 pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Produit ${produit.id}</title>
</head>
<body>
 <h1 >
 	${produit.id}
 </h1>
 <table >
 <tr>
 <th>ID</th><th>Nom Produit</th><th>Prix</th><th>Date
Création</th><th>Suppression<th>Edition</th>
 </tr>
 
 <tr>
 <td>${p.idProduit }</td>
 <td>${p.nomProduit }</td>
 <td>${p.prixProduit }</td>
 <td><fmt:formatDate pattern="dd/MM/yyyy"
value="${p.dateCreation}" /></td>
 <td><a onclick="return confirm('Etes-vous sûr ?')"
href="supprimerProduit?id=${p.idProduit }">Supprimer</a></td>
 <td><a href="modifierProduit?id=${p.idProduit }">Edit</a></td>
 </tr>
 </table>
 
  <br/>
	<a href="showCreate">Créer Produit</a>
	
	<br/>
	<a href="ListeProduits">Liste Produits</a>
</body>
</html>