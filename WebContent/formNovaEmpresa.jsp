<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário Nova Empresa</title>
</head>
<body>

	<form action="${linkServletNovaEmpresa}" method="post">
	
		Nome:<input type="text" name="nome" /></br>
		Data Abertura:<input type="text" name="data" /></br>
		<input type="Submit"/ >
	
	</form>

</body>
</html>