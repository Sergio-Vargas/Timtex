<%-- 
    Document   : actualizarDatosPersonales
    Created on : 03-jul-2021, 19:46:35
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Datos personales</title>
    </head>
    <body>
    <center>
        <h1>Actualizar Datos Personales!</h1>
        <%
            DatosPersonalesVO datVO =(DatosPersonalesVO) request.getAttribute("identificacion consultada");
            if (datVO != null) {
        %>
        <form method="post" action="DatosPersonales">
            <table>
                <tr>
                    <th>
                        <input type="hidden" name="textNumeroid" value="<%=datVO.getIdDatos()%>"><br><br>
                        Nombre<br>
                        <input type="text" name="textNombre" value="<%=datVO.getNombreDatos()%>"><br><br>
                        Apellido<br>
                        <input type="text" name="textApellido" value="<%=datVO.getApellidoDatos()%>"><br><br>
                        Direccion<br>
                        <input type="text" name="textDireccion" value="<%=datVO.getDireccionDatos()%>"><br><br>
                        Telefono<br>
                        <input type="text" name="textTelefono" value="<%=datVO.getTelefonoDatos()%>"><br><br>
                        Correo<br>
                        <input type="text" name="textCorreo" value="<%=datVO.getCorreoDatos()%>"><br><br>
                        Estado<br>
                        <select name="textEstado">
                        <option>Seleccione...</option>
                        <option value="Activo">Activo</option>
                        <option value="Inactivo">Inactivo</option>
                        </select><br>
                        Id usuario<br>
                        <select name="textUsuario">
                        <option>Seleccione...</option>
                        <%
                        UsuarioDAO usuDAO = new UsuarioDAO();    
                        for (UsuarioVO usuVO : usuDAO.listar()) {
                        %>
                        <option value="<%=usuVO.getIdUsuario()%>"><%=usuVO.getNombreUsuario()%></option>
                        <% }%>
                        </select>
                        <td></td>
                </th>
            </table>
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">
        </form><br><br>
        <% }%>
        <a href="consultarDatosPersonales.jsp">Volver</a><br><br>
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

 
             
