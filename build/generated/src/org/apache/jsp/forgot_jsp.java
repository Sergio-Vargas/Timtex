package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"author\" content=\"Kodinger\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("\t<title>Recuperar contraseña</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Estilos/my-login.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"my-login-page\">\r\n");
      out.write("\t<section class=\"h-100\">\r\n");
      out.write("\t\t<div class=\"container h-100\">\r\n");
      out.write("\t\t\t<div class=\"row justify-content-md-center align-items-center h-100\">\r\n");
      out.write("\t\t\t\t<div class=\"card-wrapper\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card fat\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"brand\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"Imagenes/logo.png\" alt=\"bootstrap 4 login page\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"card-title\">Recuperar contraseña</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<form method=\"POST\" class=\"my-login-validation\" action=\"Usuario\" id=\"basic-form\" novalidate=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"email\">Ingrese correo</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"correo\" name=\"textCorreo\" pattern=\"^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$\" required autofocus>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-text text-muted\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tAl hacer clic en \"Restablecer contraseña\", le enviaremos un correo con una contraseña autogenerada.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group m-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary btn-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tRestablecer contraseña\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                            <div class=\"mt-4 text-center\">\r\n");
      out.write("                                                                <p style=\" color:red;font-size:15px;\">\r\n");
      out.write("                                                                    ");

                                                                        if (request.getAttribute("MensajeError") != null) {
                                                                    
      out.write("\r\n");
      out.write("                                                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("     \r\n");
      out.write("                                                                    ");
} else {
      out.write("\r\n");
      out.write("                                                                <div style=\"color: greenyellow\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                                                                ");
  }
      out.write("     \r\n");
      out.write("                                                                </p>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        <input type=\"hidden\" value=\"5\" name=\"opcion\">    \r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write(" <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("        <script src=\"assets/plugins/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- validacion de formularios -->\r\n");
      out.write("        <script src=\"JS/my-login.js\"></script>\r\n");
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
