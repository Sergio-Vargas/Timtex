<%-- 
    Document   : inactivoDatosPersonales
    Created on : 23-ago-2021, 18:28:44
    Author     : sergio saenz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>

        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800" rel="stylesheet">

        <!-- Icons -->
        <link href="assets/css/icons.css" rel="stylesheet">

        <!--Bootstrap.min css-->
        <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">

        <!-- Ansta CSS -->
        <link href="assets/css/dashboard.css" rel="stylesheet" type="text/css">

        <!-- Tabs CSS -->
        <link href="assets/plugins/tabs/style.css" rel="stylesheet" type="text/css">

        <!-- jvectormap CSS -->
        <link href="assets/plugins/jvectormap/jquery-jvectormap-2.0.2.css" rel="stylesheet" />

        <!-- Custom scroll bar css-->
        <link href="assets/plugins/customscroll/jquery.mCustomScrollbar.css" rel="stylesheet" />

        <!-- Sidemenu Css -->
        <link href="assets/plugins/toggle-sidebar/css/sidemenu.css" rel="stylesheet">
    </head>
    <body>
    <center>
        <h1>Lista de Datos Personales inactivos</h1>

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
                        <h2 class="mb-0">Datos inactivos</h2>
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