<%-- 
    Document   : forgot
    Created on : 15/10/2021, 09:18:18 PM
    Author     : Letty Morales
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="author" content="Kodinger">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Recuperar contraseña</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="Estilos/my-login.css">
</head>
<body class="my-login-page">
	<section class="h-100">
		<div class="container h-100">
			<div class="row justify-content-md-center align-items-center h-100">
				<div class="card-wrapper">
					<div class="card fat">
						<div class="card-body">
							<div class="brand">
								<img src="Imagenes/logo.jpg" alt="bootstrap 4 login page">
							</div>
							<h3 class="card-title">Recuperar contraseña</h3>
							<form method="POST" class="my-login-validation" novalidate="">
								<div class="form-group">
									<label for="email">Ingrese correo</label>
									<input id="email" type="email" class="form-control" name="email" value="" required autofocus>
									<div class="invalid-feedback">
										Correo es invalido
									</div>
									<div class="form-text text-muted">
										Al hacer clic en "Restablecer contraseña", le enviaremos un correo para restablecer la contraseña.
									</div>
								</div>

								<div class="form-group m-0">
									<button type="submit" class="btn btn-primary btn-block">
										Restablecer contraseña
									</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="JS/my-login.js"></script>
</body>
</html>
