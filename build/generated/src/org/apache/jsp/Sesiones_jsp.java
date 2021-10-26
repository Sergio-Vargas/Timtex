package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;

public final class Sesiones_jsp extends org.apache.jasper.runtime.HttpJspBase
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

response.setHeader("Pragma", "No-cache");
response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
response.setDateHeader("Expires",0);

      out.write("\n");
      out.write("  \n");

   HttpSession buscarSesion =(HttpSession)request.getSession();
    String usuario="";
    String id="";        
    if(buscarSesion.getAttribute("datosUsuario")!=null){
        
    UsuarioVO usuVO=(UsuarioVO)buscarSesion.getAttribute("datosUsuario");
    
   usuario=usuVO.getNombreUsuario();
   id=usuVO.getIdUsuario();
    }
    else{
    request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sesiones</title>\n");
      out.write("        <!-- Favicon -->\n");
      out.write("\t<link href=\"assets/img/brand/favicon.png\" rel=\"icon\" type=\"image/png\">\n");
      out.write("\n");
      out.write("\t<!-- Fonts -->\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<!-- Icons -->\n");
      out.write("\t<link href=\"assets/css/icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<!--Bootstrap.min css-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\t<!-- Ansta CSS -->\n");
      out.write("\t<link href=\"assets/css/dashboard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\t<!-- Tabs CSS -->\n");
      out.write("\t<link href=\"assets/plugins/tabs/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\t<!-- jvectormap CSS -->\n");
      out.write("    <link href=\"assets/plugins/jvectormap/jquery-jvectormap-2.0.2.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\t<!-- Custom scroll bar css-->\n");
      out.write("\t<link href=\"assets/plugins/customscroll/jquery.mCustomScrollbar.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\t<!-- Sidemenu Css -->\n");
      out.write("\t<link href=\"assets/plugins/toggle-sidebar/css/sidemenu.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <!-- Top navbar -->\n");
      out.write("                    <nav class=\"navbar navbar-top  navbar-expand-md navbar-dark\" id=\"navbar-main\">\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                    <a aria-label=\"Hide Sidebar\" class=\"app-sidebar__toggle\" data-toggle=\"sidebar\" href=\"#\"></a>\n");
      out.write("\n");
      out.write("                                    <!-- Horizontal Navbar -->\n");
      out.write("                                    <ul class=\"navbar-nav align-items-center d-none d-xl-block\">\n");
      out.write("                                            <li class=\"nav-item dropdown\">\n");
      out.write("                                                    <a aria-expanded=\"false\" aria-haspopup=\"true\" class=\"nav-link pr-md-0 d-none d-lg-block\" data-toggle=\"dropdown\" href=\"#\" role=\"button\">\n");
      out.write("                                                            Configuracion<span class=\"fas fa-caret-down\"></span>\n");
      out.write("                                                    </a>\n");
      out.write("                                                    <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\">\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><span>Perfil del Administrador</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><span>Temas</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><span>Contraseñas</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><span>Métodos de pago</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><span>Otras configuraciones</span></a>\n");
      out.write("                                                    </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"nav-item dropdown\">\n");
      out.write("                                                    <a aria-expanded=\"false\" aria-haspopup=\"true\" class=\"nav-link pr-md-0 d-none d-lg-block\" data-toggle=\"dropdown\" href=\"#\" role=\"button\">\n");
      out.write("                                                            Proyectos <span class=\"fas fa-caret-down\"></span>\n");
      out.write("                                                    </a>\n");
      out.write("                                                    <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\">\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><span>Activo</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><span>Marketing</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><span>Usuarios</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><span>Desarrollo</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><span>Ajustes</span></a>\n");
      out.write("                                                    </div>\n");
      out.write("                                            </li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                    <!-- Brand -->\n");
      out.write("                                    <a class=\"navbar-brand pt-0 d-md-none\" href=\"index-2.html\">\n");
      out.write("                                            <img src=\"assets/img/brand/logo-light.png\" class=\"navbar-brand-img\" alt=\"...\">\n");
      out.write("                                    </a>\n");
      out.write("                                    <!-- Form -->\n");
      out.write("                                    <form class=\"navbar-search navbar-search-dark form-inline mr-3 ml-lg-auto\">\n");
      out.write("                                            <div class=\"form-group mb-0\">\n");
      out.write("                                                    <div class=\"input-group input-group-alternative\">\n");
      out.write("                                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                                    <span class=\"input-group-text\"><i class=\"fas fa-search\"></i></span>\n");
      out.write("                                                            </div><input class=\"form-control\" placeholder=\"Search\" type=\"text\">\n");
      out.write("                                                    </div>\n");
      out.write("                                            </div>\n");
      out.write("                                    </form>\n");
      out.write("                                    <!-- User -->\n");
      out.write("                                    <ul class=\"navbar-nav align-items-center \">\n");
      out.write("                                            <li class=\"nav-item d-none d-md-flex\">\n");
      out.write("                                                    <div class=\"dropdown d-none d-md-flex mt-2 \">\n");
      out.write("                                                            <a class=\"nav-link full-screen-link pl-0 pr-0\"><i class=\"fe fe-maximize-2 floating \" id=\"fullscreen-button\"></i></a>\n");
      out.write("                                                    </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"nav-item dropdown d-none d-md-flex\">\n");
      out.write("                                                    <a aria-expanded=\"false\" aria-haspopup=\"true\" class=\"nav-link pr-0\" data-toggle=\"dropdown\" href=\"#\" role=\"button\">\n");
      out.write("                                                    <div class=\"media align-items-center\">\n");
      out.write("                                                            <i class=\"fe fe-user \"></i>\n");
      out.write("                                                    </div></a>\n");
      out.write("                                                    <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-arrow dropdown-menu-right\">\n");
      out.write("                                                            <a class=\"dropdown-item d-flex\" href=\"#\">\n");
      out.write("                                                                    <span class=\"avatar brround mr-3 align-self-center\"> <img src=\"assets/img/faces/male/4.jpg\" alt=\"imag\" ></span>\n");
      out.write("                                                                    <div>\n");
      out.write("                                                                            <strong>Madeleine Scott</strong> te mando una solicitud\n");
      out.write("                                                                            <div class=\" mt-2 small text-muted\">\n");
      out.write("                                                                                    <span class=\"btn btn-sm btn-primary\">Confirmar</span>\n");
      out.write("                                                                                    <span class=\"btn btn-sm btn-outline-primary\">Eliminar</span>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                            </a>\n");
      out.write("                                                            <a class=\"dropdown-item d-flex\" href=\"#\">\n");
      out.write("                                                                    <span class=\"avatar brround mr-3 align-self-center\"><img src=\"assets/img/faces/female/14.jpg\" alt=\"imag\" ></span>\n");
      out.write("                                                                    <div>\n");
      out.write("                                                                            <strong>rebica</strong> te mando una solicitud\n");
      out.write("                                                                            <div class=\" mt-2 small text-muted\">\n");
      out.write("                                                                                    <span class=\"btn btn-sm btn-primary\">Confirmar</span>\n");
      out.write("                                                                                    <span class=\"btn btn-sm btn-outline-primary\">Eliminar</span>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                            </a>\n");
      out.write("                                                            <a class=\"dropdown-item d-flex\" href=\"#\">\n");
      out.write("                                                                    <span class=\"avatar brround mr-3 align-self-center\"><img src=\"assets/img/faces/male/1.jpg\" alt=\"imag\"></span>\n");
      out.write("                                                                    <div>\n");
      out.write("                                                                            <strong>Devid robott</strong> te mando una solicitud\n");
      out.write("                                                                            <div class=\" mt-2 small text-muted\">\n");
      out.write("                                                                                    <span class=\"btn btn-sm btn-primary\">Confirmar</span>\n");
      out.write("                                                                                    <span class=\"btn btn-sm btn-outline-primary\">Eliminar</span>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                            </a>\n");
      out.write("                                                            <div class=\"dropdown-divider\"></div><a class=\"dropdown-item text-center text-muted-dark\" href=\"#\">Ver todas las solicitudes</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                            </li>\n");
      out.write("\n");
      out.write("                                            <li class=\"nav-item dropdown d-none d-md-flex\">\n");
      out.write("                                                    <a aria-expanded=\"false\" aria-haspopup=\"true\" class=\"nav-link pr-0\" data-toggle=\"dropdown\" href=\"#\" role=\"button\">\n");
      out.write("                                                    <div class=\"media align-items-center\">\n");
      out.write("                                                            <i class=\"fe fe-mail \"></i>\n");
      out.write("                                                    </div></a>\n");
      out.write("                                                    <div class=\"dropdown-menu  dropdown-menu-lg dropdown-menu-arrow dropdown-menu-right\">\n");
      out.write("                                                            <a href=\"#\" class=\"dropdown-item text-center\">12 Nuevos Mensajes</a>\n");
      out.write("                                                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                                                            <a href=\"#\" class=\"dropdown-item d-flex\">\n");
      out.write("                                                                    <span class=\"avatar brround mr-3 align-self-center\"><img src=\"assets/img/faces/male/41.jpg\" alt=\"img\"></span>\n");
      out.write("                                                                    <div>\n");
      out.write("                                                                            <strong>Madeleine</strong> ¡Hola! Estoy disponible\n");
      out.write("                                                                            <div class=\"small text-muted\">Hace 3 horas</div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                            </a>\n");
      out.write("                                                            <a href=\"#\" class=\"dropdown-item d-flex\">\n");
      out.write("                                                                    <span class=\"avatar brround mr-3 align-self-center\"><img src=\"assets/img/faces/female/1.jpg\" alt=\"img\" ></span>\n");
      out.write("                                                                    <div>\n");
      out.write("                                                                            <strong>Anthony</strong> Nuevo producto publicando...\n");
      out.write("                                                                            <div class=\"small text-muted\">Hace 5 horas</div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                            </a>\n");
      out.write("                                                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                                                            <a href=\"#\" class=\"dropdown-item text-center\">Ver todos los mensajes</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"nav-item dropdown d-none d-md-flex\">\n");
      out.write("                                                    <a aria-expanded=\"false\" aria-haspopup=\"true\" class=\"nav-link pr-0\" data-toggle=\"dropdown\" href=\"#\" role=\"button\">\n");
      out.write("                                                    <div class=\"media align-items-center\">\n");
      out.write("                                                            <i class=\"fe fe-bell f-30 \"></i>\n");
      out.write("                                                    </div></a>\n");
      out.write("                                                    <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-arrow dropdown-menu-right\">\n");
      out.write("                                                            <a href=\"#\" class=\"dropdown-item d-flex\">\n");
      out.write("                                                                    <div>\n");
      out.write("                                                                            <strong>Alguien le dio link a tus publicaciones</strong>\n");
      out.write("                                                                            <div class=\"small text-muted\">Hace 3 horas</div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                            </a>\n");
      out.write("                                                            <a href=\"#\" class=\"dropdown-item d-flex\">\n");
      out.write("                                                                    <div>\n");
      out.write("                                                                            <strong> 3 Nuevos comentarios</strong>\n");
      out.write("                                                                            <div class=\"small text-muted\">Hace 5 horas</div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                            </a>\n");
      out.write("                                                            <a href=\"#\" class=\"dropdown-item d-flex\">\n");
      out.write("                                                                    <div>\n");
      out.write("                                                                            <strong> Servidor reseteado</strong>\n");
      out.write("                                                                            <div class=\"small text-muted\">Hace 45 minutos</div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                            </a>\n");
      out.write("                                                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                                                            <a href=\"#\" class=\"dropdown-item text-center\">Ver todas las notificaciones</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"nav-item dropdown\">\n");
      out.write("                                                    <a aria-expanded=\"false\" aria-haspopup=\"true\" class=\"nav-link pr-md-0\" data-toggle=\"dropdown\" href=\"#\" role=\"button\">\n");
      out.write("                                                    <div class=\"media align-items-center\">\n");
      out.write("                                                            <span class=\"avatar avatar-sm rounded-circle\"><img alt=\"Image placeholder\" src=\"assets/img/faces/female/32.jpg\"></span>\n");
      out.write("                                                            <div class=\"media-body ml-2 d-none d-lg-block\">\n");
      out.write("                                                                    <span class=\"mb-0 \">");
      out.print(usuario);
      out.write("</span>\n");
      out.write("                                                            </div>\n");
      out.write("                                                    </div></a>\n");
      out.write("                                                    <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\">\n");
      out.write("                                                            <div class=\" dropdown-header noti-title\">\n");
      out.write("                                                                    <h6 class=\"text-overflow m-0\">¡Bienvenido!</h6>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"user-profile.html\"><i class=\"ni ni-single-02\"></i> <span>Mi perfil</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"ni ni-settings-gear-65\"></i> <span>Ajustes</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"ni ni-calendar-grid-58\"></i> <span>Actividad</span></a>\n");
      out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"ni ni-support-16\"></i> <span>Soporte</span></a>\n");
      out.write("                                                            <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                                                            <input class=\"dropdown-item\" type=\"submit\" value=\"Cerrar Sesion\">\n");
      out.write("                                                            </form>\n");
      out.write("                                                            <input type=\"hidden\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                                                    </div>\n");
      out.write("                                            </li>\n");
      out.write("                                    </ul>\n");
      out.write("                            </div>\n");
      out.write("                    </nav>\n");
      out.write("                    <!-- Top navbar-->\n");
      out.write("    </body>\n");
      out.write("    <!-- Ansta Scripts -->\n");
      out.write("\t<!-- Core -->\n");
      out.write("\t<script src=\"assets/plugins/jquery/dist/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/popper.js\"></script>\n");
      out.write("\t<script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Echarts JS -->\n");
      out.write("\t<script src=\"assets/plugins/chart-echarts/echarts.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Fullside-menu Js-->\n");
      out.write("\t<script src=\"assets/plugins/toggle-sidebar/js/sidemenu.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Custom scroll bar Js-->\n");
      out.write("\t<script src=\"assets/plugins/customscroll/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- peitychart -->\n");
      out.write("\t<script src=\"assets/plugins/peitychart/jquery.peity.min.js\"></script>\n");
      out.write("\t<script src=\"assets/plugins/peitychart/peitychart.init.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Vector Plugin -->\n");
      out.write("\t<script src=\"assets/plugins/jvectormap/jquery-jvectormap-2.0.2.min.js\"></script>\n");
      out.write("\t<script src=\"assets/plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("\t<script src=\"assets/plugins/jvectormap/gdp-data.js\"></script>\n");
      out.write("\t<script src=\"assets/plugins/jvectormap/jquery-jvectormap-us-aea-en.js\"></script>\n");
      out.write("\t<script src=\"assets/plugins/jvectormap/jquery-jvectormap-uk-mill-en.js\"></script>\n");
      out.write("\t<script src=\"assets/plugins/jvectormap/jquery-jvectormap-au-mill.js\"></script>\n");
      out.write("\t<script src=\"assets/plugins/jvectormap/jquery-jvectormap-ca-lcc.js\"></script>\n");
      out.write("\t<script src=\"assets/js/dashboard2map.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Ansta JS -->\n");
      out.write("\t<script src=\"assets/js/custom.js\"></script>\n");
      out.write("\t<script src=\"assets/js/dashboard-sales.js\"></script>\n");
      out.write("\n");
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
