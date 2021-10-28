package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.AsigOrdenVO;
import ModeloDAO.AsigOrdenDAO;
import ModeloVO.ProcesoVO;

public final class actualizarProceso_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Actualizar Proceso</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <center>\r\n");
      out.write("        <h1>Actualizar Proceso!</h1>\r\n");
      out.write("        ");

            ProcesoVO ProVO =(ProcesoVO) request.getAttribute("identificacion consultada");
            if (ProVO != null) {
        
      out.write("\r\n");
      out.write("        <form method=\"post\" action=\"Proceso\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        <input type=\"hidden\" name=\"textIdProceso\" value=\"");
      out.print(ProVO.getIdProceso());
      out.write("\"><br><br>\r\n");
      out.write("                        Descripción proceso<br>\r\n");
      out.write("                        <input type=\"text\" name=\"textDescripcion\" value=\"");
      out.print(ProVO.getDescripcionProceso());
      out.write("\"><br><br>\r\n");
      out.write("                        Fecha proceso<br>\r\n");
      out.write("                        <input type=\"date\" name=\"textFecha\" value=\"");
      out.print(ProVO.getFechaProceso());
      out.write("\"><br><br>\r\n");
      out.write("                        Hora inicio<br>\r\n");
      out.write("                        <input type=\"time\" name=\"textHorai\" value=\"");
      out.print(ProVO.getHoraInicio());
      out.write("\"><br><br>\r\n");
      out.write("                        Hora fin<br>\r\n");
      out.write("                        <input type=\"time\" name=\"textHoraf\" value=\"");
      out.print(ProVO.getHoraFin());
      out.write("\"><br><br>\r\n");
      out.write("                        Prendas realizadas<br>\r\n");
      out.write("                        <input type=\"text\" name=\"textPrendasr\" value=\"");
      out.print(ProVO.getPrendasRealizadas());
      out.write("\"><br><br>\r\n");
      out.write("                        Estado Proceso<br>\r\n");
      out.write("                        <select name=\"textEstado\">\r\n");
      out.write("                        <option>Seleccione...</option>\r\n");
      out.write("                        <option value=\"Activo\">Activo</option>\r\n");
      out.write("                        <option value=\"Inactivo\">Inactivo</option>\r\n");
      out.write("                        </select><br>\r\n");
      out.write("                        Id Datos<br>\r\n");
      out.write("                        <select name=\"textAsig\">\r\n");
      out.write("                        <option>Seleccione...</option>\r\n");
      out.write("                        ");

                        AsigOrdenDAO AsigDAO = new AsigOrdenDAO();    
                        for (AsigOrdenVO AsigVO : AsigDAO.listar()) {
                        
      out.write("\r\n");
      out.write("                        <option value=\"");
      out.print(AsigVO.getIdAsigOrden());
      out.write('"');
      out.write('>');
      out.print(AsigVO.getIdAsigOrden());
      out.write("</option>\r\n");
      out.write("                        ");
 }
      out.write("\r\n");
      out.write("                        </select><br>\r\n");
      out.write("                        <td></td>  \r\n");
      out.write("                </th>\r\n");
      out.write("                <tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <button>Actualizar</button>\r\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\r\n");
      out.write("        </form><br><br>\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("        <a href=\"consultarProceso.jsp\">Volver</a><br><br>\r\n");
      out.write("        <div style=\"color: red;\">\r\n");
      out.write("            ");

                if (request.getAttribute("MensajeError") != null) { 
      out.write("\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("     \r\n");
      out.write("\r\n");
      out.write("            ");
} else {
      out.write("\r\n");
      out.write("            <div style=\"color: greenyellow\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </div>\r\n");
      out.write("            ");
  }
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </center>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
