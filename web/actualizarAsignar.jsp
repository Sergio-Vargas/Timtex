<%-- 
    Document   : actualizarAsignar
    Created on : 07-ago-2021, 19:32:44
    Author     : sergio saenz
--%>

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
                        Id Asig Orden<br>
                        <input type="text" name="textAsigOrden" value="<%=AsigVO.getIdAsigOrden()%>"><br><br>
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
                        Id Orden FK<br>
                        <select name="textIdOrden">
                        <option>Seleccione...</option>
                        <%
                        OrdenDAO OrdeDAO = new OrdenDAO();    
                        for (OrdenVO OrdeVO : OrdeDAO.listar()) {
                        %>
                        <option value="<%=OrdeVO.getIdOrden()%>"><%=OrdeVO.getIdOrden()%></option>
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