<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, br.com.alura.gerenciador.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE hmtl>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>

	<c:if test="${not empty empresa}">
		Empresa ${empresa} cadastrada com sucesso!
	</c:if>



	Lista de empresas:
	<br />

	<ul>
		<c:forEach items="${empresas}" var="empresa">

			<li>
                ${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> 
                <a href="/gerenciador/mostraEmpresa?id=${empresa.id}">Alterar</a>
                <a href="/gerenciador/removeEmpresa?id=${empresa.id}">Remove</a>
            </li>
            
 
		</c:forEach>
		
	</ul>
	</br>
            <a href="/gerenciador/formNovaEmpresa.jsp">Voltar</a>

</body>
</html>