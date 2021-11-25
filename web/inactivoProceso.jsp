<%-- 
    Document   : inactivoProceso
    Created on : 23-ago-2021, 19:44:10
    Author     : sergio saenz
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProcesoDAO"%>
<%@page import="ModeloVO.ProcesoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proceso</title>
    </head>
    
    <body>
         <%
                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1")) {

                            %>
         <center>
        <div class="container-fluid pt-8">
        <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="consultarProceso.jsp">Procesos</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Procesos Inactivos</li>
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
                        <h2 class="mb-0">Lista De Procesos Inactivos</h2>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table id="example" class="table table-striped table-bordered w-100 text-nowrap">
                                <thead>
                                    <tr>

                                        <th>ID PROCESO</th>
                    <th>DESCRIPCIÓN PROCESO</th>
                    <th>FECHA PROCESO</th>
                    <th>HORA INICIO</th>
                    <th>HORA FIN</th>
                    <th>PRENDAS REALIZADAS</th>
                    <th>ESTADO PROCESO</th>
                    <th>ID ASIG ORDEN FK</th>
                    <th></th>
                    <th>ACCIÓN</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <%
                    ProcesoVO ProVO = new ProcesoVO();
                    ProcesoDAO ProDAO = new ProcesoDAO();
                    ArrayList<ProcesoVO> listaProcesoIna = ProDAO.inactivo();
                    for (int i = 0; i < listaProcesoIna.size(); i++) {

                    ProVO = listaProcesoIna.get(i);
                %>
                                    <tr>
                                         <td><%=ProVO.getIdProceso()%></td>
                    <td><%=ProVO.getDescripcionProceso()%></td>
                    <td><%=ProVO.getFechaProceso()%></td>
                    <td><%=ProVO. getHoraInicio()%></td>
                    <td><%=ProVO.getHoraFin()%></td>
                    <td><%=ProVO.getPrendasRealizadas()%></td>
                    <td><%=ProVO.getEstadoProceso()%></td>
                    <td><%=ProVO.getIdAsigOrdenFK()%></td>
                                        <td>
                                            <form action="">    
                                            </form>
                                        </td>
                                        <td>
                                             <form method="post" action="Proceso">
                    <input type="hidden" name="textIdProceso" value="<%=ProVO.getIdProceso()%>">
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
