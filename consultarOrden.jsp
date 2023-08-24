<%-- 
    Document   : consultarOrden
    Created on : 29-jul-2021, 12:37:02
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
                                        <li class="breadcrumb-item"><a href="Usuario.jsp">Inicio</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Ordenes</li>
                                    </ol>

        </div>
          
         <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
          Nueva orden
        </button>
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
       
    </center>             
    <div class="row">
        <div class="col-md-12">
            <div class="card shadow">
                <div class="card-header">
                    <h2 class="mb-0">Lista de Ordenes</h2>
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
                            
        </div></div></div>
 
<%}%>
<%@include file="footer.jsp"%>	  
                
    </body>
</html>
