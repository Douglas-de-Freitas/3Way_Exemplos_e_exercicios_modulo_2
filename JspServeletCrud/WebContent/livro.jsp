<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Livro</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body>
	<div class="container my-5">
		<form method="POST" action="LivroController" name="frmAddLivro">
			<div class="form-group">
				User ID: <input type="text" readonly="readonly" name="livroCodigo"
					value="${livro.codigo}" class="form-control"><br>
				Título: <input type="text" name="titulo" value="${livro.titulo}"
					class="form-control"><br> Autor: <input type="text"
					name="autor" value="${livro.autor}" class="form-control"><br>
				Descrição: <input type="text" name="descricao"
					value="${livro.descricao}" class="form-control"><br>
				Preço: <input type="text" name="preco" value="${livro.preco}"
					class="form-control"><br> <input type="submit"
					name="Submit" class="btn btn-dark btn-lg btn-block">
			</div>
		</form>
	</div>
</body>
</html>