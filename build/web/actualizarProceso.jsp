<%-- 
    Document   : actualizarProceso
    Created on : 01-ago-2021, 19:01:23
    Author     : sara gabriela
--%>

<%@page import="ModeloVO.AsigOrdenVO"%>
<%@page import="ModeloDAO.AsigOrdenDAO"%>
<%@page import="ModeloVO.ProcesoVO"%>
<%@include file="Sesiones.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Proceso</title>

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
          <%
                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1")) {

                            %>
        <%  ProcesoVO ProVO = (ProcesoVO) request.getAttribute("identificacion consultada");
            if (ProVO != null) {
        %>
        <center>
        <div class="container-fluid pt-8">
                                <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="consultarProceso.jsp">Procesos</a></li>
                                        <li class="breadcrumb-item active">Actualizar Proceso</li>

                                    </ol>

                                </div>
        <form method="post" action="Proceso" class="my-login-validation" id="basic-form" novalidate="">
            <div class="row">
                <div class="col-md-12">
                    <div class="card shadow">
                        <div class="card-header">
                            <h2 class="mb-0">Registrar Proceso</h2>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-6"> 

                                    <input type="hidden" name="textIdProceso" value="<%=ProVO.getIdProceso()%>">
                                    <div class="form-group">  
                                        Descripción proceso
                                        <input type="text" name="textDescripcion" maxlength="200" minlength="2"  class="form-control" required value="<%=ProVO.getDescripcionProceso()%>">
                                       
                                    </div>
                                    <div class="form-group">  
                                        Fecha proceso
                                        <input type="date" name="textFechaProceso" class="form-control" readonly  value="<%=ProVO.getFechaProceso()%>">
                                       
                                    </div>
                                    <div class="form-group">  
                                        Hora inicio
                                        <input type="time" name="textHorai" min="07:00" max="16:00"  class="form-control"  value="<%=ProVO.getHoraInicio()%>">
                                        
                                    </div>
                                    <div class="form-group">  
                                        Hora fin
                                        <input type="time" name="textHoraf" min="07:00" max="16:00"  class="form-control"  value="<%=ProVO.getHoraFin()%>">
                                       
                                    </div></div>
                                <div class="col-md-6"> 
                                    <div class="form-group">  
                                        Prendas realizadas<br>
                                        <input type="number" name="textPrendasr" class="form-control"  value="<%=ProVO.getPrendasRealizadas()%>">
                                       
                                    </div>
                                    <div class="form-group">  
                                        Estado Proceso<br>
                                        <select name="textEstado" class="form-control" required>
                                            <option></option>
                                            <option value="Activo">Activo</option>
                                            <option value="Inactivo">Inactivo</option>
                                        </select>
                                        
                                    </div>
                                    <div class="form-group">  
                                        Id Asig Orden
                                        <select name="textAsig" class="form-control" readonly>


                                            <option value="<%=ProVO.getIdAsigOrdenFK()%>"><%=ProVO.getIdAsigOrdenFK()%></option>

                                        </select>
                                       
                                    </div></div>
                                <div class=" col-md-6">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Actualizar</button>
                                    </center>
                                </div>  

                            </div> </div></div></div></div>
            <input type="hidden" value="2" name="opcion">
        </form>
        <% }%>
        <div style="color: red;">
            <%
                if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito} </div>
            <%  }%>
        </div>
<%@include file="footer.jsp"%>	  

</div></div></div>
 
    </center><%}%>
 

     <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>



        <!-- validacion de formularios -->
        <script src="JS/my-login.js"></script>
</body>
</html>
