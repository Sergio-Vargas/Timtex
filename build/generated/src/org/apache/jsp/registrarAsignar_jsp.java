package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.DetalleOrdenVO;
import ModeloDAO.DetalleOrdenDAO;
import ModeloVO.DatosPersonalesVO;
import ModeloDAO.DatosPersonalesDAO;

public final class registrarAsignar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Asignar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Registrar asignar</h1>\n");
      out.write("       <form method=\"post\" action=\"AsigOrden\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        <input type=\"hidden\" name=\"textAsigOrden\"><br><br>\n");
      out.write("                        Cantidad Prenda<br>\n");
      out.write("                        <input type=\"text\" name=\"textCantidad\"><br><br>\n");
      out.write("                        Fecha Inicio<br>\n");
      out.write("                        <input type=\"text\" name=\"textFechaInicio\" ><br><br>\n");
      out.write("                        Fecha Fin<br>\n");
      out.write("                        <input type=\"text\" name=\"textFechaFin\"><br><br>\n");
      out.write("                        Id Datos FK<br>\n");
      out.write("                        <select name=\"textIdDatos\">\n");
      out.write("                        <option>Seleccione...</option>\n");
      out.write("                        ");

                        DatosPersonalesDAO datDAO = new DatosPersonalesDAO();    
                        for (DatosPersonalesVO datVO : datDAO.listar()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(datVO.getIdDatos());
      out.write('"');
      out.write('>');
      out.print(datVO.getNombreDatos());
      out.write("</option>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        </select><br>\n");
      out.write("                        Id Detalle FK<br>\n");
      out.write("                        <select name=\"textIdDetalleOrdenFK\">\n");
      out.write("                        <option>Seleccione...</option>\n");
      out.write("                        ");

                        DetalleOrdenDAO DetaDAO = new DetalleOrdenDAO();    
                        for (DetalleOrdenVO DetaVO : DetaDAO.listar()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(DetaVO.getIdDetalleOrden());
      out.write('"');
      out.write('>');
      out.print(DetaVO.getIdDetalleOrden());
      out.write("</option>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        </select><br>\n");
      out.write("                </th>\n");
      out.write("            </table>\n");
      out.write("            <button>Registar</button>\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("        </form><br><br>\n");
      out.write("        <div style=\"color: red;\">\n");
      out.write("            ");

                if (request.getAttribute("MensajeError") != null) { 
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("     \n");
      out.write("\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            <div style=\"color: greenyellow\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\n");
      out.write("            ");
  }
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
