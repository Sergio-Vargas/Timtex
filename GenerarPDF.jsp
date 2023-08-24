<%-- 
    Document   : GenerarPDF
    Created on : 21/10/2021, 08:31:18 PM
    Author     : Letty Morales
--%>

<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="Util.Conexion"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        //Recoger el name del reporte    
        String nombreReporte = request.getParameter("nombreReporte");
        //
        File reporte = new File (application.getRealPath(nombreReporte));
        //Mapeo que permite convertir todo el reporte en un objeto
        Map<String, Object> parametros = new HashMap<String, Object> ();
        
        String estado=request.getParameter("textEstado");
        parametros.put("Estado",estado);
        
        
        Conexion claseConexion = new Conexion();
        Connection conexion = claseConexion.obtenerConexion();
        
        //Convertir reporte en Byte(Tipo de objeto que almacena)
        byte[] reporteBytes = JasperRunManager.runReportToPdf(reporte.getPath(), parametros, conexion);
        response.setContentType("application/pdf");
        response.setContentLength(reporteBytes.length);
        response.setHeader("Content-Disposition", "filename=\"reporte.pdf\";");
        ServletOutputStream salida = response.getOutputStream();
        salida.write(reporteBytes,0,reporteBytes.length);
        salida.flush();
        salida.close();
        %>
    </body>
</html>
