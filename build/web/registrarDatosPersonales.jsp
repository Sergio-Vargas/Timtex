<%-- 
    Document   : registrarDatosPersonales
    Created on : 03-jul-2021, 19:34:04
    Author     : sergio saenz
--%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@include file="Sesiones.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es-Es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registrar Datos Personales</title>

        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800" rel="stylesheet">

        <!-- Icons -->
        <link href="assets/css/icons.css" rel="stylesheet" type="text/css"/>
        <!-- Favicon -->
        <link href="assets/img/brand/favicon.png" rel="icon" type="image/png">

        <!--Bootstrap.min css-->
        <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


        <!-- Ansta CSS -->
        <link href="assets/css/dashboard.css" rel="stylesheet" type="text/css">

        <!-- Custom scroll bar css-->
        <link href="assets/plugins/customscroll/jquery.mCustomScrollbar.css" rel="stylesheet" />

        <!-- Sidemenu Css -->
        <link href="assets/plugins/toggle-sidebar/css/sidemenu.css" rel="stylesheet">

    </head>
    <body>

        <form id="basic-form" class="my-login-validation"  action="DatosPersonales" method="POST" novalidate="">
            <div class="row">
                <div class="col-md-12">
                    <div class="card shadow">
                        <div class="card-header">
                            <h2 class="mb-0">Registro de Datos</h2>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="nombre">Nombre</label>
                                        <input class="form-control" type="text" name="textNombre" maxlength="30" minlength="2" pattern="[a-zA-Z ]{2,20}"  placeholder="Ingrese su nombre" required>

                                    </div>

                                    <div class="form-group">
                                        <label for="nombre">Apellido</label>
                                        <input type="text" name="textApellido"  class="form-control" maxlength="15" minlength="2" pattern="[a-zA-Z ]{2,20}" placeholder="Ingrese su apellido" required>

                                    </div>
                                    <div class="form-group ">
                                        <label for="direccion">Dirección</label>
                                        <input type="text" class="form-control" type="text" name="textDireccion" required>
                                    </div>
                                </div>
                                <div class="col-md-6">

                                    <div class="form-group">
                                        <label for="direccion">Celular</label>
                                        <input type="number" name="textTelefono" min="1000000" max="9000000000" class="form-control"   placeholder="3115453175" required>

                                    </div>

                                    <div class="form-group">
                                        <label for="correo">Correo</label>
                                        <input type="email" name="textCorreo" value="<%=correo%>" class="form-control" required readonly>
                                        <div class="invalid-feedback">
                                            El campo no puede estar vacío
                                        </div>
                                        <div class="invalid-feedback">
                                            El campo debe tener el formato email
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="hidden" name="textEstado" class="form-control" value="Activo">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="hidden" value="<%=id%>" class="form-control" name="textUsuario">
                                </div>
                                <div class="form-group">
                                    <div class="custom-checkbox custom-control">
                                        <input type="checkbox" name="agree" id="agree" class="custom-control-input" required="">
                                        <label for="agree" class="custom-control-label">Estoy de acuerdo con los <a href="#">términos y condiciones</a></label>
                                        <div class="invalid-feedback">
                                            Debe estar de acuerdo con nuestros términos y condiciones.
                                        </div>
                                    </div>
                                </div>

                                <div class=" col-md-6">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Registrar</button>
                                    </center>
                                </div>  

                            </div>
                        </div>
                    </div>    
                </div>            
                <input type="hidden" value="1" name="opcion">
                </form>     



                <div style="color: red;">
                    <%
                        if (request.getAttribute("MensajeError") != null) { %>
                    ${MensajeError}     

                    <%} else {%>
                    <div style="color: darkgreen">${MensajeExito}</div>

                    <%  }%>
                </div>


                <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>

                <script src="JS/my-login.js"></script>
                </body>

                </html>

