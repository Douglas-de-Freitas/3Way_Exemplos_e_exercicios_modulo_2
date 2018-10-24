<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Produtos</title>
</head>
<body>

	<table border=1 class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Id do Produto</th>
				<th scope="col">Descrição do Produto</th>
				<th scope="col">Código do Produto</th>
				<th scope="col">Quantidade</th>
				<th scope="col" colspan="2">Ação</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${produtos}" var="produto">
				<tr>
					<td scope="row"><c:out value="${produto.id}"></c:out></td>
					<td scope="row"><c:out value="${produto.descricao}"></c:out></td>
					<td scope="row"><c:out value="${produto.codigo}"></c:out></td>
					<td scope="row"><c:out value="${produto.quantidade}"></c:out></td>
					<td scope="row"><a
						href="ProdutoServlet?action=editar&produtoId=${produto.id}">Atualizar</a></td>
					<td scope="row"><a
						href="LivroController?action=deletar&produtoId=${produto.id}">Deletar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>