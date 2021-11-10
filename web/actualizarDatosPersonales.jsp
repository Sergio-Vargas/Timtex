<%-- 
    Document   : actualizarDatosPersonales
    Created on : 03-jul-2021, 19:46:35
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Datos personales</title>

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


        <%            DatosPersonalesVO datVO = (DatosPersonalesVO) request.getAttribute("identificacion consultada");
            if (datVO != null) {
        %>
        <form method="post" id="basic-form"  action="DatosPersonales" class="my-login-validation"  novalidate="">
            <div class="row">
                <div class="col-md-12">
                    <div class="card shadow">
                        <div class="card-header">
                            <h2 class="mb-0">Actualizar Datos Personales</h2>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-6"> 

                                    <input type="hidden" name="textNumeroid" value="<%=datVO.getIdDatos()%>">
                                    <div class="form-group">             
                                        Nombre
                                        <input type="text" name="textNombre" maxlength="15" minlength="2" pattern="[a-zA-Z ]{2,20}" value="<%=datVO.getNombreDatos()%>" class="form-control" required>
                                      
                                    </div>
                                    <div class="form-group"> 
                                        Apellido
                                        <input type="text" name="textApellido" maxlength="15" minlength="2" pattern="[a-zA-Z ]{2,20}" value="<%=datVO.getApellidoDatos()%>" class="form-control" required>
                                       
                                    </div>
                                    <div class="form-group"> 
                                        Direccion
                                        <input type="text" name="textDireccion" value="<%=datVO.getDireccionDatos()%>" class="form-control" required>
                                        
                                    </div>
                                    <div class="form-group"> 
                                        Telefono
                                        <input type="number" name="textTelefono" value="<%=datVO.getTelefonoDatos()%>" class="form-control" required>

                                    </div></div>
                                <div class="col-md-6"> 
                                    <div class="form-group"> 
                                        Correo
                                        <input type="text" name="textCorreo" value="<%=datVO.getCorreoDatos()%>" readonly class="form-control" required>
                                    </div>
                                    <div class="form-group"> 
                                        Estado Usuario     
                                        <select name="textEstado" class="form-control" required>
                                            <option></option>
                                            <option value="Activo">Activo</option>
                                            <option value="Inactivo">Inactivo</option>
                                        </select>
                                       

                                    </div>
                                    <div class="form-group"> 
                                        Usuario
                                        <input type="text"  value="<%=usuario%>" readonly  class="form-control" required>
                                        <input type="hidden" name="textUsuario"  value="<%=id%>" readonly  class="form-control" required>
                                    </div></div>
                                <div class=" col-md-6">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Actualizar</button>
                                    </center>
                                </div>  


                            </div> </div></div></div>
                <input type="hidden" value="2" name="opcion">
                </form><br><br>
                <% }%>
                <a href="consultarDatosPersonales.jsp" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Volver
                </a>
                <div style="color: red;">

                    <%
                if (request.getAttribute("MensajeError") != null) { %>
                    ${MensajeError}     

                    <%} else {%>
                    <div style="color: greenyellow">${MensajeExito} </div>
                    <%  }%>
                </div>


                <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>

                <script src="JS/my-login.js"></script>
                
                </body>
                </html>



