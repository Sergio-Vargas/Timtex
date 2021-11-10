package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.AsigOrdenVO;
import ModeloDAO.AsigOrdenDAO;
import ModeloVO.ProcesoVO;
import ModeloVO.UsuarioVO;

public final class actualizarProceso_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

    HttpSession buscarSesion = (HttpSession) request.getSession();

    String usuario = "";
    String id = "";
    String correo = "";
    String rol = "";

    if (buscarSesion.getAttribute("datosUsuario") != null) {

        UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");

        usuario = usuVO.getNombreUsuario();
        id = usuVO.getIdUsuario();
        correo = usuVO.getCorreoDatos();
        rol = usuVO.getIdCargoFK();
    } else {
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

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
      out.write("\r\n");
      out.write("        <!-- Fonts -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Icons -->\r\n");
      out.write("        <link href=\"assets/css/icons.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link href=\"assets/img/brand/favicon.png\" rel=\"icon\" type=\"image/png\">\r\n");
      out.write("\r\n");
      out.write("        <!--Bootstrap.min css-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Ansta CSS -->\r\n");
      out.write("        <link href=\"assets/css/dashboard.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom scroll bar css-->\r\n");
      out.write("        <link href=\"assets/plugins/customscroll/jquery.mCustomScrollbar.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Sidemenu Css -->\r\n");
      out.write("        <link href=\"assets/plugins/toggle-sidebar/css/sidemenu.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
            ProcesoVO ProVO = (ProcesoVO) request.getAttribute("identificacion consultada");
            if (ProVO != null) {
        
      out.write("\r\n");
      out.write("        <form method=\"post\" action=\"Proceso\" class=\"my-login-validation\" id=\"basic-form\" novalidate=\"\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"card shadow\">\r\n");
      out.write("                        <div class=\"card-header\">\r\n");
      out.write("                            <h2 class=\"mb-0\">Registrar Proceso</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\"> \r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"hidden\" name=\"textIdProceso\" value=\"");
      out.print(ProVO.getIdProceso());
      out.write("\">\r\n");
      out.write("                                    <div class=\"form-group\">  \r\n");
      out.write("                                        Descripción proceso\r\n");
      out.write("                                        <input type=\"text\" name=\"textDescripcion\" maxlength=\"200\" minlength=\"2\"  class=\"form-control\" required value=\"");
      out.print(ProVO.getDescripcionProceso());
      out.write("\">\r\n");
      out.write("                                       \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">  \r\n");
      out.write("                                        Fecha proceso\r\n");
      out.write("                                        <input type=\"date\" name=\"textFechaProceso\" class=\"form-control\" readonly  value=\"");
      out.print(ProVO.getFechaProceso());
      out.write("\">\r\n");
      out.write("                                       \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">  \r\n");
      out.write("                                        Hora inicio\r\n");
      out.write("                                        <input type=\"time\" name=\"textHorai\" min=\"07:00\" max=\"14:00\"  class=\"form-control\"  value=\"");
      out.print(ProVO.getHoraInicio());
      out.write("\">\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">  \r\n");
      out.write("                                        Hora fin\r\n");
      out.write("                                        <input type=\"time\" name=\"textHoraf\" min=\"07:00\" max=\"14:00\"  class=\"form-control\"  value=\"");
      out.print(ProVO.getHoraFin());
      out.write("\">\r\n");
      out.write("                                       \r\n");
      out.write("                                    </div></div>\r\n");
      out.write("                                <div class=\"col-md-6\"> \r\n");
      out.write("                                    <div class=\"form-group\">  \r\n");
      out.write("                                        Prendas realizadas<br>\r\n");
      out.write("                                        <input type=\"number\" name=\"textPrendasr\" class=\"form-control\"  value=\"");
      out.print(ProVO.getPrendasRealizadas());
      out.write("\">\r\n");
      out.write("                                       \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">  \r\n");
      out.write("                                        Estado Proceso<br>\r\n");
      out.write("                                        <select name=\"textEstado\" class=\"form-control\" required>\r\n");
      out.write("                                            <option></option>\r\n");
      out.write("                                            <option value=\"Activo\">Activo</option>\r\n");
      out.write("                                            <option value=\"Inactivo\">Inactivo</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">  \r\n");
      out.write("                                        Id Asig Orden\r\n");
      out.write("                                        <select name=\"textAsig\" class=\"form-control\" readonly>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(ProVO.getIdAsigOrdenFK());
      out.write('"');
      out.write('>');
      out.print(ProVO.getIdAsigOrdenFK());
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                       \r\n");
      out.write("                                    </div></div>\r\n");
      out.write("                                <div class=\" col-md-6\">\r\n");
      out.write("                                    <center>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary mb-0 btn-block waves-effect waves-light\">Actualizar</button>\r\n");
      out.write("                                    </center>\r\n");
      out.write("                                </div>  \r\n");
      out.write("\r\n");
      out.write("                            </div> </div></div></div></div>\r\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\r\n");
      out.write("        </form>\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("        <a href=\"consultarProceso.jsp\" class=\"btn btn-primary mb-0 btn-block waves-effect waves-light\">Volver</a>\r\n");
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
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"assets/plugins/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- validacion de formularios -->\r\n");
      out.write("    <script src=\"JS/my-login.js\"></script>\r\n");
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
