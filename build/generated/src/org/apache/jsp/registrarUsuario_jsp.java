package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Registrar Usuario</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Estilos/my-login.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"my-login-page\">\r\n");
      out.write("        <section class=\"h-100\">\r\n");
      out.write("            <div class=\"container h-100\">\r\n");
      out.write("                <div class=\"row justify-content-md-center h-100\">\r\n");
      out.write("                    <div class=\"card-wrapper\">\r\n");
      out.write("                        <div class=\"card fat\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"brand\">\r\n");
      out.write("                                    <img src=\"Imagenes/logo.png\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h1 class=\"card-title\">Registrar Usuario</h1>\r\n");
      out.write("\r\n");
      out.write("                                <form method=\"post\" action=\"Usuario\" id=\"basic-form\"  class=\"my-login-validation\" novalidate=\"\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        Usuario\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"textUsuario\" pattern=\"[a-zA-Z ]{2,20}\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        Correo\r\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" id=\"correo\" name=\"textCorreo\" pattern=\"^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                  \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        Contraseña\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" id=\"clave\" name=\"textClave\" required data-eye>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        Confirmar contraseña\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" name=\"textClave2\" equalTo=\"textClave\" required data-eye>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <input type=\"hidden\" class=\"form-control\" name=\"textClave\" value=\"Activo\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                     <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"custom-checkbox custom-control\">\r\n");
      out.write("                                        <input type=\"checkbox\" name=\"agree\" id=\"agree\" class=\"custom-control-input\" required=\"\">\r\n");
      out.write("                                        <label for=\"agree\" class=\"custom-control-label\">Estoy de acuerdo con los <a href=\"#\">términos y condiciones</a></label>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            Debe estar de acuerdo con nuestros términos y condiciones.\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                    <input type=\"hidden\" name=\"textCargo\" value=\"2\">\r\n");
      out.write("                                    <div class=\"form-group m-0\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-block\">\r\n");
      out.write("                                            Registrar\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mt-4 text-center\">\r\n");
      out.write("                                        <p style=\" color:red;font-size:15px;\">\r\n");
      out.write("                                            ");

                                                if (request.getAttribute("MensajeError") != null) {
                                            
      out.write("\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("     \r\n");
      out.write("                                            ");
} else {
      out.write("\r\n");
      out.write("                                        <div style=\"color: greenyellow\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                                        ");
  }
      out.write("     \r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div></section>\r\n");
      out.write("        \r\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("        <script src=\"assets/plugins/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- validacion de formularios -->\r\n");
      out.write("        <script src=\"JS/my-login.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
