<%-- 
    Document   : registrarAsignar
    Created on : 07-ago-2021, 22:44:10
    Author     : sergio saenz
--%>
<%@page import="ModeloVO.OrdenVO"%>
<%@page import="ModeloDAO.OrdenDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Asignar</title>
    </head>
    <body>
    <center>
        <h1>Registrar asignar</h1>
       <form method="post" action="AsigOrden">
            <table>
                <tr>
                    <th>
                        Id Asig Orden<br>
                        <input type="text" name="textAsigOrden" ><br><br>
                        Cantidad Prenda<br>
                        <input type="text" name="textCantidad"><br><br>
                        Fecha Inicio<br>
                        <input type="text" name="textFechaInicio" ><br><br>
                        Fecha Fin<br>
                        <input type="text" name="textFechaFin"><br><br>
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
