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
								<img src="Imagenes/logo.png" alt="bootstrap 4 login page">
							</div>
							<h3 class="card-title">Recuperar contraseña</h3>
							<form method="POST" class="my-login-validation" action="Usuario" id="basic-form" novalidate="">
								<div class="form-group">
									<label for="email">Ingrese correo</label>
									<input type="email" class="form-control" id="correo" name="textCorreo" pattern="^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" required autofocus>
									<div class="form-text text-muted">
										Al hacer clic en "Restablecer contraseña", le enviaremos un correo con una contraseña autogenerada.
									</div> 
								</div>

								<div class="form-group m-0">
									<button type="submit" class="btn btn-primary btn-block">
										Restablecer contraseña
									</button>
								</div>
                                                            <div class="mt-4 text-center">
                                                                <p style=" color:red;font-size:15px;">
                                                                    <%
                                                                        if (request.getAttribute("MensajeError") != null) {
                                                                    %>
                                                                    ${MensajeError}     
                                                                    <%} else {%>
                                                                <div style="color: greenyellow">${MensajeExito}</div>
                                                                <%  }%>     
                                                                </p>
                                                            </div>
                                                        <input type="hidden" value="5" name="opcion">    
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

 <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>



        <!-- validacion de formularios -->
        <script src="JS/my-login.js"></script>
</body>
</html>
