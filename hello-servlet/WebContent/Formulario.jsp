<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulário JSP</title>
</head>
<body>

	<form method="get" action="ParametroServlet">
		<input type="text" name="nome" size="25" placeholder="Nome" required>
		<input type="text" name="idade" size="3" maxlength="3" placeholder="Idade" required>
		<input type="submit" value="Enviar">
	</form>

</body>
</html>