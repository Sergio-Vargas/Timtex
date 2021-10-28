<%-- 
    Document   : Sesiones
    Created on : 26-jun-2021, 19:40:42
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  
<%
   HttpSession buscarSesion =(HttpSession)request.getSession();
    String usuario="";
    String id="";      
    String correo="";
    if(buscarSesion.getAttribute("datosUsuario")!=null){
        
    UsuarioVO usuVO=(UsuarioVO)buscarSesion.getAttribute("datosUsuario");
    
   usuario=usuVO.getNombreUsuario();
   id=usuVO.getIdUsuario();
   correo=usuVO.getCorreoDatos();
    }
    else{
    request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
%>
