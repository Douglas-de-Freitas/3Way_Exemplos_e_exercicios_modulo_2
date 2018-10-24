<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet">
</head>
<body>

	<div class="panel panel-primary panel-cadastro">

		<div class="panel panel-heading">Cadastro</div>

		<div class="panel-body">
			<form method="post" action="BootstrapServlet">
			
					<fieldset>

						<div class="form-group">
							<label for="nome">Nome Completo</label> <input type="text"
								class="form-control" id="nome" name="nome" autofocus required>
						</div>

						<div class="form-group">
							<label for="login">Usuário</label> <input type="text"
								class="form-control" id="login" name="login" required>
						</div>

						<div class="form-group">
							<label for="senha1">Senha</label> <input type="password"
								class="form-control" id="senha1" name="senha1" required>
						</div>

						<div class="form-group">
							<label for="senha2">Repita a Senha</label> <input type="password"
								class="form-control" id="senha2" name="senha2" required>
						</div>

					</fieldset>
					<input type="submit" class="btn btn-primary" value="Confirmar">
			</form>
		</div>
	</div>



</body>
</html>