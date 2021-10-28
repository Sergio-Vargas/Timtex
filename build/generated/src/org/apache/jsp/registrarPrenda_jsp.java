package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.TipoPrendaVO;
import ModeloDAO.TipoPrendaDAO;
import ModeloVO.UsuarioVO;

public final class registrarPrenda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Registrar Prenda</title>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Fonts -->\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Icons -->\r\n");
      out.write("        <link href=\"assets/css/icons.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("\t<link href=\"assets/img/brand/favicon.png\" rel=\"icon\" type=\"image/png\">\r\n");
      out.write("        \r\n");
      out.write("\t<!--Bootstrap.min css-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Ansta CSS -->\r\n");
      out.write("\t<link href=\"assets/css/dashboard.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Custom scroll bar css-->\r\n");
      out.write("\t<link href=\"assets/plugins/customscroll/jquery.mCustomScrollbar.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\t<!-- Sidemenu Css -->\r\n");
      out.write("\t<link href=\"assets/plugins/toggle-sidebar/css/sidemenu.css\" rel=\"stylesheet\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("  \r\n");

   HttpSession buscarSesion =(HttpSession)request.getSession();
    String usuario="";
    String id="";      
    String correo="";
    if(buscarSesion.getAttribute("datosUsuario")!=null){
        
    UsuarioVO usuVO=(UsuarioVO)buscarSesion.getAttribute("datosUsuario");
    
   usuario=usuVO.getNombreUsuario();
   id=usuVO.getIdUsuario();
   correo=usuVO.getCorreoDatos();
    }
    else{
    request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form method=\"post\" action=\"Prenda\" class=\"my-login-validation\" id=\"my-login-validation\" novalidate=\"\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"card shadow\">\r\n");
      out.write("                        <div class=\"card-header\">\r\n");
      out.write("                            <h2 class=\"mb-0\">Registrar Prenda</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"form-group\">               \r\n");
      out.write("                                        <label>Imagen</label>\r\n");
      out.write("                                        <input type=\"file\" name=\"textImagenPrenda\"  class=\"form-control\" required>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            El campo no puede estar vacío\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">  \r\n");
      out.write("                                        <label>Nombre</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"textNombrePrenda\" class=\"form-control\" maxlength=\"15\" minlength=\"2\" pattern=\"[a-zA-Z ]{2,20}\" required>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">  \r\n");
      out.write("                                            El campo no puede estar vacío \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">  \r\n");
      out.write("                                            Debe tener minimo 5 caracteres\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">  \r\n");
      out.write("                                            Maximo 15 caracteres\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">  \r\n");
      out.write("                                            Solo se aceptan letras\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\"> \r\n");
      out.write("                                        <label>Descripción</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"textDescripcionPrenda\" class=\"form-control\" maxlength=\"250\" minlength=\"2\" pattern=\"[a-zA-Z ]{2,20}\" required>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">  \r\n");
      out.write("                                            El campo no puede estar vacío \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">  \r\n");
      out.write("                                            Debe tener minimo 5 caracteres\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">  \r\n");
      out.write("                                            Maximo 250 caracteres\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">  \r\n");
      out.write("                                            Solo se aceptan letras\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\" col-md-6\">\r\n");
      out.write("                                <div class=\"form-group\"> \r\n");
      out.write("                                    <label>Tipo Prenda</label>\r\n");
      out.write("                                    <select name=\"textIdTipoPrendaFK\" class=\"form-control\" required=\"\">\r\n");
      out.write("                                        <option></option>\r\n");
      out.write("                                        ");

                                            TipoPrendaDAO TPreDAO = new TipoPrendaDAO();
                                            for (TipoPrendaVO TPreVO : TPreDAO.listar()) {
                                        
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print(TPreVO.getIdTipoPrenda());
      out.write('"');
      out.write('>');
      out.print(TPreVO.getNombreTipoPrenda());
      out.write("</option>\r\n");
      out.write("                                        ");
 }
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                     <div class=\"invalid-feedback\">  \r\n");
      out.write("                                        Debe seleccionar algun tipo de prenda\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>    \r\n");
      out.write("                                      \r\n");
      out.write("                                <div class=\"form-group\">            \r\n");
      out.write("                                    <label>Precio</label>\r\n");
      out.write("                                    <input type=\"number\" name=\"textPrecio\" min=\"10000\" class=\"form-control\" required><br><br>\r\n");
      out.write("                                    <div class=\"invalid-feedback\">  \r\n");
      out.write("                                        El campo no puede estar vacío \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"invalid-feedback\">  \r\n");
      out.write("                                        Debe tener minimo 10000 en adelante\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>      \r\n");
      out.write("                                    <input type=\"hidden\" name=\"textEstadoPrenda\" class=\"form-control\" value=\"Activo\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\" col-md-6\">\r\n");
      out.write("                                    <center>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary mb-0 btn-block waves-effect waves-light\">Registrar</button>\r\n");
      out.write("                                    </center>\r\n");
      out.write("                                </div>  \r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>    \r\n");
      out.write("                    </div>          \r\n");
      out.write("                </div>    \r\n");
      out.write("            </div>       \r\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("        </form>\r\n");
      out.write("                                    \r\n");
      out.write("                              \r\n");
      out.write("                                                             \r\n");
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
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("            ");
  }
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write(" \r\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("  <script src=\"assets/plugins/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("        <!-- validacion de formularios -->\r\n");
      out.write("       <script src=\"JS/my-login.js\"></script>\r\n");
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
