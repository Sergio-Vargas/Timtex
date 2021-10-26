<%-- 
    Document   : actualizarOrden
    Created on : 29-jul-2021, 18:49:52
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.PrendaVO"%>
<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page import="ModeloVO.OrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Orden</title>
    </head>
    <body>
    <center>
        <h1>Actualizar Orden</h1>
        <%
            OrdenVO OrdeVO =(OrdenVO) request.getAttribute("identificacion consultada");
            if (OrdeVO != null) {
        %>
        <form method="post" action="Orden">
            <table>
                <tr>
                    <th>
                        <input type="hidden" name="textOrden" value="<%=OrdeVO.getIdOrden()%>"><br><br>
                        Fecha Orden<br>
                        <input type="date" name="textFecha" value="<%=OrdeVO.getFechaOrden()%>"><br><br>
                        Estado Orden<br>
                        <select name="textEstado">
                        <option>Seleccione...</option>
                        <option value="Activo">Activo</option>
                        <option value="Inactivo">Inactivo</option>
                        <option value="Realizada">Realizada</option>
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
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">
        </form><br><br>
        <% }%>
        <a href="consultarOrden.jsp">Volver</a><br><br>
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