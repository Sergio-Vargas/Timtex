<%-- 
    Document   : registrarAsignar
    Created on : 07-ago-2021, 22:44:10
    Author     : Luis martinez
--%>

<%@page import="ModeloVO.DetalleOrdenVO"%>
<%@page import="ModeloDAO.DetalleOrdenDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignar Orden</title>
    </head>
    <body>
        <div class="container-fluid pt-8">
            <div class="page-header mt-0 shadow p-3">
                <ol class="breadcrumb mb-sm-0">
                    <li class="breadcrumb-item"><a href="Usuario.jsp">Inicio</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Registrar Asignacion</li>
                </ol>
            </div>
        </div>    
            <form method="post" action="AsigOrden" class="my-login-validation" id="basic-form" novalidate="">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card shadow">
                            <div class="card-header">
                                <h2 class="mb-0">Asignar Una Orden</h2>
                            </div>
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-6"> 
                                        <div class="form-group">  
                                            Cantidad Prenda
                                            <input type="number" name="textCantidadAsignar"  class="form-control" required >

                                        </div>    
                                        <div class="form-group">  
                                            Fecha Inicio
                                            <input type="date" name="textFechaInicio"  class="form-control" required>

                                        </div>
                                        <div class="form-group">              
                                            Fecha Fin<br>
                                            <input type="date" name="textFechaFin"  class="form-control" required>

                                        </div></div>
                                    <div class="col-md-6"> 
                                        <div class="form-group">              
                                            Id Datos FK
                                            <select name="textIdDatos"  class="form-control" required>
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
                                            <select name="textIdDetalleOrdenFK"  class="form-control" required>
                                                <option></option>
                                                <%
                                                    DetalleOrdenDAO DetaDAO = new DetalleOrdenDAO();
                                                    for (DetalleOrdenVO DetaVO : DetaDAO.listar()) {
                                                %>
                                                <option value="<%=DetaVO.getIdDetalleOrden()%>"><%=DetaVO.getIdDetalleOrden()%></option>
                                                <% }%>
                                            </select>

                                        </div>
                                        <input type="hidden" value="Activa" name="textEstado">
                                    </div>       

                                </div>
                                <div class="row">
                                    <div class=" col-md-4"></div>
                                    <div class=" col-md-4">
                                        <center>
                                            <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Registrar</button>
                                        </center>
                                    </div>
                                    <div class=" col-md-4"></div>
                                        
                                </div>
                            </div>    
                        </div> </div></div>
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


            <%@include file="footer.jsp"%>

    </body>
</html>
