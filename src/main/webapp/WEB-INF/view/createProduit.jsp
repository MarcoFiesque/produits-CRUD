<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
 <!DOCTYPE html>
<html>
<head>
<meta-charset="utf-8">
<title>Créer un produit</title>
</head>
<body>

	<form action="saveProduit" method="post">
		<pre>
			nom: <input type="text" name="nomProduit">
			prix: <input type="text" name="prixProduit">
			date création: <input type="date" name="date">		
			<input type="submit" value="ajouter">	
		</pre>
	</form>
	
	${msg}
	<br/>
	 <br/>
	<a href="showCreate">Créer Produit</a>
	
	<br/>
	<a href="ListeProduits">Liste Produits</a>
</body>
</html>