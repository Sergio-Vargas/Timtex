<%-- 
    Document   : consultarDatosPersonlaes
    Created on : 03-jul-2021, 19:16:11
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
    <body>
                    <%

                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1")) {

                            %>
     <center>
        <div class="container-fluid pt-8">
        <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="Usuario.jsp">Inicio</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Datos De Usuarios</li>
                                    </ol>

        </div>
          
         <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
          Nuevos Datos
        </button>
                        <a href="inactivoDatosPersonales.jsp"><button class="btn btn-primary">Inactivos</button></a>

        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Lista de ordenes</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                    <%@include file="registrarDatosPersonales.jsp"%>
                    
                
                </div>
            </div>
        </div>
        <div style="color: red;">

            <%if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito}</div>

            <%  }%>

        </div>

    </center>  



     <div class="row">
        <div class="col-md-12">
            <div class="card shadow">
                <div class="card-header">
                    <h2 class="mb-0">Lista De Datos Personales</h2>
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

  </div></div></div>
 
<%@include file="footer.jsp"%>	  
<%}%>
                         
  <!-- Core -->
           <script src="assets/js/popper.js"></script>
	<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
         
            <!-- Optional JS -->
            <script src="assets/plugins/chart.js/dist/Chart.min.js"></script>
            <script src="assets/plugins/chart.js/dist/Chart.extension.js"></script>

            <!-- Data tables -->
            <script src="assets/plugins/datatable/jquery.dataTables.min.js"></script>
            <script src="assets/plugins/datatable/dataTables.bootstrap4.min.js"></script>

           
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
