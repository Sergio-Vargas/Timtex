<%@page import="Controlador.ControladorProducto"%>
<%
    ControladorProducto cp = new ControladorProducto();
%>
<%@include file="Sesiones.jsp"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Timtex</title>

        <!-- Favicon -->
        <link href="assets/img/brand/favicon.png" rel="icon" type="image/png">

        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800" rel="stylesheet">

      

    </head><!--/head-->

    <body>
   <% 
        rol = usuVO.getIdCargoFK();
        if (rol.equals("2")) {

    %>
               <!-- Page content -->
                            <div class="container-fluid pt-8">
                                <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item active" aria-current="page">Inicio</li>
                                        <li class="breadcrumb-item"><a href="cart.jsp">Orden</a></li>
                                    </ol>

                                </div>
        <div class="row">
            
        <!--Cargar productos-->
        <%= cp.getProductos()%>	
        
        </div></div></div>
 
<%@include file="footer.jsp"%>	

		<% } %>                                           
                                				
 
    </body>
</html>