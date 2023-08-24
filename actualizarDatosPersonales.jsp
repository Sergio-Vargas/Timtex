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

    </head>
    <body>
           <%
                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1")) {

                            %>
        <div class="container-fluid pt-8">
        <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="consultarDatosPersonales.jsp">Datos De Usuarios</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Actualizar Datos</li>
                                    </ol>

        </div></div>

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
                                        
                                    </div></div>
                                        <div class="col-md-6"> 
                                    <div class="form-group"> 
                                        Telefono
                                        <input type="number" name="textTelefono" value="<%=datVO.getTelefonoDatos()%>" class="form-control" required>

                                    </div>
                                
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
                                       
                                        <input type="hidden" name="textUsuario"  value="<%=datVO.getIdUsuarioFK()%>" readonly  class="form-control" required>
                                        
                                    </div></div></div>
                                        <div class="row">
                                            <div class=" col-md-4"></div>            
                                <div class=" col-md-4">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Actualizar</button>
                                    </center>
                                </div>  
                                            <div class=" col-md-4"></div> 
                            </div> </div></div></div>
                <input type="hidden" value="2" name="opcion">
                </form><br><br>
                <% }%>
                </a>
                <div style="color: red;">

                    <%
                if (request.getAttribute("MensajeError") != null) { %>
                    ${MensajeError}     

                    <%} else {%>
                    <div style="color: greenyellow">${MensajeExito} </div>
                    <%  }%>
                </div> </div>
                    </div>
                </div> 
  <%@include file="footer.jsp"%>	  

<% }%>

                <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>

                <script src="JS/my-login.js"></script>
                
                </body>
                </html>



