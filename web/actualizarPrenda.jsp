<%-- 
    Document   : actualizarPrenda
    Created on : 11-ago-2021, 15:00:10
    Author     : sergio saenz
--%>


<%@page import="ModeloVO.TipoPrendaVO"%>
<%@page import="ModeloDAO.TipoPrendaDAO"%>
<%@page import="ModeloVO.PrendaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Prenda</title>
        <%@include file="Sesiones.jsp"%>
    </head>
    <body>
   
        <%
            PrendaVO PreVO =(PrendaVO) request.getAttribute("identificacion consultada");
            if (PreVO != null) {
        %>
        <form method="post" action="Prenda" class="my-login-validation" id="basic-form" novalidate="">
            <div class="row">
                <div class="col-md-12">
                    <div class="card shadow">
                        <div class="card-header">
                            <h2 class="mb-0">Registrar Prenda</h2>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-6">
                                    
                        <input type="hidden" name="textIdPrenda" value="<%=PreVO.getIdPrenda()%>">
                        <div class="form-group">  
                        Imagen
                        <input type="text" name="textImagenPrenda" class="form-control" required value="Imagenes/<%=PreVO.getImagenPrenda()%>">
                  
                        </div>
                        <div class="form-group">  
                        Nombre
                        <input type="text" name="textNombrePrenda" maxlength="15" minlength="2" pattern="[a-zA-Z ]{2,20}"  class="form-control" required value="<%=PreVO.getNombrePrenda()%>">
        
                        </div>
                        <div class="form-group">  
                        Descripción prenda
                        <input type="text" name="textDescripcionPrenda" maxlength="250" minlength="2" class="form-control" required value="<%=PreVO.getDescripcionPrenda()%>">
 
                        </div>
                         </div>
                         <div class="col-md-6">
                        <div class="form-group">  
                        Precio
                        <input type="text" name="textPrecio" min="10000" class="form-control" required value="<%=PreVO.getPrecioPrenda()%>">
               
                        </div>
                        <div class="form-group">  
                        Estado Prenda                       
                        <select name="textEstadoPrenda" class="form-control" required>
                        <option></option>
                        <option value="Activo">Activo</option>
                        <option value="Inactivo">Inactivo</option>
                        </select>
                
                        </div>
                        <div class="form-group">  
                            
                        Tipo Prenda FK<br>
                        <select name="textIdTipoPrendaFK" class="form-control" required>
                        <option></option>
                        <%
                        TipoPrendaDAO TPreDAO = new TipoPrendaDAO();    
                        for (TipoPrendaVO TPreVO : TPreDAO.listar()) {
                        %>
                        <option value="<%=TPreVO.getIdTipoPrenda()%>"><%=TPreVO.getNombreTipoPrenda()%></option>
                        <% }%>
                        </select>
                      
                        </div></div>
                       
          <div class=" col-md-6">
                                    <center>
                                        <button type="submit" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Actualizar</button>
                                    </center>
                                </div>  
                            
                        </div>    
                    </div>          
                </div>    
                </div></div>  
            <input type="hidden" value="2" name="opcion">
        </form>
        <% }%>
        <a href="consultarPrenda.jsp" class="btn btn-primary mb-0 btn-block waves-effect waves-light">Volver</a>
        <div style="color: red;">

            <%
                if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito} </div>
            <%  }%>
        </div>

          <%@include file="footer.jsp"%>

         
</body>
</html>