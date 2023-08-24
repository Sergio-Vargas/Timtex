<%-- 
    Document   : inactivoDatosPersonales
    Created on : 23-ago-2021, 18:28:44
    Author     : sergio saenz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
        </head>
    <body>
    <center>
        
         <%
                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1")) {

                            %>
         <center>
        <div class="container-fluid pt-8">
        <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="consultarDatosPersonales.jsp">Datos De Usuarios</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Datos De Usuarios Inactivas</li>
                                    </ol>

        </div>
        
        <div style="color: red;">

            <%if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito}</div>

            <%  }%>

        </div>


        <div class="row">
            <div class="col-md-12">
                <div class="card shadow">
                    <div class="card-header">
                        <h2 class="mb-0">Lista De Datos Personales Inactivos</h2>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table id="example" class="table table-striped table-bordered w-100 text-nowrap">
                                <thead>
                                    <tr>

                                        <th>ID DATOS</th>
                                        <th>NOMBRE</th>
                                        <th>APELLIDO</th>
                                        <th>DIRECCION</th>
                                        <th>TELEFONO</th>
                                        <th>CORREO</th>
                                        <th>ESTADO</th>
                                        <th>ID USUARIO</th>
                                        <th></th>
                                        <th>ACCION</th>   
                                    </tr>
                                </thead>

                                <tbody>
                                    <%
                                        DatosPersonalesVO datVO = new DatosPersonalesVO();
                                        DatosPersonalesDAO datDAO = new DatosPersonalesDAO();
                                        ArrayList<DatosPersonalesVO> listaDatosPersonalesIna = datDAO.inactivo();
                                        for (int i = 0; i < listaDatosPersonalesIna.size(); i++) {

                                            datVO = listaDatosPersonalesIna.get(i);
                                    %>
                                    <tr>
                                        <td><%=datVO.getIdDatos()%></td>
                                        <td><%=datVO.getNombreDatos()%></td>
                                        <td><%=datVO.getApellidoDatos()%></td>
                                        <td><%=datVO.getDireccionDatos()%></td>
                                        <td><%=datVO.getTelefonoDatos()%></td>
                                        <td><%=datVO.getCorreoDatos()%></td>
                                        <td><%=datVO.getEstadoDatos()%></td>
                                        <td><%=datVO.getIdUsuarioFK()%></td>
                                        <td>
                                            <form action="">    
                                            </form>
                                        </td>
                                        <td>
                                            <form method="post" action="DatosPersonales">
                                                <input type="hidden" name="textNumeroid" value="<%=datVO.getIdDatos()%>">
                                                <button class="btn btn-primary">Editar</button>
                                                <input type="hidden" value="3" name="opcion">
                                            </form>
                                        </td>
                                    </tr>

                                    <% }%>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div> 
                                  <%@include file="footer.jsp"%>	  

<% }%>

                <!-- Ansta Scripts -->
                <!-- Core -->
                <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
                <script src="assets/js/popper.js"></script>
                <script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>

                <!-- Optional JS -->
                <script src="assets/plugins/chart.js/dist/Chart.min.js"></script>
                <script src="assets/plugins/chart.js/dist/Chart.extension.js"></script>

                <!-- Data tables -->
                <script src="assets/plugins/datatable/jquery.dataTables.min.js"></script>
                <script src="assets/plugins/datatable/dataTables.bootstrap4.min.js"></script>

                <!-- Fullside-menu Js-->
                <script src="assets/plugins/toggle-sidebar/js/sidemenu.js"></script>

                <!-- Custom scroll bar Js-->
                <script src="assets/plugins/customscroll/jquery.mCustomScrollbar.concat.min.js"></script>

                <!-- Ansta JS -->
                <script src="assets/js/custom.js"></script>
                <script>
                    $(function (e) {
                        $('#example').DataTable();


                        $('#example2').DataTable({
                            "scrollY": "200px",
                            "scrollCollapse": true,
                            "paging": false
                        });
                    });

                </script>

                </body> 
                </html>