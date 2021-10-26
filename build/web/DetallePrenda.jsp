<%-- 
    Document   : DetallePrenda
    Created on : 05-sep-2021, 21:16:37
    Author     : sergio saenz
--%>

<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloVO.PrendaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
       <%
       PrendaVO PreVO =(PrendaVO) request.getAttribute("identificacion consultada");
       if (PreVO != null) {
       %>
       <div class="col-sm-9 padding-right">
					<div class="product-details"><!--product-details-->
						<div class="col-sm-5">
							<div class="view-product">
                                                            <img src="<%=PreVO.getImagenPrenda()%>" alt="" />
								<h3>ZOOM</h3>
							</div>
                        <div id="similar-product" class="carousel slide" data-ride="carousel">
								
			<!-- Wrapper for slides -->
                       
			<!-- Controls -->
			<a class="left item-control" href="#similar-product" data-slide="prev">
			<i class="fa fa-angle-left"></i>
			</a>
			<a class="right item-control" href="#similar-product" data-slide="next">
			<i class="fa fa-angle-right"></i>
                        </a>
			</div>
                        				   
                        </div>
			<div class="col-sm-7">
			<div class="product-information"><!--/product-information-->
                        <img src="images/product-details/new.jpg" class="newarrival" alt="" />
			<h2><%=PreVO.getNombrePrenda()%></h2>
                        <p>Web ID: <%=PreVO.getIdPrenda()%></p>
                        <p>Descripcion prenda:<%=PreVO.getDescripcionPrenda()%></p>
			<img src="images/product-details/rating.png" alt="" />
                        <form action="agregarproducto" method="post">
                        <input type="hidden" name="textIdDetalle">    
			<label>Cantidad Prenda:</label>
                        <input type="number" value="1" name="textCantidad">
                        <label>Talla:</label>
                        <input type="text" value="" name="textTalla">
                        <input type="hidden" name="textOrden"> 
                        <input type="hidden" value="<%=PreVO.getIdPrenda()%>" name="textprenda">
			<button type="submit" class="btn btn-fefault cart">
			<i class="fa fa-shopping-cart"></i>
			Incuir en el carrito
                    </button>
		</span>
            </form>
                    <% }%>
           <div style="color: red;">
            <%
                if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito} </div>
            <%  }%>
        </div>
    </body>
    <script src="JS/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="JS/bootstrap.min.js" type="text/javascript"></script>
    <script src="JS/jquery.dataTables.min.js" type="text/javascript"></script>
    <script src="JS/dataTables.bootstrap.min.js" type="text/javascript"></script>
</html>
