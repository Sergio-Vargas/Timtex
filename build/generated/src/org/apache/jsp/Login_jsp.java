package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"author\" content=\"Kodinger\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("\t<title>Iniciar Sesión</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Estilos/my-login.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"my-login-page\">\n");
      out.write("\t<section class=\"h-100\">\n");
      out.write("\t\t<div class=\"container h-100\">\n");
      out.write("\t\t\t<div class=\"row justify-content-md-center h-100\">\n");
      out.write("\t\t\t\t<div class=\"card-wrapper\">\n");
      out.write("\t\t\t\t\t<div class=\"card fat\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"brand\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"Imagenes/logo.jpg\" alt=\"logo\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"card-title\">Iniciar Sesión</h1>\n");
      out.write("                                                        <form method=\"POST\" action=\"Usuario\" class=\"my-login-validation\" novalidate=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"email\">Usuario</label>\n");
      out.write("                                                                        <input id=\"usuario\" type=\"text\" class=\"form-control\" name=\"textUsuario\" value=\"\" required autofocus>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"invalid-feedback\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tUsuario es invalido\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"password\">Contraseña\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("                                                                        <input id=\"password\" type=\"password\"  class=\"form-control\" name=\"textClave\" required data-eye>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"forgot.jsp\" class=\"float-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t¿Olvidaste tu contraseña?\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t    <div class=\"invalid-feedback\">\n");
      out.write("\t\t\t\t\t\t\t\t    \tContraseña es requerieda\n");
      out.write("\t\t\t\t\t\t\t    \t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group m-0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn  btn-block\" value=\"Ingresar\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tIngresar\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mt-4 text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t¿No tienes un cuenta? <a href=\"register.jsp\">Crear una</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <p style=\" color: white;font-size:15px;\">\n");
      out.write("                                                        ");

                                                        if (request.getAttribute("MensajeError") != null) { 
                                                        
      out.write("\n");
      out.write("                                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("     \n");
      out.write("                                                        ");
} else {
      out.write("\n");
      out.write("                                                        <div style=\"color: greenyellow\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                                        ");
  }
      out.write("     \n");
      out.write("                                                        </p>\n");
      out.write("                                                        <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("                                                        \n");
      out.write("\t</section>\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"JS/my-login.js\"></script>\n");
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
