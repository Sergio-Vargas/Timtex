<%-- 
    Document   : Sesiones
    Created on : 26-jun-2021, 19:40:42
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
response.setHeader("Pragma", "No-cache");
response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
response.setDateHeader("Expires",0);
%>
  
<%
   HttpSession buscarSesion =(HttpSession)request.getSession();
    String usuario="";
    String id="";        
    if(buscarSesion.getAttribute("datosUsuario")!=null){
        
    UsuarioVO usuVO=(UsuarioVO)buscarSesion.getAttribute("datosUsuario");
    
   usuario=usuVO.getNombreUsuario();
   id=usuVO.getIdUsuario();
    }
    else{
    request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
%>
