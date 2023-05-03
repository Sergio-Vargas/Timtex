<%-- 
    Document   : consultarProceso
    Created on : 01-ago-2021, 18:42:26
    Author     : sara gabriela
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
            if (rol.equals("1") || rol.equals("3")) {

        %>
    <center>
        <div class="container-fluid pt-8">
            <div class="page-header mt-0 shadow p-3">
                <ol class="breadcrumb mb-sm-0">
                    <li class="breadcrumb-item"><a href="Usuario.jsp">Inicio</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Procesos</li>
                </ol>

            </div></div>

        <a href="inactivoProceso.jsp"><button class="btn btn-primary">Inactivos</button></a>
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
                        <h2 class="mb-0">Lista de Procesos</h2>
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
                                            <%
                                                rol = usuVO.getIdCargoFK();
                                                if (rol.equals("1")) {

                                            %>
                                        <th></th>
                                        <th>ACCIÓN</th>
                                            <%        }
                                            %>
                                    </tr>
                                </thead>

                                <tbody>
                                    <%
                                        ProcesoVO ProVO = new ProcesoVO();
                                        ProcesoDAO ProDAO = new ProcesoDAO();
                                        ArrayList<ProcesoVO> listaProceso = ProDAO.listar();
                                        for (int i = 0; i < listaProceso.size(); i++) {

                                            ProVO = listaProceso.get(i);
                                    %>
                                    <tr>
                                        <td><%=ProVO.getIdProceso()%></td>
                                        <td><%=ProVO.getDescripcionProceso()%></td>
                                        <td><%=ProVO.getFechaProceso()%></td>
                                        <td><%=ProVO.getHoraInicio()%></td>
                                        <td><%=ProVO.getHoraFin()%></td>
                                        <td><%=ProVO.getPrendasRealizadas()%></td>
                                        <td><%=ProVO.getEstadoProceso()%></td>
                                        <td><%=ProVO.getIdAsigOrdenFK()%></td>
                                        <%
                                            rol = usuVO.getIdCargoFK();
                                            if (rol.equals("1")) {

                                        %>
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
                                        <%
                                            }
                                        %>
                                    </tr>

                                    <% }%>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <form method="post" action="GenerarPDF.jsp" target="_blank">

                    <input type="submit" value="Tiempos de producción" button class="btn btn-primary">
                    <input type="hidden" value="Reportes/ReporteProceso.jasper" name="nombreReporte">

                </form>
                <br>
                <div>
                    <h2 class="mb-0">Reporte por estado</h2>
                </div>            
                <form method="post" action="GenerarPDF.jsp" target="_blank">
                    <div class="col-md-6">
                        <select name="textEstado" class="form-control" >
                            <option value="Activo">Activo</option>
                            <option value="Inactivo">Inactivo</option>
                        </select>
                        <br>
                        <input type="submit" value="Generar Reporte" button class="btn btn-primary">
                    </div>
                    <input type="hidden" value="Reportes/ReporteParametrizado.jasper" name="nombreReporte">
                </form>

            </div></div></div>

    <%@include file="footer.jsp"%>	  
    <%}%>

</body>
</html>
