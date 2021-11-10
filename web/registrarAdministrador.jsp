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
    <title>Registrar Administrador</title>
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
    
  
                <form id="basic-form" class="my-login-validation"  method="post" action="Usuario">
                      <div class="row abs-center">
                <div class="col-md-6">
                    <div class="card shadow">
                        <div class="card-header">
                            <h2 class="mb-0">Registrar Administrador</h2>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-12">
                             <div class="form-group">       
                    Usuario
                    <input type="text" name="textUsuario" class="form-control"   name="textUsuario" pattern="[a-zA-Z ]{2,20}" required>
                    
                             </div>
                                    <div class="form-group">
                    Correo
                    <input type="email" name="textCorreo" class="form-control"   pattern="^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" required>
                                    </div>
                                    <div class="form-group">
                    Contraseña
                    <input type="password" name="textClave" required="" class="form-control"  >
                                    </div>
                    <input type="hidden" name="textCargo" value="1"> 
                    <br>
                      <div class=" col-md-6">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Registrar</button>
                                    </center>
                                </div>
                       </div>
                    <input type="hidden" value="1" name="opcion">
                </form>
        <div style="color: red;">
            <%
                if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color:Blue">${MensajeExito}</div>

            <%  }%> 
        </div>
    
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>

                <script src="JS/my-login.js"></script>
    </body>
  
</html>
