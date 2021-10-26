<%-- 
    Document   : registrarDetalleOrden
    Created on : 29-ago-2021, 23:02:11
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.PrendaVO"%>
<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloVO.OrdenVO"%>
<%@page import="ModeloDAO.OrdenDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Detalle</title>
    </head>
    <body>
    <center>
        <h1>Registrar Detalle</h1>
       <form method="post" action="DetalleOrden">
            <table>
                <tr>
                    <th>
                        Id Detalle Orden<br>
                        <input type="hidden" name="textIdDetalleOrden"><br><br>
                        Cantidad Prenda<br>
                        <input type="text" name="textCantidad"><br><br>
                        Talla<br>
                        <input type="text" name="textTalla" ><br><br>
                         Id Orden FK<br>
                        <select name="textIdOrdenFK">
                        <option>Seleccione...</option>
                        <%
                        OrdenDAO OrdeDAO = new OrdenDAO();    
                        for (OrdenVO OrdeVO : OrdeDAO.listar()) {
                        %>
                        <option value="<%=OrdeVO.getIdOrden()%>"><%=OrdeVO.getIdOrden()%></option>
                        <% }%>
                        </select><br>
                        Id Prenda FK<br>
                         <select name="textIdPrendaFK">
                        <option>Seleccione...</option>
                        <%
                        PrendaDAO preDAO = new PrendaDAO();    
                        for (PrendaVO preVO : preDAO.listar()) {
                        %>
                        <option value="<%=preVO.getIdPrenda()%>"><%=preVO.getNombrePrenda()%></option>
                        <% }%>
                        </select><br>
                </th>
            </table>
            <button>Registar</button>
            <input type="hidden" value="1" name="opcion">
        </form><br><br>
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
</html>