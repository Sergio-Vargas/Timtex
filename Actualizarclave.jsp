<%-- 
    Document   : registrarAdministrador
    Created on : 09-sep-2021, 18:38:11
    Author     : sergio saenz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Actulizar Clave</title>
        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800" rel="stylesheet">
      
        <!-- Icons -->
        <link href="assets/css/icons.css" rel="stylesheet" type="text/css"/>
        <!-- Favicon -->
        <link href="assets/img/brand/favicon.png" rel="icon" type="image/png">

        <!--Bootstrap.min css-->
        <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


       
        <!-- Custom scroll bar css-->
        <link href="assets/plugins/customscroll/jquery.mCustomScrollbar.css" rel="stylesheet" />

        <!-- Sidemenu Css -->
        <link href="assets/plugins/toggle-sidebar/css/sidemenu.css" rel="stylesheet">
        <link href="assets/css/sweetalert.css" rel="stylesheet" type="text/css"/>
        
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

        <%@include file="Sesiones.jsp"%>

    </head>
    <style>
        .abs-center {
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }

        .form {
            width: 450px;
        }
    </style>
    <body>
        <div class="container-fluid pt-8">
            <div class="page-header mt-0 shadow p-3">
                <ol class="breadcrumb mb-sm-0">
                    <li class="breadcrumb-item"><a href="Usuario.jsp">Inicio</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Actualizar Clave</li>
                </ol>
            </div>
            </div>
        <form id="basic-form" class="my-alertas-validation"  method="post">
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6">
                        <div class="card shadow">
                            <div class="card-header">
                                <h2 class="mb-0">Actualizar Clave</h2>
                            </div>
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group">       
                                            Usuario
                                            <input type="text" id="textUsuario" name="textUsuario" class="form-control" pattern="[a-zA-Z ]{2,20}" required>
                                            
                                        </div>
                                        <div class="form-group">
                                            Correo
                                            <input type="email" id="textCorreo" name="textCorreo" class="form-control"   pattern="^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" required>
                                        </div>
                                        <div class="form-group">
                                            Contraseña
                                            <input type="password" id="textClave" name="textClave" required="" class="form-control"  >
                                        </div>
                                        <br>
                                        <div class="row">
                                            <div class="col-md-3"></div>
                                            <div class=" col-md-6">
                                                <center>
                                                    <button type="submit" id="ejemplo" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Actualizar</button>
                                                </center>
                                            </div>
                                            <div class="col-md-3"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3"></div>
                </div>
        </form>
            <div style="color:green;" id="exito">
                <%
                if (request.getAttribute("MensajeError") != null) { %>
                ${MensajeError}     
            </div>
                <%} else {%>
                <div style="color:red" id="error">${MensajeExito}</div>

                <%  }%> 
            

            <!-- jQuery first, then Popper.js, then Bootstrap JS -->
            <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>
            <script src="assets/js/sweetalert.js" type="text/javascript"></script>
            <script src="JS/my-login.js" type="text/javascript"></script>
            
        </body> 
    <%@include file="footer.jsp"%>

</html>
