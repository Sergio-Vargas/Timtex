<%-- 
    Document   : registrarOrden
    Created on : 29-jul-2021, 12:57:04
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.PrendaVO"%>
<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Orden</title>
    </head>
    <body>
    <center>
        <h1>Registrar Orden</h1>
         <form method="post" action="Orden">
            <table>
                <tr>
                    <th>
                        Id Orden<br>
                        <input type="text" name="textOrden"><br><br>
                        Fecha Orden<br>
                        <input type="text" name="textFecha"><br><br>
                        Cantidad Prenda<br>
                        <input type="text" name="textCantidad"><br><br>
                        Estado Orden<br>
                        <input type="text" name="textEstado"><br><br>
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
                        Id Prenda<br>
                        <select name="textPrenda">
                        <option>Seleccione...</option>
                        <%
                        PrendaDAO PreDAO = new PrendaDAO();    
                        for (PrendaVO PreVO : PreDAO.listar()) {
                        %>
                        <option value="<%=PreVO.getIdPrenda()%>"><%=PreVO.getNombrePrenda()%></option>
                        <% }%>
                        </select><br>
                        <td></td><br>
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
