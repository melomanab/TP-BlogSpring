<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>


<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Header</title>

<!-- Import js bootstrap -->
<%-- <c:url value="/js/bootstrap.min.js" var="bootstrapJsUrl" /> --%>
<script src="<c:url value="/css/bootstrap.min.css"/>"></script>

<c:url value="/css/bootstrap.min.css" var="bootstrapCssUrl" />
<link rel="stylesheet" href="${bootstrapCssUrl}" />


</head>

<!-- Pas de body -->

</html>