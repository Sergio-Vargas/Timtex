<%-- 
    Document   : actualizarPrenda
    Created on : 11-ago-2021, 15:00:10
    Author     : sergio saenz
--%>


<%@page import="ModeloVO.TipoPrendaVO"%>
<%@page import="ModeloDAO.TipoPrendaDAO"%>
<%@page import="ModeloVO.PrendaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Prenda</title>
    </head>
    <body>
    <center>
        <h1>Actualizar Prenda!</h1>
        <%
            PrendaVO PreVO =(PrendaVO) request.getAttribute("identificacion consultada");
            if (PreVO != null) {
        %>
        <form method="post" action="Prenda">
            <table>
                <tr>
                    <th>
                        <input type="hidden" name="textIdPrenda" value="<%=PreVO.getIdPrenda()%>"><br><br>
                        Imagen<br>
                        <input type="file" name="textImagenPrenda" value="Imagenes\<%=PreVO.getImagenPrenda()%>"><br><br>
                        Nombre <br>
                        <input type="text" name="textNombrePrenda" value="<%=PreVO.getNombrePrenda()%>"><br><br>
                        Descripción prenda<br>
                        <input type="text" name="textDescripcionPrenda" value="<%=PreVO.getDescripcionPrenda()%>"><br><br>
                        Precio
                        <input type="text" name="textPrecio" value="<%=PreVO.getPrecioPrenda()%>"><br><br>
                        Estado Prenda<br>                        
                        <select name="textEstadoPrenda">
                        <option>Seleccione...</option>
                        <option value="Activo">Activo</option>
                        <option value="Inactivo">Inactivo</option>
                        </select><br>
                        Tipo Prenda FK<br>
                        <select name="textIdTipoPrendaFK">
                        <option>Seleccione...</option>
                        <%
                        TipoPrendaDAO TPreDAO = new TipoPrendaDAO();    
                        for (TipoPrendaVO TPreVO : TPreDAO.listar()) {
                        %>
                        <option value="<%=TPreVO.getIdTipoPrenda()%>"><%=TPreVO.getNombreTipoPrenda()%></option>
                        <% }%>
                        </select
                        <td></td>
                </th>
            </table>
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">
        </form><br><br>
        <% }%>
        <a href="consultarPrenda.jsp">Volver</a><br><br>
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