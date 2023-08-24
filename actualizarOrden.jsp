<%-- 
    Document   : actualizarOrden
    Created on : 29-jul-2021, 18:49:52
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.PrendaVO"%>
<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page import="ModeloVO.OrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Orden</title>

    </head>
    <body>
        <%
            rol = usuVO.getIdCargoFK();
            if (rol.equals("1") || rol.equals("3")) {

        %>
    <center>
        <!-- Page content -->
        <div class="container-fluid pt-8">
            <div class="page-header mt-0 shadow p-3">
                <ol class="breadcrumb mb-sm-0">
                    <li class="breadcrumb-item"><a href="consultarOrden.jsp">Ordenes</a></li>
                    <li class="breadcrumb-item active">Actualizar</li>

                </ol>

            </div></div>
            <%            OrdenVO OrdeVO = (OrdenVO) request.getAttribute("identificacion consultada");
                if (OrdeVO != null) {
            %>
        <form method="post" action="Orden" id="basic-form"  class="my-login-validation form"  novalidate="">
            <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <div class="card shadow">
                        <div class="card-header">
                            <h2 class="mb-0">Actualizar Orden</h2>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-6">
                                    <input type="hidden" name="textOrden" value="<%=OrdeVO.getIdOrden()%>">
                                    <div class="form-group"> 
                                        Fecha Orden
                                        <input type="date" name="textFecha" value="<%=OrdeVO.getFechaOrden()%>" readonly class="form-control">

                                    </div></div>
                                <div class="col-md-6">
                                    <div class="form-group"> 
                                        Estado Orden
                                        <select name="textEstado" class="form-control" required>
                                            <option></option>
                                            <option value="Activo">Activo</option>
                                            <option value="Inactivo">Inactivo</option>
                                        </select>
                                    </div></div>
                                <div class="col-md-12">
                                    <div class="form-group"> 
                                        Id Datos
                                        <input type="text" name="textIdDato" value="<%=OrdeVO.getIdDatosFK()%>" readonly class="form-control" required>
                                    </div></div>
                                <div class=" col-md-6">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Actualizar</button>
                                    </center>
                                </div>  
                                <div class=" col-md-6">
                                    <a href="consultarOrden.jsp" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Volver</a>
                                </div>    

                            </div>    
                        </div>          
                    </div>    
                </div>
                <div class="col-md-2"></div>
            </div>     
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


        <%}%>
        <%@include file="footer.jsp"%>	  

        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>



        <!-- validacion de formularios -->
        <script src="JS/my-login.js"></script>
    </body>
</html>