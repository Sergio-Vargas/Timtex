<%-- 
    Document   : actualizarAsignar
    Created on : 07-ago-2021, 19:32:44
    Author     : Luis martinez
--%>

<%@page import="ModeloVO.DetalleOrdenVO"%>
<%@page import="ModeloDAO.DetalleOrdenDAO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloVO.OrdenVO"%>
<%@page import="ModeloDAO.OrdenDAO"%>
<%@page import="ModeloVO.AsigOrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Asignar</title>

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

        <%
            AsigOrdenVO AsigVO = (AsigOrdenVO) request.getAttribute("identificacion consultada");
            if (AsigVO != null) {
        %>
        <form method="post" action="AsigOrden" class="my-login-validation" id="basic-form" novalidate="">
            <div class="row">
                <div class="col-md-12">
                    <div class="card shadow">
                        <div class="card-header">
                            <h2 class="mb-0">Actualizar Asignación</h2>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-6"> 

                                    <input type="hidden" name="textAsigOrden" value="<%=AsigVO.getIdAsigOrden()%>">
                                    <div class="form-group">    
                                        Cantidad Prenda
                                        <input type="number"  name="textCantidadAsignar" value="<%=AsigVO.getCantidadPrenda()%>" class="form-control" required>
                                      
                                    </div>
                                    <div class="form-group">    
                                        Fecha Inicio<br>
                                        <input type="date" name="textFechaInicio" value="<%=AsigVO.getFechaInicio()%>" class="form-control" required>
                                       
                                    </div>
                                    <div class="form-group">    
                                        Fecha Fin
                                        <input type="date" name="textFechaFin" value="<%=AsigVO.getFechaFin()%>" class="form-control" required>
                                       
                                    </div></div> 
                                <div class="col-md-6"> 
                                    <div class="form-group">    
                                        Id Datos FK<br>
                                        <select name="textIdDatos" class="form-control" required>
                                            <option></option>
                                            <%
                                                DatosPersonalesDAO datDAO = new DatosPersonalesDAO();
                                                for (DatosPersonalesVO datVO : datDAO.empleado()) {
                                            %>
                                            <option value="<%=datVO.getIdDatos()%>"><%=datVO.getNombreDatos()%></option>
                                            <% }%>
                                        </select>
                                       
                                    </div>
                                    <div class="form-group">    
                                        Id Detalle FK
                                        <select name="textIdDetalleOrdenFK" class="form-control" required>
                                            <option></option>
                                            <%
                                                DetalleOrdenDAO DetaDAO = new DetalleOrdenDAO();
                                                for (DetalleOrdenVO DetaVO : DetaDAO.listar()) {
                                            %>
                                            <option value="<%=DetaVO.getIdDetalleOrden()%>"><%=DetaVO.getIdDetalleOrden()%></option>
                                            <% }%>
                                        </select>
                                    <input type="hidden" value="Activa" name="textEstado">
                                
                                      <div class="form-group">    
                                        Estado
                                        <select name="textEstado" class="form-control" required>
                                            <option></option>
                                            
                                            <option value="Activa">Activa</option>
                                            <option value="Realizada">Realizada</option>
                                        </select>
                                        
                                        
                                        
                                       
                                    </div></div>
                                <div class=" col-md-6">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Actualizar</button>
                                    </center>
                                </div>  
                            </div></div></div></div></div>
            <input type="hidden" value="2" name="opcion">
        </form>
        <% }%>
        <a href="consultarAsignar.jsp" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Volver</a>
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



        <!-- validacion de formularios -->
        <script src="JS/my-login.js"></script>
    </body>
</html>