<%-- 
    Document   : consultarProceso
    Created on : 01-ago-2021, 18:42:26
    Author     : sara gabriela
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProcesoDAO"%>
<%@page import="ModeloVO.ProcesoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proceso</title>
        <link href="Estilos/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="Estilos/dataTables.bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <style>
	
.estilotabla{
	width: 1000px;
	border-radius: 8px;
	padding:10px;
	background-color: white;
	box-shadow: 0px 0px 10px 1px gray;
	height:auto;
}
@media screen and (max-width: 800px) { 
	.Ctabla{
	width:470px;
	border-radius: 8px;
	background-color: white;
	box-shadow: 0px 0px 10px 1px gray;
	height:620px;
}
} 
</style>
    <body>
    <center>
        <h1>Lista de Procesos</h1>
         <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
          Nuevo Proceso
        </button>
        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Registrar Proceso</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                    <%@include file="registrarProceso.jsp"%>
                    
                  <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                  </div>
                </div>
            </div>
        </div>
        <a href="inactivoProceso.jsp"><button class="btn btn-primary">Inactivos</button></a>
        <div style="color: red;">

            <%if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito}</div>

            <%  }%>

        </div>
        <form>
            <div class="estilotabla Ctabla"><br>
            <table class="table display AllDataTables table-striped ">
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
                    ArrayList<ProcesoVO> listaProceso = ProDAO.listar();
                    for (int i = 0; i < listaProceso.size(); i++) {

                    ProVO = listaProceso.get(i);
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
                        <form>
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
                <% } %>
                </tbody>
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
            </table>
            </div>
        </form>
        <form method="post" action="GenerarPDF.jsp" target="_blank">
            
            <input type="submit" value="Generar Reporte" button class="btn btn-primary">
            <input type="hidden" value="Reportes/ReporteProcesos.jasper" name="nombreReporte">
            
        </form>
                
    </center>
    <script src="JS/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="JS/bootstrap.min.js" type="text/javascript"></script>
    <script src="JS/jquery.dataTables.min.js" type="text/javascript"></script>
    <script src="JS/dataTables.bootstrap.min.js" type="text/javascript"></script>
    <script>
		  $(document).ready( function () {
		    $('.AllDataTables').DataTable({
				"deferRender":true,
				"scroller":true,
				"aScrollX":"100%",
			    "sScrollY":"300px",
			    "bScrollCollapse":true
		    });
		} );
              
	</script>
</body>
</html>
