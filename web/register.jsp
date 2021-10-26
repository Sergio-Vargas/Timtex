<%-- 
    Document   : registrer
    Created on : 15/10/2021, 09:24:00 PM
    Author     : Letty Morales
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="author" content="Kodinger">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Registrar</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="Estilos/my-login.css">
</head>
<body class="my-login-page">
	<section class="h-100">
		<div class="container h-100">
			<div class="row justify-content-md-center h-100">
				<div class="card-wrapper">
					<div class="card fat">
						<div class="card-body">
							<div class="brand">
								<img src="Imagenes/logo.jpg" alt="bootstrap 4 login page">
							</div>
							<h3 class="card-title">Registrar</h3>
							<form method="POST" class="my-login-validation" novalidate="" action="https://www.youtube.com/watch?v=TCYx-lQQA5s">
								<div class="form-group">
									<label for="name">Usuario</label>
									<input id="name" type="text" class="form-control" name="name" required>
									<div class="invalid-feedback">
										tu usuario es invalido
									</div>
								</div>
								<div class="form-group">
									<label for="email">Correo</label>
									<input id="email" type="email" class="form-control" name="email" required>
									<div class="invalid-feedback">
										tu correo es invalido
									</div>
								</div>

								<div class="form-group">
									<label for="password">Contraseña</label>
									<input id="password" type="password" class="form-control" name="password" required data-eye>
									<div class="invalid-feedback">
										la contraseña es requerida
									</div>
								</div>

								<div class="form-group">
									<div class="custom-checkbox custom-control">
										<input type="checkbox" name="agree" id="agree" class="custom-control-input" required="">
										<label for="agree" class="custom-control-label">Estoy de acuerdo con los <a href="#">términos y condiciones</a></label>
										<div class="invalid-feedback">
											Debes estar de acuerdo con nuestros términos y condiciones.
										</div>
									</div>
								</div>

								<div class="form-group m-0">
									<button type="submit" class="btn btn-primary btn-block">
										Registrar
									</button>
								</div>
								<div class="mt-4 text-center">
									¿Ya tienes una cuenta? <a href="Login.jsp">Login</a>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script src="JS/my-login.js"></script>
</body>
</html>
