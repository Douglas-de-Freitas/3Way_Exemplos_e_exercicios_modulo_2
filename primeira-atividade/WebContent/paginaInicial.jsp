<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>GET</h1>
	<form action="NomeProfissao" method="get">
		<input type="text" name="nome" placeholder="Nome" required>
		<input type="text" name="profissao" placeholder="Profissao" required>
		<input type="submit" value="Enviar">
	</form>
	<br><br>
	<h1>POST</h1>
	<form action="NomeProfissao" method="post">
		<input type="text" name="nome" placeholder="Nome" required>
		<input type="text" name="profissao" placeholder="Profissao" required>
		<input type="submit" value="Enviar">
	</form>

</body>
</html>