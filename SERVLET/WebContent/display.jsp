<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PUBLICACOES</title>
</head>
<body>
	<strong>NOSSO METODO</strong>
	<div>"Publicacoes por ordem crescente de data de publicacao"</div>
	<c:forEach var="item" items="${Publicacoes}">
		<div>Nome da Publicacao: ${item}</div>
	</c:forEach>	
	<strong>METODO DO PROFESSOR</strong>
	<div>"Lista de Titulos das Publicacoes"</div>
	<c:forEach var="item" items="${Titles}">
		<div>Nome da Publicação: ${item}</div>
	</c:forEach>
</body>
</html>