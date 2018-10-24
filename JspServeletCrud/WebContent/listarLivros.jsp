<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new Livro</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body>
	<div class="container my-5">

		<form action="LivroController" method="get" name="frmBuscarlivro">
			<div class="form-group col-md-6">
				<input type="text" name="buscarLivro"
					placeholder="Buscar por Título" class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="submit" value="Buscar"
					class="btn btn-dark btn-lg btn-block">
			</div>
		</form>
		<br>

		<p class="font-weight-bold">
			<a href="/JspServeletCrud/LivroController?action=insert">INSERIR
				NOVO LIVRO</a>
		</p>

		<table border=1 class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Código Livro</th>
					<th scope="col">Título</th>
					<th scope="col">Autor</th>
					<th scope="col">Descrição</th>
					<th scope="col">Preço</th>
					<th scope="col" colspan="2">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${livros}" var="livro">
					<tr>
						<td scope="row"><c:out value="${livro.codigo}"></c:out></td>
						<td scope="row"><c:out value="${livro.titulo}"></c:out></td>
						<td scope="row"><c:out value="${livro.autor}"></c:out></td>
						<td scope="row"><c:out value="${livro.descricao}"></c:out></td>
						<td scope="row"><c:out value="${livro.preco}"></c:out></td>
						<td scope="row"><a
							href='LivroController?action=editar&livroId=<c:out value="${livro.codigo}"/>'>Update</a></td>
						<td scope="row"><a
							href='LivroController?action=deletar&livroId=<c:out value="${livro.codigo}"/>'>Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>