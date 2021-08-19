<%-- 
    Document   : consultarPrenda
    Created on : 11-ago-2021, 12:04:10
    Author     : sergio saenz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloVO.PrendaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prenda</title>
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
        <h1>Prenda</h1>
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
                    <th>ID PRENDA</th>
                    <th>IMAGEN PRENDA</th>
                    <th>NOMBRE PRENDA</th>
                    <th>TALLA</th>
                    <th>DESCRIPCION PRENDA</th>
                    <th>ESTADO PRENDA</th>
                    <th>ID TIPOPRENDA FK</th>
                    <th></th>
                    <th>ACCIÓN</th>
                </tr>
                </thead>
                <tr>
                    <th>ID PRENDA</th>
                    <th>IMAGEN PRENDA</th>
                    <th>NOMBRE PRENDA</th>
                    <th>TALLA</th>
                    <th>DESCRIPCION PRENDA</th>
                    <th>ESTADO PRENDA</th>
                    <th>ID TIPOPRENDA FK</th>
                    <th></th>
                    <th>ACCIÓN</th>
                </tr> 
                <tbody>
                <%
                    PrendaVO PreVO = new PrendaVO();
                    PrendaDAO PreDAO = new PrendaDAO();
                    ArrayList<PrendaVO> listaPrenda = PreDAO.listar();
                    for (int i = 0; i < listaPrenda.size(); i++) {

                    PreVO = listaPrenda.get(i);
                %>
                <tr>
                    <td><%=PreVO.getIdPrenda()%></td>
                    <td><img src="<%=PreVO.getImagenPrenda()%>"width="100px"></td>
                    <td><%=PreVO.getNombrePrenda()%></td>
                    <td><%=PreVO.getTalla()%></td>
                    <td><%=PreVO.getDescripcionPrenda()%></td>
                    <td><%=PreVO.getEstadoPrenda() %></td>
                    <td><%=PreVO.getIdTipoPrendaFK()%></td>
                    <td>
                        <form>
                        </form>
                    </td>
                    <td>
                    <form method="post" action="Prenda">
                    <input type="hidden" name="textIdPrenda" value="<%=PreVO.getIdPrenda()%>">
                    <button class="btn btn-primary">Editar</button>
                    <input type="hidden" value="3" name="opcion">
                    </form>
                    </td>
                </tr>
                <% } %>
                </tbody>
                <tr>
                    <th>ID PRENDA</th>
                    <th>IMAGEN PRENDA</th>
                    <th>NOMBRE PRENDA</th>
                    <th>TALLA</th>
                    <th>DESCRIPCION PRENDA</th>
                    <th>ESTADO PRENDA</th>
                    <th>ID TIPOPRENDA FK</th>
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
