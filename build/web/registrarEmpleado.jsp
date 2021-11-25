<%-- 
    Document   : registrarEmpleado
    Created on : 09-sep-2021, 18:30:42
    Author     : sara gabriela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>	
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registrar Empleado</title>
</head>
    <style>
        .abs-center {
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }

        .form {
            width: 550px;
        }
    </style>
    <body>
        
         <div class="row abs-center">
        <form id="basic-form" class="my-login-validation form" method="post" action="Usuario">
            
                <div class="col-md-12">
                    <div class="card shadow">
                        <div class="card-header">
                            <h2 class="mb-0">Registrar empleado</h2>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        Usuario
                                        <input type="text" class="form-control"  name="textUsuario" pattern="[a-zA-Z ]{2,20}" required>
                                    </div>
                                    <div class="form-group">
                                        Correo
                                        <input type="email" class="form-control"  name="textCorreo" pattern="^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" required>
                                    </div>
                                    <!--
                                    <div class="form-group">
                                        Contraseña
                                        <input type="password" class="form-control"  name="textClave">
                                    </div>-->
                                    <div class="form-group"> 
                                       Cargo    
                                        <select name="textCargo" class="form-control" required>
                                            <option></option>
                                            <option value="3">Empleado</option>
                                            <option value="1">Administrador</option>
                                        </select>
                                       
                                          <input type="hidden" class="form-control" name="textEstado" value="Activo">

                                    </div>
                                    <div class="form-group"> 
                                   <div style="color: red;">
            <%
                if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color:Blue">${MensajeExito}</div>

            <%  }%> 
                                   </div></div>
                                    <div class=" col-md-6">
                                        <center>
                                            <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Registrar</button>
                                        </center>
                                    </div>
                                </div>
                            </div>
                        </div>    
                    </div></div></div> 
            <input type="hidden" value="4" name="opcion">
        </form>

<%@include file="footer.jsp"%>
       
 </div>
					</div>
				</div>
			</div>
			<!-- app-content-->
		</div>
	</div>
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>

    <script src="JS/my-login.js"></script>
    
    
</body>

</html>



