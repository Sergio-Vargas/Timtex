<%-- 
    Document   : consultarAsignar
    Created on : 07-ago-2021, 19:16:13
    Author     : sergio saenz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.AsigOrdenDAO"%>
<%@page import="ModeloVO.AsigOrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignar</title>
        <link href="Estilos/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="Estilos/dataTables.bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <style>
	
.estilotabla{
	width: 1000px;
	border-radius: 8px;
	padding:20px;
	background-color: white;
	box-shadow: 0px 0px 10px 1px gray;
	height:auto;
}
 @media screen and (max-width: 800px) { 
	.Ctabla{
	width:480px;
	border-radius: 8px;
	background-color: white;
	box-shadow: 0px 0px 10px 1px gray;
	height:600px;
}
} 
</style>
    <body>
    <center>
        <h1>Asignar</h1>
        <div style="color: red;">

            <%if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito}</div>

            <%  }%>
        </div>
        <form>
            <div class="estilotabla Ctabla"><br>
            <table class="table display AllDataTables table-striped table-responsive">
                <thead>
                <tr>
                    <th>ID ASIG ORDEN</th>
                    <th>CANTIDAD PRENDA</th>
                    <th>FECHA INICIO</th>
                    <th>FECHA FIN</th>
                    <th>ID DATOSFK</th>
                    <th>ID ORDENFK</th>
                    <th></th>
                    <th>ACCIÓN</th>
                </tr>
                </thead>
                <tr>
                    <th>ID ASIG ORDEN</th>
                    <th>CANTIDAD PRENDA</th>
                    <th>FECHA INICIO</th>
                    <th>FECHA FIN</th>
                    <th>ID DATOSFK</th>
                    <th>ID ORDENFK</th>
                    <th></th>
                    <th>ACCIÓN</th>
                </tr> 
                <tbody>
                <%
                    AsigOrdenVO AsigVO = new AsigOrdenVO();
                    AsigOrdenDAO AsigDAO = new AsigOrdenDAO();
                    ArrayList<AsigOrdenVO> listaAsig = AsigDAO.listar();
                    for (int i = 0; i <listaAsig.size(); i++) {
                    AsigVO =listaAsig.get(i);
                %>
                <tr>
                    <td><%=AsigVO.getIdAsigOrden()%></td>
                    <td><%=AsigVO.getCantidadPrenda()%></td>
                    <td><%=AsigVO.getFechaInicio()%></td>
                    <td><%=AsigVO.getFechaFin()%></td>
                    <td><%=AsigVO.getIdDatosFK()%></td>
                    <td><%=AsigVO.getIdOrdenFK()%></td>
                    <td>
                        <form>
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
                <% } %>
                </tbody>
                <tr>
                    <th>ID ASIG ORDEN</th>
                    <th>CANTIDAD PRENDA</th>
                    <th>FECHA INICIO</th>
                    <th>FECHA FIN</th>
                    <th>ID DATOSFK</th>
                    <th>ID ORDENFK</th>
                    <th></th>
                    <th>ACCIÓN</th>
                </tr>    
            </table>
            </div>
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
