<%-- 
    Document   : registrarDatosPersonales
    Created on : 03-jul-2021, 19:34:04
    Author     : sergio saenz
--%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-Es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar Datos Personales</title>
    
</head>
<body>
    <div class="frm-container">
        <h1>Registro datos</h1>
        <form action="DatosPersonales" method="POST" id="frm-usuario">
                <label for="nombre">Nombre</label>
                <input type="text" name="textNombre" id="nombre" class="frm-input"/>
                
                <label for="apellido">Apellido</label>
                <input type="text" name="textApellido" id="apellido" class="frm-input"/>
           
                <label for="direccion">Direccion</label>
                <input type="text" name="textDireccion" id="direccion" class="frm-input"/>
           
                <label for="telefono">Telefono</label>
                <input type="text" name="textTelefono" id="telefono" class="frm-input"/>
             
                <label for="correo">Correo</label>
                <input type="text" name="textCorreo" id="correo" class="frm-input"/>
                    
                <label for="estado">Estado</label>
                    <select name="textEstado" id=" estado" class="frm-input">
                        <option>Seleccione...</option>
                        <option value="Activo">Activo</option>
                </select>
                <label for="idusuario">Id usuario</label>
                <select name="textUsuario">
                <option>Seleccione...</option>
                <%
                UsuarioDAO usuDAO = new UsuarioDAO();    
                for (UsuarioVO usuVO : usuDAO.listar()) {
                %>
                <option value="<%=usuVO.getIdUsuario()%>"><%=usuVO.getNombreUsuario()%></option>
                <% }%>
                </select><br>
               
            
            <button type="submit" class="btn-enviar">Registrar</button>
            <input type="hidden" value="1" name="opcion">
        </form>
        <div style="color: red;">
            <%
                 if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: darkgreen">${MensajeExito}</div>

            <%  }%>
        </div>
    </div>
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="JS/icons.js" type="text/javascript"></script>
  <script src="JS/Validaciones.js" type="text/javascript"></script>
</body>
</html>