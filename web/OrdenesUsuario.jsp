<%-- 
    Document   : OrdenesUsuario
    Created on : 24-nov-2021, 21:29:29
    Author     : sergio saenz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.OrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ordenes</title>   
        </head>
   
    <body>
        <%
                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("2")) {

                            %>
    <center>
        <div class="container-fluid pt-8">
        <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="Cliente.jsp">Inicio</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Ordenes</li>
                                    </ol>

        </div>
        
        <div style="color: red;">

            <%if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}     

            <%} else {%>
            <div style="color: greenyellow">${MensajeExito}</div>

            <%  }%>

        </div>
                
    <div class="row">
        <div class="col-md-12">
            <div class="card shadow">
                <div class="card-header">
                    <h2 class="mb-0">Lista De Ordenes</h2>
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table id="example" class="table table-striped table-bordered w-100 text-nowrap">
                            <thead>
                                <tr>

                                    <th>ID ORDEN</th>
                    <th>FECHA DE LA ORDEN</th>
                    <th>ESTADO DE LA ORDEN</th>
                    <th></th>
                    <th>ACCIÓN</th>

                                </tr>
                            </thead>

                            <tbody>
                                <%
            OrdenVO ordeVO =new OrdenVO();
            ArrayList<OrdenVO> listaOrden=(ArrayList<OrdenVO>)request.getAttribute("rol");
            for(int i=0; i<listaOrden.size();i++){
            ordeVO=listaOrden.get(i);
            
            %>
                                <tr>
                    <td><%=ordeVO.getIdOrden()%></td>
                    <td><%=ordeVO.getFechaOrden()%> </td>
                    <td><%=ordeVO.getEstadoOrden()%></td>
                    <td></td>
                    <td>
                    <form method="post" action="Orden">
                        <input type="hidden" name="textIdDato" value="<%=ordeVO.getIdDatosFK()%>">
                    <input type="hidden" name="textOrden" value="<%=ordeVO.getIdOrden()%>">
                    <button class="btn btn-primary">Ver detalles</button>
                    <input type="hidden" value="6" name="opcion">
                    </form>
                    </td>
                </tr> 

                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
                            </div></div></div>
                            <%@include file="footer.jsp"%>
  
<%}%>
                            	  
       
        
    </body>
</html>
