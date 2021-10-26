<%-- 
    Document   : consultarDatosPersonlaes
    Created on : 03-jul-2021, 19:16:11
    Author     : sergio saenz
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
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
        <h1>Lista de Datos Personales</h1>
          
         <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
          Nuevo usuario
        </button>
        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Registrar Datos Personales</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                    <%@include file="registrarDatosPersonales.jsp"%>
                    
                  <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                  </div>
                </div>
            </div>
        </div>
        <a href="inactivoDatosPersonales.jsp"><button class="btn btn-primary">Inactivos</button></a>
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
                    <th>ID DATOS</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    <th>DIRECCION</th>
                    <th>TELEFONO</th>
                    <th>CORREO</th>
                    <th>ESTADO</th>
                    <th>ID USUARIO</th>
                    <th></th>
                    <th>ACCION</th>   
                </tr>
                </thead>
                <tbody>
                  
                <%
                    DatosPersonalesVO datVO = new DatosPersonalesVO();
                    DatosPersonalesDAO datDAO = new DatosPersonalesDAO();
                    ArrayList<DatosPersonalesVO> listaDatosPersonales = datDAO.listar();
                    for (int i = 0; i < listaDatosPersonales.size(); i++) {

                    datVO = listaDatosPersonales.get(i);
                %>
                <tr>
                    <td><%=datVO.getIdDatos()%></td>
                    <td><%=datVO.getNombreDatos()%></td>
                    <td><%=datVO.getApellidoDatos()%></td>
                    <td><%=datVO.getDireccionDatos()%></td>
                    <td><%=datVO.getTelefonoDatos()%></td>
                    <td><%=datVO.getCorreoDatos()%></td>
                    <td><%=datVO.getEstadoDatos()%></td>
                    <td><%=datVO.getIdUsuarioFK()%></td>
                    <td>
                        <form action="">    
                        </form>
                    </td>
                    <td>
                    <form method="post" action="DatosPersonales">
                        <input type="hidden" name="textNumeroid" value="<%=datVO.getIdDatos()%>">
                        <button class="btn btn-primary">Editar</button>
                        <input type="hidden" value="3" name="opcion">
                    </form>
                    </td>
                </tr>
                <% } %>
                </tbody>
                <tr>
                    <th>ID DATOS</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    <th>DIRECCION</th>
                    <th>TELEFONO</th>
                    <th>CORREO</th>
                    <th>ESTADO</th>
                    <th>ID USUARIO</th>
                    <th></th>
                    <th>ACCION</th> 
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
