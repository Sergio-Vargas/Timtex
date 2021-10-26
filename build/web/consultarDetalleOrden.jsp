<%-- 
    Document   : consultarDetalleOrden
    Created on : 29-ago-2021, 22:52:46
    Author     : sergio saenz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.DetalleOrdenDAO"%>
<%@page import="ModeloVO.DetalleOrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalle Orden</title>
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
        <h1>Lista de Detalles Orden</h1
         
         <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
          Nuevo Detalle Orden
        </button>
        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Registrar Detalle</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                     <%@include file="registrarDetalleOrden.jsp"%>
                  <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                  </div>
                </div>
            </div>
        </div>
        
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
                    <th>ID DETALLE ORDEN</th>
                    <th>CANTIDAD PRENDA</th>
                    <th>TALLA</th>
                    <th>ID ORDEN FK</th>
                    <th>ID PRENDA FK</th>
                    <th></th>
                    <th>ACCIÓN</th>
                </tr>
                </thead>
                <tbody>
                <%
                    DetalleOrdenVO DetaVO = new DetalleOrdenVO();
                    DetalleOrdenDAO DetaDAO = new DetalleOrdenDAO();
                    ArrayList<DetalleOrdenVO> listaDetalle = DetaDAO.listar();
                    for (int i = 0; i <listaDetalle.size(); i++) {
                    DetaVO =listaDetalle.get(i);
                %>
                <tr>
                    <td><%=DetaVO.getIdDetalleOrden()%></td>
                    <td><%=DetaVO.getCantidadPrenda()%></td>
                    <td><%=DetaVO.getTalla()%></td>
                    <td><%=DetaVO.getIdOrdenFK()%></td>
                    <td><%=DetaVO.getIdPrendaFK()%></td>
                    <td>
                        <form>
                        </form>
                    </td>
                    <td>
                    <form method="post" action="DetalleOrden">
                    <input type="hidden" name="textIdDetalleOrden" value="<%=DetaVO.getIdDetalleOrden()%>">
                    <button class="btn btn-primary">Editar</button>
                    <input type="hidden" value="3" name="opcion">
                    </form>
                    </td>
                </tr>
                <% } %>
                </tbody>
               <tr>
                    <th>ID DETALLE ORDEN</th>
                    <th>CANTIDAD PRENDA</th>
                    <th>TALLA</th>
                    <th>ID ORDEN FK</th>
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