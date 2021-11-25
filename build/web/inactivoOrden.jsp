<%-- 
    Document   : inactivoOrden
    Created on : 23-ago-2021, 19:02:05
    Author     : sergio saenz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.OrdenDAO"%>
<%@page import="ModeloVO.OrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Orden</title>

        
    </head>

    <body>
         <%
                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1") || rol.equals("3")) {

                            %>
        <center>
        <div class="container-fluid pt-8">
        <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="consultarOrden.jsp">Ordenes</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Ordenes Inactivas</li>
                                    </ol>

        </div>
            
        
    <center>

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
                        <h2 class="mb-0">Ordenes Inactivas</h2>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table id="example" class="table table-striped table-bordered w-100 text-nowrap">
                                <thead>
                                    <tr>

                                        <th>ID ORDEN</th>
                                        <th>FECHA ORDEN</th>
                                        <th>ESTADO ORDEN</th>
                                        <th>ID DATOS FK</th>
                                        <th></th>
                                        <th>ACCIÓN</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <%
                                        OrdenVO OrdeVO = new OrdenVO();
                                        OrdenDAO OrdeDAO = new OrdenDAO();
                                        ArrayList<OrdenVO> listaOrdenIna = OrdeDAO.inactivo();
                                        for (int i = 0; i < listaOrdenIna.size(); i++) {

                                            OrdeVO = listaOrdenIna.get(i);
                                    %>
                                    <tr>
                                        <td><%=OrdeVO.getIdOrden()%></td>
                                        <td><%=OrdeVO.getFechaOrden()%></td>
                                        <td><%=OrdeVO.getEstadoOrden()%></td>
                                        <td><%=OrdeVO.getIdDatosFK()%></td>
                                        <td>
                                            <form action="">    
                                            </form>
                                        </td>
                                        <td>
                                            <form method="post" action="Orden">
                                                <input type="hidden" name="textOrden" value="<%=OrdeVO.getIdOrden()%>">
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
