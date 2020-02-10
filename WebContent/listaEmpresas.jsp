<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, br.com.alura.gerenciador.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<ul>

		<br>Lista Empresas:
		</br>
		<%
		Set<Empresa> lista = (LinkedHashSet<Empresa>)request.getAttribute("empresas");
		for (Empresa empresas : lista) {
			%>
		<li><%= empresas.getNome()%></li>
		<%}%>
	</ul>

</body>
</html>