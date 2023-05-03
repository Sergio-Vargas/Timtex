<%@page import="Controlador.ControladorProducto"%>
<%@page import="ModeloVO.Producto"%>

<%@include file="Sesiones.jsp"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Detalle del producto</title>
   
</head><!--/head-->
<%
    
    int idprenda = Integer.parseInt(request.getParameter("id"));
    Producto producto = new ControladorProducto().getProducto(idprenda);
%>
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
     <% 
        rol = usuVO.getIdCargoFK();
        if (rol.equals("2")) {

    %>
     <!-- Page content -->
                            <div class="container-fluid pt-8">
                                <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="Cliente.jsp">Inicio</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Detalle</li>
                                    </ol>

                                </div>
    
				
				 <div class="row abs-center">				
    <form action="agregarproducto" class="form" method="post">
                                                                    
                <div class="col-md-12">
                    <div class="card shadow">
                        
                        <div class="card-body">
                            <div class="row">
                                                                    
                                                                    
									<div class="col-md-12"> 
                                    <div class="form-group ">
                                        <center>
                                                                                                    <img src="<%= producto.getImg()%>" width="200px" height="200px" alt="" />

								<h2><%= producto.getNombre()%></h2>
								<p>Web ID: <%= producto.getId()%></p>
                                        </center>
                                    </div>
                                    <div class="form-group">
                                    <label>Precio</label>
                                                                       
                                                                        <input type="number" value="<%= producto.getPrecio()%>" class="form-control" readonly/>
                                    </div>
                                    <div class="form-group">
                                                                        <label>Cantidad</label>
                                                                        <input type="hidden" value="<%= producto.getId()%>" name="idproducto">
                                                                        <input type="number" class="form-control" value="1" id="txt-cantidad" name="cantidad"/>
                                    </div>
                                                                         <div class="form-group">
                                                                        <label>Talla</label>
                                                                        <input type="number" value="20" class="form-control"  id="txt-cantidad" name="talla"/>
                                                                         </div>
                                                                         <div class="form-group">
                                                                        <button type="submit" class="btn cart btn btn-primary ">
										<i class="fa fa-shopping-cart"></i>
										Añadir al carrito
									</button>
                                                                         </div>
                                                                </form>
							</div><!--/product-information-->
						</div>
					</div><!--/product-details-->

                    </div></div></div>                 <%@include file="footer.jsp"%>	

                                        <% } %> 
                                       
                                            

</body>
</html>