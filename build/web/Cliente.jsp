<%-- 
    Document   : Cliente
    Created on : 26-jun-2021, 20:01:53
    Author     : sergio saenz
--%>

<%@page import="Controlador.ControladorPrenda"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PrendaDAO"%>
<%@page import="ModeloVO.PrendaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ControladorPrenda pre = new ControladorPrenda();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="Sesiones.jsp"%>
        <h1>Cliente</h1>
        <!--Cargar productos-->
        <%= pre.consultarDatos()%>						                                        
    </body>
    <script src="JS/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="JS/bootstrap.min.js" type="text/javascript"></script>
    <script src="JS/jquery.dataTables.min.js" type="text/javascript"></script>
    <script src="JS/dataTables.bootstrap.min.js" type="text/javascript"></script>
</html>
