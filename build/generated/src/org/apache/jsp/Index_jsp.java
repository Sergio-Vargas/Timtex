package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Index</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\"/>\n");
      out.write("        \n");
      out.write("        <link href=\"Estilos/Estlos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Imagenes/difal.jpg\">\t\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t<!-- Navegador -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-mainbg\">\n");
      out.write("    <!-- Logo -->\n");
      out.write("    <a class=\"navbar-brand navbar-logo\" href=\"#\">Confecciones Difal S.A.S</a>\n");
      out.write("    <!-- Botón -->\n");
      out.write("    <button \n");
      out.write("      class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <i class=\"fas fa-bars text-white\"></i>\n");
      out.write("    </button>\n");
      out.write("    <!-- Vinculos -->\n");
      out.write("    <div \n");
      out.write("      class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <!-- Estilos -->\n");
      out.write("            <div class=\"hori-selector\">\n");
      out.write("              <div class=\"left\"></div>\n");
      out.write("              <div class=\"right\"></div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Enlaces -->\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a \n");
      out.write("                  class=\"nav-link\" href=\"Index.jsp\">\n");
      out.write("                  <i class=\"fas fa-home\"></i>Inicio\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item \">\n");
      out.write("                <a \n");
      out.write("                  class=\"nav-link\" href=\"Mision.jsp\">\n");
      out.write("                    <i class=\"fas fa-bullseye\"></i>Misión\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a \n");
      out.write("                  class=\"nav-link\" href=\"Vision.jsp\">\n");
      out.write("                  <i class=\"fas fa-eye\">\n");
      out.write("                  </i>Vision\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a \n");
      out.write("                  class=\"nav-link\" href=\"Login.jsp\">\n");
      out.write("                  <i \n");
      out.write("                    class=\"fas fa-sign-in-alt\">\n");
      out.write("                  </i>Login\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("<br>\n");
      out.write("<div class=\"imagenyparrafo\">\n");
      out.write("\t<img class=\"imagen1\" src=\"Imagenes/difal.jpg\">\n");
      out.write("<div>\n");
      out.write("\t<p class=\"parrafo\">Confecciones Difal S.A.S diseña y produce dotación para las empresas Colombianas<br> brindando \n");
      out.write("\t\tproductos y servicios con calidad y seguridad,<br> atendiendo los requerimientos de nuestros clientes.</p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"contenedor\">\n");
      out.write("<div>\n");
      out.write("<br><br>\n");
      out.write("<img class=\"imagen2\" src=\"Imagenes/difal.jpg\">\n");
      out.write("<img class=\"imagen2\" src=\"Imagenes/difal.jpg\">\n");
      out.write("<img class=\"imagen2\" src=\"Imagenes/difal.jpg\">\n");
      out.write("<br><br>\n");
      out.write("<img class=\"imagen2\" src=\"Imagenes/difal.jpg\">\n");
      out.write("<img class=\"imagen2\" src=\"Imagenes/difal.jpg\">\n");
      out.write("<img class=\"imagen2\" src=\"Imagenes/difal.jpg\">\n");
      out.write("\n");
      out.write("<p class=\"pcontenido\">Confecciones Difal S.A.S diseña y produce dotación para las empresas Colombianas\n");
      out.write("\tbrindando productos y servicios con calidad y seguridad,\n");
      out.write("\tatendiendo los requerimientos de nuestros clientes.</p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<footer class=\"footer\">\n");
      out.write("\t<div class=\"contactenos\">\n");
      out.write("\t\t<p>Contactanos</p>\n");
      out.write("\t\t<p>Cel:+57 3102265916</p>\n");
      out.write("\t\t<p>Correo:condifal@hotmail.com</p>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"ubicacion\">\n");
      out.write("\t\t<p>Ubicación</p>\n");
      out.write("\t\t<p>En la Localidad de Kennedy,<br> barrio Las Delicias Av Boyacá<br> N 43 C 65 Sur  6</p>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"redes\">\n");
      out.write("\t\t<p>Redes sociales</p>\n");
      out.write("                <a href=\"https://www.facebook.com/condifal/\"><img src=\"Imagenes/facebook.png\" style=\"height:80px;\"></a>\n");
      out.write("\t\t<p>Confecciones Difal S.A.S</p>\n");
      out.write("\t</div>\n");
      out.write("</footer>\n");
      out.write("<!-- Scripts -->\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"JS/menu.js\" type=\"text/javascript\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
