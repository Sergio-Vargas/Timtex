<%-- 
    Document   : actualizarAsignar
    Created on : 07-ago-2021, 19:32:44
    Author     : Luis martinez
--%>

<%@page import="ModeloVO.DetalleOrdenVO"%>
<%@page import="ModeloDAO.DetalleOrdenDAO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloVO.OrdenVO"%>
<%@page import="ModeloDAO.OrdenDAO"%>
<%@page import="ModeloVO.AsigOrdenVO"%>
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
            AsigOrdenVO AsigVO =(AsigOrdenVO) request.getAttribute("identificacion consultada");
            if (AsigVO != null) {
        %>
        <form method="post" action="AsigOrden">
            <table>
                <tr>
                    <th>
                        <input type="hidden" name="textAsigOrden" value="<%=AsigVO.getIdAsigOrden()%>"><br><br>
                        Cantidad Prenda<br>
                        <input type="text" name="textCantidad" value="<%=AsigVO.getCantidadPrenda()%>"><br><br>
                        Fecha Inicio<br>
                        <input type="text" name="textFechaInicio" value="<%=AsigVO.getFechaInicio()%>"><br><br>
                        Fecha Fin<br>
                        <input type="text" name="textFechaFin" value="<%=AsigVO.getFechaFin()%>"><br><br>
                        Id Datos FK<br>
                        <select name="textIdDatos">
                        <option>Seleccione...</option>
                        <%
                        DatosPersonalesDAO datDAO = new DatosPersonalesDAO();    
                        for (DatosPersonalesVO datVO : datDAO.listar()) {
                        %>
                        <option value="<%=datVO.getIdDatos()%>"><%=datVO.getNombreDatos()%></option>
                        <% }%>
                        </select><br>
                        Id Detalle FK<br>
                        <select name="textIdDetalleOrdenFK">
                        <option>Seleccione...</option>
                        <%
                        DetalleOrdenDAO DetaDAO = new DetalleOrdenDAO();    
                        for (DetalleOrdenVO DetaVO : DetaDAO.listar()) {
                        %>
                        <option value="<%=DetaVO.getIdDetalleOrden()%>"><%=DetaVO.getIdDetalleOrden()%></option>
                        <% }%>
                        </select><br>
                </th>
            </table>
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">
        </form><br><br>
        <% }%>
        <a href="consultarAsignar.jsp">Volver</a><br><br>
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