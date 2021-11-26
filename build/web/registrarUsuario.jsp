
<%-- 
    Document   : registrarUsuario
    Created on : 26-jun-2021, 17:40:19
    Author     : sergio saenz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registrar Usuario</title>
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
                                    <img src="Imagenes/logo.png">
                                </div>
                                <h1 class="card-title">Registrar Usuario</h1>

                                <form method="post" action="Usuario" id="basic-form"  class="my-login-validation" novalidate="">
                                    <div class="form-group">
                                        Usuario
                                        <input type="text" class="form-control" name="textUsuario" required>
                                    </div>
                                    <div class="form-group">
                                        Correo
                                        <input type="email" class="form-control" id="correo" name="textCorreo" pattern="^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" required>
                                    </div>
                                  
                                    <div class="form-group">
                                        Contraseña
                                        <input type="password" class="form-control" id="clave" name="textClave" required data-eye>
                                    </div>
                                    <div class="form-group">
                                        Confirmar contraseña
                                        <input type="password" class="form-control" name="textClave2" equalTo="textClave" required data-eye>
                                    </div>
                                        
                                        <input type="hidden" class="form-control" name="textEstado" value="Activo">
                                    
                                    
                                     <div class="form-group">
                                    <div class="custom-checkbox custom-control">
                                        <input type="checkbox" name="agree" id="agree" class="custom-control-input" required="">
                                        <label for="agree" class="custom-control-label">Estoy de acuerdo con los <a href="#">términos y condiciones</a></label>
                                        <div class="invalid-feedback">
                                            Debe estar de acuerdo con nuestros términos y condiciones.
                                        </div>
                                    </div>
                                </div>
                                    <input type="hidden" name="textCargo" value="2">
                                    <div class="form-group m-0">
                                        <button type="submit" class="btn btn-primary btn-block">
                                            Registrar
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
                                    <input type="hidden" value="1" name="opcion">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div></section>
        
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>



        <!-- validacion de formularios -->
        <script src="JS/my-login.js"></script>
    </body>
</html>

