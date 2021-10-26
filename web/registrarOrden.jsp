<%-- 
    Document   : registrarOrden
    Created on : 29-jul-2021, 12:57:04
    Author     : sergio saenz
--%>

<%@page import="Controlador.ControladorPrenda"%>
<%@page import="ModeloVO.DetalleOrdenVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.PrendaVO"%>
<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     HttpSession miSesion = request.getSession(true);
     ArrayList<DetalleOrdenVO> detalle = miSesion.getAttribute("carrito") == null ? null : (ArrayList) miSesion.getAttribute("carrito");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Orden</title>
        <link href="Estilos/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="JS/icons.js" type="text/javascript"></script>
    </head>
    <body>
    <center>
        <h1>Registrar Orden</h1>
         <form method="post" action="Orden">
            <table>
                <tr>
                    <th>
                        <input type="hidden" name="textOrden"><br><br>
                        Fecha Orden<br>
                        <input type="text" name="textFecha"><br><br>
                        Estado Orden<br>
                        <select name="textEstado">
                        <option value="Activo">Activo</option>
                        </select><br>
                        Id Datos<br>
                        <select name="textIdDato">
                        <option>Seleccione...</option>
                        <%
                        DatosPersonalesDAO datDAO = new DatosPersonalesDAO();    
                        for (DatosPersonalesVO datVO : datDAO.listar()) {
                        %>
                        <option value="<%=datVO.getIdDatos()%>"><%=datVO.getNombreDatos()%></option>
                        <% }%>
                        </select><br>
                        <td></td><br>
                </th>
            </table>
            <button>Registar</button>
            <input type="hidden" value="1" name="opcion">
        </form><br><br>
       
        <div class="table-responsive cart_info" id="cart-container">
                            <table class="table table-condensed" id="shop-table">
					<thead>
						<tr class="cart_menu">
							<td class="image">Prenda</td>
                                                        <td class="description">Nombre</td>
							<td class="quantity">IdPrenda</td>
                                                        <td>IdOrden</td>
							<td class="total">Cantidad</td>                                                    
							<td class="total">Talla</td>
                                                        <td></td>
                                                        <td></td>
						</tr>
					</thead>
					<tbody>
                                                
                                             <%
                                                    ControladorPrenda pre = new ControladorPrenda();                                                    
                                                    if(detalle != null){
                                                    for(DetalleOrdenVO d : detalle){
                                                        PrendaVO PreVO = pre.consultarDatos(d.getIdPrendaFK());   
                                                           
                                                %>   
						<tr>
							<td class="cart_product">
                                                            <a href=""><img src="<%=PreVO.getImagenPrenda()%>" alt="" width="120"></a>
							</td>
							<td class="cart_description">
								<h4><%=PreVO.getNombrePrenda()%></h4>
							</td>
                                                        <form method="post" action="DetalleOrden">
                                                           
                                                        <input type="hidden"  name="textIdDetalleOrden" >
                                                        
                                                        <td class="cart_description">
							<input type="text" name="textIdPrendaFK" value="<%=PreVO.getIdPrenda()%>">
							</td>
							<td class="cart_price">
                                                        <input type="text" name="textIdOrdenFK"></p>
							</td>
							<td class="cart_quantity">							
                                                        <input  type="text" name="textCantidad" value="<%=d.getCantidadPrenda()%>">
							</td>
                                                        <td class="cart_price">
                                                        <input type="text" name="textTalla" value="<%=d.getTalla()%>">
                                                        </td>
                                                        <td class="cart_delete">
                                                            <span id="idarticulo" style="display:none;"><%=PreVO.getIdPrenda()%></span>
                                                            <a class="cart_quantity_delete" href="" id="deleteitem"><i class="fa fa-times"></i></a>
                                                        </td>
                                                        <td>
                                                             <button>Registar</button>
                                                             <input type="hidden" value="1" name="opcion">
                                                             </form>
                                                        </td>
						</tr>
                                                 <%}}%>        
					</tbody>
				</table>
                                <% if (detalle == null){%>
                                <h4>No hay Articulos en el carro</h4>
                                <%}%>
        
       <a href="Cliente.jsp">Seguir Comprando</a> 
        <div style="color: red;">
            <%
                if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito}</div>

            <%  }%>
        </div>
    </center>
    </body>
    <script src="JS/carrito.js" type="text/javascript"></script>
</html>
