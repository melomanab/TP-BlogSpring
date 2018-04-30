<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Liste d'articles</h1>
	<c:forEach items="${articles}" var="article">

		<div title="${article.id}">
			<h2> ${article.title}</h2>
			<p> ${article.description}</p>
		
		</div>

	</c:forEach>
	
	<h2>
	<c:url value="/formulaire.zzz" var="createUrl"/> 
	<a href="${createUrl}">Creer un article</a>	
	</h2>


</body>
</html>