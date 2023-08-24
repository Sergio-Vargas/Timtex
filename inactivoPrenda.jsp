<%-- 
    Document   : inactivoPrenda
    Created on : 23-ago-2021, 19:21:27
    Author     : sergio saenz
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloVO.PrendaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prenda</title>

    </head>

    <body>


<div class="container-fluid pt-8">
        <div class="page-header mt-0 shadow p-3">
                                    <ol class="breadcrumb mb-sm-0">
                                        <li class="breadcrumb-item"><a href="consultarPrenda.jsp">Prendas</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Prendas Inactivas</li>
                                    </ol>

        </div> 

        <div class="row">
            <div class="col-md-12">
                <div class="card shadow">
                    <div class="card-header">
                        <h2 class="mb-0">Prendas inactivas</h2>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table id="example" class="table table-striped table-bordered w-100 text-nowrap">
                                <thead>
                                    <tr>

                                        <th>ID PRENDA</th>
                                        <th>IMAGEN PRENDA</th>
                                        <th>NOMBRE PRENDA</th>
                                        <th>DESCRIPCION PRENDA</th>
                                        <th>ESTADO PRENDA</th>
                                        <th>ID TIPOPRENDA FK</th>
                                        <th></th>
                                        <th>ACCIÓN</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <%
                                        PrendaVO PreVO = new PrendaVO();
                                        PrendaDAO PreDAO = new PrendaDAO();
                                        ArrayList<PrendaVO> listaPrendaIna = PreDAO.inactivo();
                                        for (int i = 0; i < listaPrendaIna.size(); i++) {

                                            PreVO = listaPrendaIna.get(i);
                                    %>
                                    <tr>
                                        <td><%=PreVO.getIdPrenda()%></td>
                                        <td><img src="<%=PreVO.getImagenPrenda()%>"width="100px"></td>
                                        <td><%=PreVO.getNombrePrenda()%></td>
                                        <td><%=PreVO.getDescripcionPrenda()%></td>
                                        <td><%=PreVO.getEstadoPrenda()%></td>
                                        <td><%=PreVO.getIdTipoPrendaFK()%></td>
                                        <td>
                                            <form action="">    
                                            </form>
                                        </td>
                                        <td>
                                            <form method="post" action="Prenda">
                                                <input type="hidden" name="textIdPrenda" value="<%=PreVO.getIdPrenda()%>">
                                                <button class="btn btn-primary">Editar</button>
                                                <input type="hidden" value="3" name="opcion">
                                            </form>
                                        </td>
                                    </tr>

                                    <% }%>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div> 



           <%@include file="footer.jsp"%>

                </body> 
                </html>