<%-- 
    Document   : registrarProceso
    Created on : 01-ago-2021, 19:36:00
    Author     : sara gabriela
--%>

<%@page import="ModeloVO.AsigOrdenVO"%>
<%@page import="ModeloDAO.AsigOrdenDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar proceso</title>
       
    </head>
    <body>
        <div class="container-fluid pt-8">
        <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="consultarProceso.jsp">Procesos</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Registrar Proceso</li>
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
                                    <div class="form-group">  
                                        Descripción proceso
                                        <input type="text" name="textDescripcion" maxlength="200" minlength="2"  class="form-control" required>
                                       
                                       
                                    </div>
                                    <div class="form-group">  
                                        Fecha proceso
                                        <input type="date" name="textFechaProceso" class="form-control" required>
                    
                                    </div>
                                    <div class="form-group">  
                                        Hora inicio
                                        <input type="time" name="textHorai" class="form-control" min="07:00" max="16:00" required>
                                        
                                    </div></div>
                                <div class="col-md-6"> 
                                    <div class="form-group">  
                                        Hora fin
                                        <input type="time" name="textHoraf" min="07:00" max="16:00" class="form-control" required>
                                       
                                    </div>
                                    <div class="form-group">  
                                        Prendas realizadas
                                        <input type="number" name="textPrendasr" class="form-control" required>
                                       
                                    </div>
                                    <div class="form-group">  
                                        <input type="hidden" name="textEstado" class="form-control" value="Activo">
                                    </div>
                                    <div class="form-group">  
                                        Id Asignación<br>
                                        <select name="textAsig" class="form-control" required>
                                            <option></option>
                                            <%
                                                AsigOrdenDAO AsigDAO = new AsigOrdenDAO();
                                                for (AsigOrdenVO AsigVO : AsigDAO.listar()) {
                                            %>
                                            <option value="<%=AsigVO.getIdAsigOrden()%>"><%=AsigVO.getIdAsigOrden()%></option>
                                            <% }%>
                                        </select>
                                        
                                    </div></div>
                                <div class=" col-md-6">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Registrar</button>
                                    </center>
                                </div>  


                            </div>    
                        </div> </div></div></div>
            <input type="hidden" value="1" name="opcion">
        </form>
        <div style="color: red;">
            <%
                if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito}</div>

            <%  }%>
        </div>

         <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>



        <!-- validacion de formularios -->
        <script src="JS/my-login.js"></script>
        <%@include file="footer.jsp"%>
    </body>
</html>
