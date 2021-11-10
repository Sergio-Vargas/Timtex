<%-- 
    Document   : registrarOrden
    Created on : 29-jul-2021, 12:57:04
    Author     : sergio saenz
--%>


<%@page import="ModeloVO.DetalleOrdenVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.PrendaVO"%>
<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Orden</title>

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
    <center>
        <form method="post" action="Orden" id="basic-form" class="my-login-validation"  novalidate="">
            <div class="row">
                <div class="col-md-12">
                    <div class="card shadow">
                        <div class="card-header">
                            <h2 class="mb-0">Registrar Orden</h2>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-6">
                                    <input type="hidden" name="textOrden">
                                    <div class="form-group">  
                                        Fecha Orden
                                        <input type="date" name="textFecha" class="form-control" required>
                                    </div>
                                </div> 
                               
                                        <input type="hidden" name="textEstado" class="form-control" required value="Activo">
                                   
                                
                                <div class="col-md-12">
                                    <div class="form-group">  
                                        Id Datos
                                        <select name="textIdDato" class="form-control" required>
                                            <option></option>
                                            <%
                                                DatosPersonalesDAO datDAO = new DatosPersonalesDAO();
                                                for (DatosPersonalesVO datVO : datDAO.listar()) {
                                            %>
                                            <option value="<%=datVO.getIdDatos()%>"><%=datVO.getNombreDatos()%></option>
                                            <% }%>
                                        </select>
                                        </div></div>
                                <div class=" col-md-6">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Registrar</button>
                                    </center>
                                </div>  


                            </div>
                        </div>    
                    </div>          
                </div>    
            </div>       
            <input type="hidden"  value="1" name="opcion">
        </form>

            <div style="color: red;">
                <%
                if (request.getAttribute("MensajeError") != null) { %>
                ${MensajeError}     

                <%} else {%>
                <div style="color: greenyellow">${MensajeExito}</div>

                <%  }%>
            </div>
    </center>
</body>
<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/js/jquery.js" type="text/javascript"></script>
<script src="assets/js/jquery.prettyPhoto.js" type="text/javascript"></script>
<script src="assets/js/jquery.scrollUp.min.js" type="text/javascript"></script>
<script src="assets/js/main.js" type="text/javascript"></script>
<script src="JS/carrito.js" type="text/javascript"></script>

<!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>


        
        <!-- validacion de formularios -->
        <script src="JS/my-login.js"></script>
</html>
