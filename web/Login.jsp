<%-- 
    Document   : login.jsp
    Created on : 15/10/2021, 08:59:05 PM
    Author     : Letty Morales
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="author" content="Kodinger">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Iniciar Sesión</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="Estilos/my-login.css">
        <link rel="shortcut icon" href="Imagenes/logo1.png" type="image/x-icon">
</head>
<body class="my-login-page">
	<section class="h-100">
		<div class="container h-100">
			<div class="row justify-content-md-center h-100">
				<div class="card-wrapper">
					<div class="card fat">
						<div class="card-body">
							<div class="brand">
								<img src="Imagenes/logo.jpg" alt="logo">
							</div>
							<h1 class="card-title">Iniciar Sesión</h1>
                                                        <form method="POST" action="Usuario" class="my-login-validation" novalidate="">
								<div class="form-group">
									<label for="email">Usuario</label>
                                                                        <input id="usuario" type="text" class="form-control" name="textUsuario" required autofocus>
									<div class="invalid-feedback">
										Usuario es invalido
									</div>
								</div>

								<div class="form-group">
									<label for="password">Contraseña
									</label>
                                                                        <input id="password" type="password"  class="form-control" name="textClave" required data-eye>
									<a href="forgot.jsp" class="float-right">
										¿Olvidaste tu contraseña?
									</a>
									<br>
								    <div class="invalid-feedback">
								    	Contraseña es requerieda
							    	</div>
								</div>
								<div class="form-group m-0">
									<button type="submit" class="btn  btn-block" value="Ingresar">
										Ingresar
									</button>
								</div>
								<div class="mt-4 text-center">
									¿No tienes un cuenta? <a href="register.jsp">Crear una</a>
								</div>
                                                        <p style=" color: white;font-size:15px;">
                                                        <%
                                                        if (request.getAttribute("MensajeError") != null) { 
                                                        %>
                                                        ${MensajeError}     
                                                        <%} else {%>
                                                        <div style="color: greenyellow">${MensajeExito}</div>
                                                        <%  }%>     
                                                        </p>
                                                        <input type="hidden" value="3" name="opcion">
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
                                                        
	</section>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script src="JS/my-login.js"></script>
</body>
</html>
