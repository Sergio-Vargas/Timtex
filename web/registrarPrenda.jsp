<%-- 
    Document   : registrarPrenda
    Created on : 11-ago-2021, 14:52:12
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.TipoPrendaVO"%>
<%@page import="ModeloDAO.TipoPrendaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Prenda</title>
    </head>
    <body>
    <center>
        <h1>Registrar Datos</h1>
         <form method="post" action="Prenda" >
            <table>
                <tr>
                    <th>
                        Id prenda<br>
                        <input type="text" name="textIdPrenda"><br><br>
                        Imagen<br>
                        <input type="file" name="textImagenPrenda" ><br><br>
                        Nombre<br>
                        <input type="text" name="textNombrePrenda" ><br><br>
                        Talla<br>
                        <input type="text" name="textTalla" ><br><br>
                        Descripción<br>
                        <input type="text" name="textDescripcionPrenda"><br><br>
                        Estado<br>
                        <input type="text" name="textEstadoPrenda"><br><br>
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
            <button>Registrar</button>
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

