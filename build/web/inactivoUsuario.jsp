<%-- 
    Document   : consultarDatosPersonlaes
    Created on : 03-jul-2021, 19:16:11
    Author     : sergio saenz
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
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
                                        <li class="breadcrumb-item"><a href="consultarIngreso.jsp">Usuarios</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Usuarios Inactivos</li>
                                    </ol>

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
                    <h2 class="mb-0">Lista De Usuarios Inactivos</h2>
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table id="example" class="table table-striped table-bordered w-100 text-nowrap">
                            <thead>
                                <tr>

                                    <th class="wd-15p">ID USUARIO</th>
                                    <th class="wd-15p">NOMBRE USUARIO</th>
                                    <th class="wd-15p">CORREO</th>
                                    <th class="wd-15p">ESTADO USUARIO</th>
                                    <th class="wd-15p">CARGO</th>
                                    <th></th>
                                    <th class="wd-15p">ACCIÓN</th>

                                </tr>
                            </thead>

                            <tbody>
                                <%
                                    UsuarioDAO usuDAO = new UsuarioDAO();
                                    ArrayList<UsuarioVO> listaUsuarioInac = usuDAO.listarInactivos();
                                    for (int i = 0; i < listaUsuarioInac.size(); i++) {

                                        usuVO = listaUsuarioInac.get(i);
                                %>
                                <tr>
                                    <td><%=usuVO.getIdUsuario()%></td>
                                    <td><%=usuVO.getNombreUsuario()%></td>
                                    <td><%=usuVO.getCorreoDatos()%></td>
                                    <td><%=usuVO.getEstadoUsu()%></td>
                                    <td><%=usuVO.getIdCargoFK()%></td>
                                    <td>
                                        <form action="">    
                                        </form>
                                    </td>
                                    <td>
                                      <form method="post" action="Usuario">
                                            <input type="hidden" name="textId" value="<%=usuVO.getIdUsuario()%>">
                                            <input type="hidden" name="textEstado" value="Activo" class="form-control" required>
                                            <button class="btn btn-primary">Editar</button>
                                            <input type="hidden" value="6" name="opcion">
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
