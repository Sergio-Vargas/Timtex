<%-- 
    Document   : actualizarDetalleOrden
    Created on : 29-ago-2021, 23:11:56
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.OrdenVO"%>
<%@page import="ModeloVO.PrendaVO"%>
<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloDAO.OrdenDAO"%>
<%@page import="ModeloVO.DetalleOrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Asignar</title>
    </head>
    <body>
    <center>
        <h1>Actualizar Asignar!</h1>
        <%
            DetalleOrdenVO DetaVO =(DetalleOrdenVO) request.getAttribute("identificacion consultada");
            if (DetaVO != null) {
        %>
        <form method="post" action="DetalleOrden">
            <table>
                <tr>
                    <th>
                        Id Detalle Orden<br>
                        <input type="text" name="textIdDetalleOrden" value="<%=DetaVO.getIdDetalleOrden()%>"><br><br>
                        Cantidad Prenda<br>
                        <input type="text" name="textCantidad" value="<%=DetaVO.getCantidadPrenda()%>"><br><br>
                        Talla<br>
                        <input type="text" name="textTalla" value="<%=DetaVO.getTalla()%>"><br><br>
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
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">
        </form><br><br>
        <% }%>
        <a href="consultarDetalleOrden.jsp">Volver</a><br><br>
        <div style="color: red;">

            <%
                if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito} </div>
            <%  }%>
        </div>

    </center>

</body>
</html>
