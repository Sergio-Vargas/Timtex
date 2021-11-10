<%-- 
    Document   : consultarDatosPersonlaes
    Created on : 03-jul-2021, 19:16:11
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
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>

    <script src="JS/my-login.js"></script>


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
    <body>
    <center>
        <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
            Nuevo usuario
        </button>
        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h3 class="modal-title" id="exampleModalLabel">Registrar Datos Personales</h3>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <%@include file="registrarDatosPersonales.jsp"%>


                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                    </div>
                </div>
            </div>
        </div>

    </center>
    <a href="inactivoDatosPersonales.jsp"><button class="btn btn-primary">Inactivos</button></a>
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
                    <h2 class="mb-0">Datos Personales</h2>
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table id="example" class="table table-striped table-bordered w-100 text-nowrap">
                            <thead>
                                <tr>

                                    <th class="wd-15p">ID DATOS</th>
                                    <th class="wd-15p">NOMBRE</th>
                                    <th class="wd-15p">APELLIDO</th>
                                    <th class="wd-15p">DIRECCION</th>
                                    <th class="wd-15p">TELEFONO</th>
                                    <th class="wd-15p">CORREO</th>
                                    <th class="wd-15p">ESTADO</th>
                                    <th class="wd-15p">ID USUARIO</th>
                                    <th class="wd-15p"></th>
                                    <th class="wd-15p">ACCIÓN</th>

                                </tr>
                            </thead>

                            <tbody>
                                <%
                                    DatosPersonalesVO datVO = new DatosPersonalesVO();
                                    DatosPersonalesDAO datDAO = new DatosPersonalesDAO();
                                    ArrayList<DatosPersonalesVO> listaDatosPersonales = datDAO.listar();
                                    for (int i = 0; i < listaDatosPersonales.size(); i++) {

                                        datVO = listaDatosPersonales.get(i);
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
