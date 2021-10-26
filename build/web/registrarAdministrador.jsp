<%-- 
    Document   : registrarAdministrador
    Created on : 09-sep-2021, 18:38:11
    Author     : sergio saenz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <title>Registrar Administrador</title>
</head>
    <body>
    <center>
        
    <h1>Registrar Administrador</h1>
                <form method="post" action="Usuario">
                    Usuario<br>
                    <input type="text" name="textUsuario"><br>
                    Correo<br>
                    <input type="email" name="textCorreo"><br>
                    Contraseña<br>
                    <input type="password" name="textClave"><br> 
                    <input type="hidden" name="textCargo" value="1"><br> 
                    <br>
                    <button>Registrar</button>
                    <input type="hidden" value="1" name="opcion">
                </form>
        <div style="color: red;">
            <%
                if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color:Blue">${MensajeExito}</div>

            <%  }%> 
        </div>
    </center>
    </body>
    <script>
</script>
</html>
