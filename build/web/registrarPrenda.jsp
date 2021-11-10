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

        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800" rel="stylesheet">

        <!-- Icons -->
        <link href="assets/css/icons.css" rel="stylesheet" type="text/css"/>
        <!-- Favicon -->
        <link href="assets/img/brand/favicon.png" rel="icon" type="image/png">

        <!--Bootstrap.min css-->
        <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


        <!-- Ansta CSS -->
        <link href="assets/css/dashboard.css" rel="stylesheet" type="text/css">

        <!-- Custom scroll bar css-->
        <link href="assets/plugins/customscroll/jquery.mCustomScrollbar.css" rel="stylesheet" />

        <!-- Sidemenu Css -->
        <link href="assets/plugins/toggle-sidebar/css/sidemenu.css" rel="stylesheet">
        <%@include file="Sesiones.jsp"%>

    </head>
    <body>
        <form method="post" action="Prenda" class="my-login-validation" id="basic-form"  novalidate="">
            <div class="row">
                <div class="col-md-12">
                    <div class="card shadow">
                        <div class="card-header">
                            <h2 class="mb-0">Registrar Prenda</h2>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-6">
                                    <input type="hidden" value="1" name="textIdPrenda">
                                    
                                    <div class="form-group">               
                                        <label>Imagen</label>
                                        <input type="file" name="textImagenPrenda"  class="form-control" required>


                                    </div>
                                    <div class="form-group">  
                                        <label>Nombre</label>
                                        <input type="text" name="textNombrePrenda" class="form-control" maxlength="15" minlength="2" pattern="[a-zA-Z ]{2,20}" required>

                                    </div>
                                    <div class="form-group"> 
                                        <label>Descripción</label>
                                        <input type="text" name="textDescripcionPrenda" class="form-control" maxlength="250" minlength="2"  required>

                                    </div>
                                </div>

                                <div class=" col-md-6">
                                    <div class="form-group"> 
                                        <label>Tipo Prenda</label>
                                        <select name="textIdTipoPrendaFK" class="form-control" required>
                                            <option></option>
                                            <%  TipoPrendaDAO TPreDAO = new TipoPrendaDAO();
                                                for (TipoPrendaVO TPreVO : TPreDAO.listar()) {
                                            %>
                                            <option value="<%=TPreVO.getIdTipoPrenda()%>"><%=TPreVO.getNombreTipoPrenda()%></option>
                                            <% }%>
                                        </select>

                                    </div>    

                                    <div class="form-group">            
                                        <label>Precio</label>
                                        <input type="number" name="textPrecio" min="10000" class="form-control" required><br><br>


                                    </div>      
                                    <input type="hidden" name="textEstadoPrenda" class="form-control" value="Activo">
                                </div>
                                <div class=" col-md-6">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Registrar</button>
                                    </center>
                                </div>  

                            </div>
                        </div>    
                    </div>          
                </div>    
            </div>       
            <input type="hidden" value="1" name="opcion">
        </form>



        <div style="color: red;">
            <%
                if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito}</div>

            <%  }%>
        </div>

        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>



        <!-- validacion de formularios -->
        <script src="JS/my-login.js"></script>
    </body>
</html>

