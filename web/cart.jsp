<%@page import="ModeloVO.Producto"%>
<%@page import="Controlador.ControladorProducto"%>
<%@page import="ModeloVO.Articulo"%>
<%@page import="java.util.ArrayList"%>
<%
    HttpSession sesion = request.getSession(true);
    ArrayList<Articulo> articulos = sesion.getAttribute("carrito") == null ? null : (ArrayList) sesion.getAttribute("carrito");
%>
<%@include file="Cliente.jsp"%>

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
                                        <li class="breadcrumb-item"><a href="shop.jsp">Inicio</a></li>
                                        
                                        <li class="breadcrumb-item active" aria-current="page">Orden</li>
                                    </ol>

                                </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="card shadow">
                    <div class="card-header ">
                        <h2 class="mb-0">Carrito de compras</h2>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive ">
                            <table class="table table-bordered align-items-center">
                                <thead>
                                    <tr>
                                        <th>Prenda</th>
                                        <th>Nombre</th>
                                        <th>Precio</th>
                                        <th>Orden</th>
                                        <th>Cantidad</th>
                                        <th>Talla</th>
                                        <th>Total</th>
                                        <th>Acción</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <form method="post" action="DetalleOrden" >
                                    <%
                                        ControladorProducto cp = new ControladorProducto();
                                        double total = 0;
                                        if (articulos != null) {
                                            for (Articulo a : articulos) {
                                                Producto producto = cp.getProducto(a.getIdProducto());
                                                total += a.getCantidad() * producto.getPrecio();


                                    %>

                                    <tr>
                                        <td><img src="<%= producto.getImg()%>" alt="" width="120px" height="100px"></td>
                                        <td><%= producto.getNombre()%></td>
                                        <td><span>$ <%= producto.getPrecio()%></span></td>
                                        
                                        
                                        <input type="hidden"  name="textIdDetalleOrden" >
                                        
                                        <input type="hidden" name="textIdPrendaFK" class="form-control" value="<%= producto.getId()%>">
                                        
                                        <td class="cart_price">
                                        <input type="text" name="textIdOrdenFK"  class="form-control" required></p>
                                        </td>
                                        
                                        <td class="w-8 h-8 "><input type="text" name="textCantidad" readonly class="form-control text-center " value="<%= a.getCantidad()%>"></td>
                                        <td><input type="number" readonly class="form-control text-center "  name="textTalla" value="<%= a.getTalla()%>"></td>
                                        <td>$<%= Math.round(producto.getPrecio() * a.getCantidad() * 100.0) / 100.0%></td>
                                        <td class="cart_delete">
                                            <span id="idarticulo" style="display:none;"><%= producto.getId()%></span>
                                            <a class="btn btn-danger btn-sm text-white" data-toggle="tooltip" data-original-title="Borrar" href="" id="deleteitem"><i class="fas fa-trash"></i></a>
                                        </td>
                                        <input type="submit">
                                         <input type="hidden" value="1" name="opcion"> 
                                    </tr>
                                    <%} }
                                    %>
                                    <button class="btn btn-primary mb-0 btn-block waves-effect waves-light">Registar</button>
                                         <input type="hidden" value="1" name="opcion">
                                         </form>
                                </tbody>
                            </table>
                            <% if (articulos == null) {%>
                            <h4>No hay Articulos en el carro</h4>
                            <%}%>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-lg-12">
                <div class="card shadow ">
                    <div class="card-header ">
                        <h2 class="mb-0">Resumen de la orden</h2>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered align-items-center">
                                <tbody>
                                    <tr>
                                        <td>Subtotal</td>
                                        <td class="text-right">$<%= Math.round(total * 100.0) / 100.0%></td>
                                    </tr>
                                    <tr>
                                        <td><span>Total</span></td>
                                        <td class="text-right text-muted"><span>$<%= Math.round(total * 100.0) / 100.0%></span></td>
                                    </tr>

                                </tbody>
                            </table>
                        </div>
                        <section class="text-center mt-3">
                            <input class="btn btn-primary mt-2" type="submit" value="Generar orden">
                            <a href="shop.jsp"><button class="btn btn-success mt-2" type="submit">Continuar comprando</button></a>

                        </section>

                    </div>
                </div>
            </div>
        </div>
<%@include file="footer.jsp"%>	

        <!-- Back to top -->
        <a href="#top" id="back-to-top"><i class="fa fa-angle-up"></i></a>


<% } %> 
        <!--Carrito-->
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="assets/js/jquery.js" type="text/javascript"></script>
        <script src="assets/js/jquery.prettyPhoto.js" type="text/javascript"></script>
        <script src="assets/js/jquery.scrollUp.min.js" type="text/javascript"></script>
        <script src="assets/js/main.js" type="text/javascript"></script>
        <script src="JS/carrito.js"></script>




    </body>
</html>