<%-- 
    Document   : OrdenesUsuario
    Created on : 24-nov-2021, 21:29:29
    Author     : sergio saenz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.OrdenVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                        <th>CATID</th>
                                        <th>CATIPO</th>
                                        <th>VEHPLACA</th>
                                        <th>DATID</th>
                                        <th>VEH CATID</th>
                                        <th>VEHMODELO</th>
                                        <th>VEHMARCA</th>
                                        <th>VEHESTADO</th>
                                        <th>VEHPRECIO</th>
                                        </tr>
                                        
                              
            </thead>
            <tbody>
                <%
            OrdenVO ordeVO =new OrdenVO();
            ArrayList<OrdenVO> listaOrden=(ArrayList<OrdenVO>)request.getAttribute("rol");
            for(int i=0; i<listaOrden.size();i++){
            ordeVO=listaOrden.get(i);
            
            %>
            <tbody>
                
                <tr>
                    <td><%=ordeVO.getIdOrden()%></td>
                    <td><%=ordeVO.getFechaOrden()%> </td>
                    <td><%=ordeVO.getEstadoOrden()%></td>
                </tr>
            <%
            } 
            %>  
    <%if (request.getAttribute("MensajeError") != null) { %>
                               ${MensajeError}     
                               <%}%>
            </tbody>
        </table>
        
        
        
    </body>
</html>
