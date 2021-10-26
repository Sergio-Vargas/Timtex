package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.DatosPersonalesVO;

public final class registrarDatosPersonales_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Datos personales</title>\n");
      out.write("    </head>\n");
      out.write("    <script src=\"JS/Validaciones.js\" type=\"text/javascript\"></script>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Registrar Datos</h1>\n");
      out.write("         <form method=\"post\" action=\"DatosPersonales\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                         Datos<br>\n");
      out.write("                        <input type=\"text\" name=\"textNumeroid\" id=\"id\"><br><br>\n");
      out.write("                        Nombre<br>\n");
      out.write("                        <input type=\"text\" name=\"textNombre\" id=\"nombre\"><br><br>\n");
      out.write("                        Apellido<br>\n");
      out.write("                        <input type=\"text\" name=\"textApellido\" id=\"apellido\"><br><br>\n");
      out.write("                        Direccion<br>\n");
      out.write("                        <input type=\"text\" name=\"textDireccion\" id=\"direccion\"><br><br>\n");
      out.write("                        Telefono<br>\n");
      out.write("                        <input type=\"text\" name=\"textTelefono\" id=\"telefono\"><br><br>\n");
      out.write("                        Correo<br>\n");
      out.write("                        <input type=\"text\" name=\"textCorreo\" id=\"email\"><br><br>\n");
      out.write("                        Estado<br>\n");
      out.write("                        <input type=\"text\" name=\"textEstado\" id=\"estado\"><br><br>\n");
      out.write("                        Id usuario<br>\n");
      out.write("                        <input type=\"text\" name=\"textUsuario\" id=\"idusuario\"><br><br>\n");
      out.write("                        <td></td>\n");
      out.write("                </th>\n");
      out.write("            </table>\n");
      out.write("            <button class=\"enviar\" onclick=\"validar(id, nombre, \n");
      out.write("                        apellido, direccion, telefono, email, estado, idusuario)\" >Registrar</button>\n");
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
