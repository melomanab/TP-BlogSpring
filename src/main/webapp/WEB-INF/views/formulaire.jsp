<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire</title>
</head>

<jsp:include page="header.jsp" />

<body>


	<h1>Création d'un article</h1>

	<!-- Envoi d'une requête avec l'url courante avec la méthode post -->
	<form method="post">
		<div>
			<label for="title">Titre: </label> <input id="title" name="title" />
		</div>
		<div>
			<label for="description">Description: </label>
			<textarea id="description" name="description"></textarea>
		</div>


		<button>Valider</button>
	</form>

	<h2>
		<c:url value="/welcome.zzz" var="welcomeUrl" />
		<a href="${welcomeUrl}">Retour à la liste d'articles</a>
	</h2>

</body>
</html>