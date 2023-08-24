<%-- 
    Document   : consultarAsignar
    Created on : 07-ago-2021, 19:16:13
    Author     : Luis martinez
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.AsigOrdenDAO"%>
<%@page import="ModeloVO.AsigOrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignar</title>
    </head>

    <body>
         <div class="container-fluid pt-8">
        <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="Usuario.jsp">Inicio</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Asignaciones</li>
                                    </ol>

        </div>
    <center>
        <h1>Lista de Asignaciones</h1
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
                        <h2 class="mb-0">Asignaciones</h2>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table id="example" class="table table-striped table-bordered w-100 text-nowrap">
                                <thead>
                                    <tr>

                                        <th>ID ASIG ORDEN</th>
                                        <th>CANTIDAD PRENDA</th>
                                        <th>FECHA INICIO</th>
                                        <th>FECHA FIN</th>
                                        <th>ID DATOSFK</th>
                                        <th>ID DETALLE FK</th>
                                        <th>ESTADO</th>
                                        <th></th>
                                        <th>ACCIÓN</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <%
                                        AsigOrdenVO AsigVO = new AsigOrdenVO();
                                        AsigOrdenDAO AsigDAO = new AsigOrdenDAO();
                                        ArrayList<AsigOrdenVO> listaAsig = AsigDAO.listar();
                                        for (int i = 0; i < listaAsig.size(); i++) {
                                            AsigVO = listaAsig.get(i);
                                    %>
                                    <tr>
                                        <td><%=AsigVO.getIdAsigOrden()%></td>
                                        <td><%=AsigVO.getCantidadPrenda()%></td>
                                        <td><%=AsigVO.getFechaInicio()%></td>
                                        <td><%=AsigVO.getFechaFin()%></td>
                                        <td><%=AsigVO.getIdDatosFK()%></td>
                                        <td><%=AsigVO.getIdDetalleOrdenFK()%></td>
                                        <td><%=AsigVO.getEstadoAsig()%></td>
                                        <td>
                                            <form action="">    
                                            </form>
                                        </td>
                                        <td>
                                            <form method="post" action="AsigOrden">
                                                <input type="hidden" name="textAsigOrden" value="<%=AsigVO.getIdAsigOrden()%>">
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

          
                </body>
                </html>
