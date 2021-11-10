<%-- 
    Document   : consultarOrden
    Created on : 29-jul-2021, 12:37:02
    Author     : sergio saenz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.OrdenDAO"%>
<%@page import="ModeloVO.OrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Orden</title>
        
        
         
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
        <h1>Lista de Ordenes</h1>
          
         <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
          Nueva orden
        </button>
        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Registrar Orden</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                    <%@include file="registrarOrden.jsp"%>
                    
                  <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                  </div>
                </div>
            </div>
        </div>
        <a href="inactivoOrden.jsp"><button class="btn btn-primary">Inactivos</button></a>
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
                    <h2 class="mb-0">Ordenes</h2>
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
                    ArrayList<OrdenVO> listaOrden = OrdeDAO.listar();
                    for (int i = 0; i < listaOrden.size(); i++) {

                    OrdeVO = listaOrden.get(i);
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
