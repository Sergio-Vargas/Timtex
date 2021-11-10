package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.DatosPersonalesVO;
import ModeloVO.UsuarioVO;

public final class registrarDatosPersonales_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es-Es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Registrar Datos Personales</title>\r\n");
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
      out.write("    <body>          \r\n");
      out.write("        <form action=\"DatosPersonales\" method=\"POST\" class=\"my-login-validation\" id=\"my-login-validation\" novalidate=\"\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"card shadow\">\r\n");
      out.write("                        <div class=\"card-header\">\r\n");
      out.write("                            <h2 class=\"mb-0\">Registro de Datos</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"nombre\">Nombre</label>\r\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" maxlength=\"15\" minlength=\"2\" pattern=\"[a-zA-Z ]{2,20}\" name=\"textNombre\" placeholder=\"Ingrese su nombre\" required>\r\n");
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
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"nombre\">Apellido</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"textApellido\"  class=\"form-control\" maxlength=\"15\" minlength=\"2\" pattern=\"[a-zA-Z ]{2,20}\" placeholder=\"Ingrese su apellido\" required>\r\n");
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
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("                                        <label for=\"direccion\">Dirección</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" type=\"text\" name=\"textDireccion\" required>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            El campo no puede estar vacío\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"direccion\">Celular</label>\r\n");
      out.write("                                        <input type=\"number\" name=\"textTelefono\" min=\"1000000\" max=\"9000000000\" class=\"form-control\"   placeholder=\"3115453175\" required>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            El campo no puede estar vacío\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            Minimo de 7 caracteres\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            Màximo de 10 carcteres\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"correo\">Correo</label>\r\n");
      out.write("                                        <input type=\"email\" name=\"textCorreo\" value=\"");
      out.print(correo);
      out.write("\" class=\"form-control\" required readonly>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            El campo no puede estar vacío\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            El campo debe tener el formato email\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"textEstado\" class=\"form-control\" value=\"Activo\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input type=\"hidden\" value=\"");
      out.print(id);
      out.write("\" class=\"form-control\" name=\"textUsuario\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"custom-checkbox custom-control\">\r\n");
      out.write("                                        <input type=\"checkbox\" name=\"agree\" id=\"agree\" class=\"custom-control-input\" required=\"\">\r\n");
      out.write("                                        <label for=\"agree\" class=\"custom-control-label\">Estoy de acuerdo con los <a href=\"#\">términos y condiciones</a></label>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            Debes estar de acuerdo con nuestros términos y condiciones.\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\" col-md-6\">\r\n");
      out.write("                                    <center>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary mb-0 btn-block waves-effect waves-light\">Registrar</button>\r\n");
      out.write("                                    </center>\r\n");
      out.write("                                </div>  \r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>    \r\n");
      out.write("                </div>            \r\n");
      out.write("                <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("                </form>     \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div style=\"color: red;\">\r\n");
      out.write("                    ");

                if (request.getAttribute("MensajeError") != null) { 
      out.write("\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("     \r\n");
      out.write("\r\n");
      out.write("                    ");
} else {
      out.write("\r\n");
      out.write("                    <div style=\"color: darkgreen\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("                    ");
  }
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("                <script src=\"assets/plugins/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("                <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- validacion de formularios -->\r\n");
      out.write("                <script src=\"JS/my-login.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                </body>\r\n");
      out.write("                </html>");
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
