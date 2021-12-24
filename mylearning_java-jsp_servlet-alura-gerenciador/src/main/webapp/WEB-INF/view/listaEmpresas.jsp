<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada" var="linkEntrada"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresas Cadastradas</title>
</head>

<body>
	<c:import url="logout-parcial.jsp" />
	
	Usuario Logado: ${usuarioLogado.login }
	<br/>
	<br/>

	<c:if test="${not empty nomeEmpresa}">
		Empresa ${ empresa } cadastrada com sucesso!
		<br/>
    </c:if>

	Lista de Empresas:<br/>
	
	<ul>		
		<c:forEach items="${listaEmpresas}" var="empresa">			
			<li>${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> 
				<a href="${linkEntrada }?acao=MostraEmpresa&id=${empresa.id }">editar</a>						
				<a href="${linkEntrada }?acao=RemoveEmpresa&id=${empresa.id }">remove</a>
			</li>
			
		</c:forEach>
	</ul>
		
</body>
</html>