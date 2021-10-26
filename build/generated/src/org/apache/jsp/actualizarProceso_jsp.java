package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Actualizar Proceso</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Actualizar Proceso!</h1>\n");
      out.write("        ");

            ProcesoVO ProVO =(ProcesoVO) request.getAttribute("identificacion consultada");
            if (ProVO != null) {
        
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Proceso\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Proceso<br>\n");
      out.write("                        <input type=\"text\" name=\"textIdProceso\" value=\"");
      out.print(ProVO.getIdProceso());
      out.write("\"><br><br>\n");
      out.write("                        Descripción proceso<br>\n");
      out.write("                        <input type=\"text\" name=\"textDescripcion\" value=\"");
      out.print(ProVO.getDescripcionProceso());
      out.write("\"><br><br>\n");
      out.write("                        Fecha proceso<br>\n");
      out.write("                        <input type=\"date\" name=\"textFecha\" value=\"");
      out.print(ProVO.getFechaProceso());
      out.write("\"><br><br>\n");
      out.write("                        Hora inicio<br>\n");
      out.write("                        <input type=\"time\" name=\"textHorai\" value=\"");
      out.print(ProVO.getHoraInicio());
      out.write("\"><br><br>\n");
      out.write("                        Hora fin<br>\n");
      out.write("                        <input type=\"time\" name=\"textHoraf\" value=\"");
      out.print(ProVO.getHoraFin());
      out.write("\"><br><br>\n");
      out.write("                        Prendas realizadas<br>\n");
      out.write("                        <input type=\"text\" name=\"textPrendasr\" value=\"");
      out.print(ProVO.getPrendasRealizadas());
      out.write("\"><br><br>\n");
      out.write("                        Proceso<br>\n");
      out.write("                        <input type=\"text\" name=\"textEstado\" value=\"");
      out.print(ProVO.getEstadoProceso());
      out.write("\"><br><br>\n");
      out.write("                        Id orden<br>\n");
      out.write("                        <input type=\"text\" name=\"textIdorden\" value=\"");
      out.print(ProVO.getIdOrdenFK());
      out.write("\"><br><br>\n");
      out.write("                        Id Datos<br>\n");
      out.write("                        <input type=\"text\" name=\"textIddatos\" value=\"");
      out.print(ProVO.getIdDatosFK());
      out.write("\"><br><br>\n");
      out.write("                        <td></td>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                </th>\n");
      out.write("                <tr>\n");
      out.write("            </table>\n");
      out.write("            <button>Actualizar</button>\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("        </form><br><br>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("        <a href=\"consultarProceso.jsp\">Volver</a><br><br>\n");
      out.write("        <div style=\"color: red;\">\n");
      out.write("\n");
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
      out.write(" </div>\n");
      out.write("            ");
  }
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</body>\n");
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
