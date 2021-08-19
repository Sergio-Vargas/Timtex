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
        <h1>Orden</h1>
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
                    <th>ID ORDEN</th>
                    <th>FECHA ORDEN</th>
                    <th>CANTIDAD PRENDA</th>
                    <th>ESTADO ORDEN</th>
                    <th>ID DATOS FK</th>
                    <th>ID PRENDA FK</th>
                    <th></th>
                    <th>ACCIÓN</th>
                </tr>
                </thead>
                <tr>
                    <th>ID ORDEN</th>
                    <th>FECHA ORDEN</th>
                    <th>CANTIDAD PRENDA</th>
                    <th>ESTADO ORDEN</th>
                    <th>ID DATOS FK</th>
                    <th>ID PRENDA FK</th>
                    <th></th>
                    <th>ACCIÓN</th>
                </tr> 
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
                    <td><%=OrdeVO.getCantidadPrenda()%></td>
                    <td><%=OrdeVO.getEstadoOrden()%></td>
                    <td><%=OrdeVO.getIdDatosFK()%></td>
                    <td><%=OrdeVO.getIdPrendaFK()%></td>
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
                <% } %>
                </tbody>
                
                <tr>
                    <th>ID ORDEN</th>
                    <th>FECHA ORDEN</th>
                    <th>CANTIDAD PRENDA</th>
                    <th>ESTADO ORDEN</th>
                    <th>ID DATOS FK</th>
                    <th>ID PRENDA FK</th>
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
