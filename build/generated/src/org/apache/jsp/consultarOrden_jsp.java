package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.OrdenDAO;
import ModeloVO.OrdenVO;
import ModeloVO.UsuarioVO;
import ModeloVO.DetalleOrdenVO;
import java.util.ArrayList;
import ModeloVO.PrendaVO;
import ModeloDAO.PrendaDAO;
import ModeloVO.DatosPersonalesVO;
import ModeloDAO.DatosPersonalesDAO;

public final class consultarOrden_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Sesiones.jsp");
    _jspx_dependants.add("/registrarOrden.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Timtex</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"Start your development with a Dashboard for Bootstrap 4.\" name=\"description\">\r\n");
      out.write("        <meta content=\"Spruko\" name=\"author\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link href=\"assets/img/brand/favicon.png\" rel=\"icon\" type=\"image/png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Fonts -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Icons -->\r\n");
      out.write("        <link href=\"assets/css/icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!--Bootstrap.min css-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Ansta CSS -->\r\n");
      out.write("        <link href=\"assets/css/dashboard.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Tabs CSS -->\r\n");
      out.write("        <link href=\"assets/plugins/tabs/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- jvectormap CSS -->\r\n");
      out.write("        <link href=\"assets/plugins/jvectormap/jquery-jvectormap-2.0.2.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom scroll bar css-->\r\n");
      out.write("        <link href=\"assets/plugins/customscroll/jquery.mCustomScrollbar.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Sidemenu Css -->\r\n");
      out.write("        <link href=\"assets/plugins/toggle-sidebar/css/sidemenu.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    ");
    UsuarioVO usuVO = new UsuarioVO();
        usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
    
      out.write("\r\n");
      out.write("    <body class=\"app sidebar-mini rtl\" >\r\n");
      out.write("        <div id=\"global-loader\" ></div>\r\n");
      out.write("        <div class=\"page\">\r\n");
      out.write("            <div class=\"page-main\">\r\n");
      out.write("                <!-- Sidebar menu-->\r\n");
      out.write("                <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\r\n");
      out.write("                <aside class=\"app-sidebar \">\r\n");
      out.write("                    <div class=\"sidebar-img\">\r\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\"><img alt=\"...\" class=\"navbar-brand-img main-logo\" src=\"assets/img/brand/logo-dark.png\"> <img alt=\"...\" class=\"navbar-brand-img logo\" src=\"assets/img/brand/favicon.png\"></a>\r\n");
      out.write("\r\n");
      out.write("                        <a class=\"side-menu__item active\" data-toggle=\"slide\" href=\"#\"><i class=\"side-menu__icon fe fe-home\"></i><span class=\"side-menu__label\">Inicio</span></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"side-menu\">\r\n");
      out.write("                            ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("1")||rol.equals("3")) {

    
      out.write("\r\n");
      out.write("                            <li class=\"slide\">\r\n");
      out.write("                                <a class=\"side-menu__item\" data-toggle=\"slide\" href=\"#\"><i class=\"side-menu__icon fe fe-grid\"></i><span class=\"side-menu__label\">Ordenes</span><i class=\"angle fa fa-angle-right\"></i></a>\r\n");
      out.write("                                <ul class=\"slide-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"consultarOrden.jsp\" class=\"slide-item\">Consultar Ordenes</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("     \r\n");
      out.write("                                </ul>\r\n");
      out.write("                               \r\n");
      out.write("                            </li>");
}
      out.write("\r\n");
      out.write("                                        ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("1")) {

    
      out.write("\r\n");
      out.write("                            <li class=\"slide\">\r\n");
      out.write("                                <a class=\"side-menu__item\" data-toggle=\"slide\" href=\"#\"><i class=\"side-menu__icon fe fe-grid\"></i><span class=\"side-menu__label\">Procesos</span><i class=\"angle fa fa-angle-right\"></i></a>\r\n");
      out.write("                               <ul class=\"slide-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"consultarProceso.jsp\" class=\"slide-item\">Consultar Procesos</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("     \r\n");
      out.write("                                </ul>\r\n");
      out.write("                               \r\n");
      out.write("                            </li>");
}
      out.write("\r\n");
      out.write("                                               ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("1")) {

    
      out.write("\r\n");
      out.write("                              <li class=\"slide\">\r\n");
      out.write("                                <a class=\"side-menu__item\" data-toggle=\"slide\" href=\"#\"><i class=\"side-menu__icon fe fe-grid\"></i><span class=\"side-menu__label\">Empleado</span><i class=\"angle fa fa-angle-right\"></i></a>\r\n");
      out.write("                               <ul class=\"slide-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"cards.html\" class=\"slide-item\">Consultar Empleados</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"registrarEmpleado.jsp\" class=\"slide-item\">Registrar Empleados</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("     \r\n");
      out.write("                                </ul>\r\n");
      out.write("                               \r\n");
      out.write("                            </li>");
}
      out.write("\r\n");
      out.write("                                               ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("1")) {

    
      out.write("\r\n");
      out.write("                            <li class=\"slide\">\r\n");
      out.write("                                <a class=\"side-menu__item\" data-toggle=\"slide\" href=\"#\"><i class=\"side-menu__icon fe fe-grid\"></i><span class=\"side-menu__label\">Usuario</span><i class=\"angle fa fa-angle-right\"></i></a>\r\n");
      out.write("                               <ul class=\"slide-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"consultarDatosPersonales.jsp\" class=\"slide-item\">Consultar Datos</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"consultarUsuarios.jsp\" class=\"slide-item\">Consultar Usuario</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                               \r\n");
      out.write("                            </li>");
}
      out.write("\r\n");
      out.write("                                               ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("1")) {

    
      out.write("\r\n");
      out.write("                             <li class=\"slide\">\r\n");
      out.write("                                <a class=\"side-menu__item\" data-toggle=\"slide\" href=\"#\"><i class=\"side-menu__icon fe fe-grid\"></i><span class=\"side-menu__label\">Reportes</span><i class=\"angle fa fa-angle-right\"></i></a>\r\n");
      out.write("                               <ul class=\"slide-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"Reportes.jsp\" class=\"slide-item\">Consultar Reportes</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("     \r\n");
      out.write("                                </ul>\r\n");
      out.write("                               \r\n");
      out.write("                            </li>");
}
      out.write("\r\n");
      out.write("                                        ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("2")) {

    
      out.write("\r\n");
      out.write("                             <li class=\"slide\">\r\n");
      out.write("                                <a class=\"side-menu__item\" data-toggle=\"slide\" href=\"#\"><i class=\"side-menu__icon fe fe-grid\"></i><span class=\"side-menu__label\">Ordenes</span><i class=\"angle fa fa-angle-right\"></i></a>\r\n");
      out.write("                                <ul class=\"slide-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"cards.html\" class=\"slide-item\">Consultar Ordenes</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    \r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                                                      ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("3")) {

    
      out.write("\r\n");
      out.write("             <li class=\"slide\">\r\n");
      out.write("                                <a class=\"side-menu__item\" data-toggle=\"slide\" href=\"#\"><i class=\"side-menu__icon fe fe-grid\"></i><span class=\"side-menu__label\">Registrar Proceso</span><i class=\"angle fa fa-angle-right\"></i></a>\r\n");
      out.write("                                <ul class=\"slide-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"registrarProceso.jsp\" class=\"slide-item\">Registrar Proceso</a>\r\n");
      out.write("                                        <a href=\"consultarProceso.jsp\" class=\"slide-item\">Consultar Proceso</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    \r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>                \r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                                  \r\n");
      out.write("                                                      ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("3")) {

    
      out.write("\r\n");
      out.write("             <li class=\"slide\">\r\n");
      out.write("                                <a class=\"side-menu__item\" data-toggle=\"slide\" href=\"#\"><i class=\"side-menu__icon fe fe-grid\"></i><span class=\"side-menu__label\">Asignar Orden</span><i class=\"angle fa fa-angle-right\"></i></a>\r\n");
      out.write("                                <ul class=\"slide-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"registrarAsignar.jsp\" class=\"slide-item\">Asignar Orden</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    \r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>                \r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"side-menu__item\" href=\"https://themeforest.net/user/sprukosoft/portfolio\"><i class=\"side-menu__icon fa fa-question-circle\"></i><span class=\"side-menu__label\">Ayuda y Soporte</span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </aside>\r\n");
      out.write("                <!-- Sidebar menu-->\r\n");
      out.write("\r\n");
      out.write("                <!-- app-content-->\r\n");
      out.write("                <div class=\"app-content \">\r\n");
      out.write("                    <div class=\"side-app\">\r\n");
      out.write("                        <div class=\"main-content\">\r\n");
      out.write("                           \r\n");
      out.write("                            <!-- Top navbar -->\r\n");
      out.write("                            <nav class=\"navbar navbar-top  navbar-expand-md navbar-dark\" id=\"navbar-main\">\r\n");
      out.write("                                <div class=\"container-fluid\">\r\n");
      out.write("                                    <a aria-label=\"Hide Sidebar\" class=\"app-sidebar__toggle\" data-toggle=\"sidebar\" href=\"#\"></a>\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Horizontal Navbar -->\r\n");
      out.write("                                    <ul class=\"navbar-nav align-items-center d-none d-xl-block\">\r\n");
      out.write("                   ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("1")) {

    
      out.write("\r\n");
      out.write("                                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                                            Administrador\r\n");
      out.write("                                        </li>\r\n");
}
      out.write("\r\n");
      out.write("         ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("2")) {

    
      out.write("\r\n");
      out.write("                                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                                            Cliente\r\n");
      out.write("                                        </li>\r\n");
}
      out.write("\r\n");
      out.write("         ");
    

        rol = usuVO.getIdCargoFK();
        if (rol.equals("3")) {

    
      out.write("\r\n");
      out.write("                                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                                            Empleado\r\n");
      out.write("                                        </li>\r\n");
}
      out.write("\r\n");
      out.write("                                      \r\n");
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Brand -->\r\n");
      out.write("                                    <a class=\"navbar-brand pt-0 d-md-none\" href=\"#\">\r\n");
      out.write("                                        <img src=\"assets/img/brand/logo-dark.png\" class=\"navbar-brand-img\" alt=\"...\">\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <!-- Form -->\r\n");
      out.write("                                    <form class=\"navbar-search navbar-search-dark form-inline mr-3 ml-lg-auto\">\r\n");
      out.write("                                        <div class=\"form-group mb-0\">\r\n");
      out.write("                                            <div class=\"input-group input-group-alternative\">\r\n");
      out.write("                                                <div class=\"input-group-prepend\">\r\n");
      out.write("                                                    \r\n");
      out.write("                                                </div><input class=\"form-control\" type=\"hidden\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    <!-- User -->\r\n");
      out.write("                                    <ul class=\"navbar-nav align-items-center \">\r\n");
      out.write("                                        <li class=\"nav-item d-none d-md-flex\">\r\n");
      out.write("                                            <div class=\"dropdown d-none d-md-flex mt-2 \">\r\n");
      out.write("                                                <a class=\"nav-link full-screen-link pl-0 pr-0\"><i class=\"fe fe-maximize-2 floating \" id=\"fullscreen-button\"></i></a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item dropdown d-none d-md-flex\">\r\n");
      out.write("                                            <a aria-expanded=\"false\" aria-haspopup=\"true\" class=\"nav-link pr-0\" data-toggle=\"dropdown\" href=\"#\" role=\"button\">\r\n");
      out.write("                                                <div class=\"media align-items-center\">\r\n");
      out.write("                                                    <i class=\"fe fe-user \"></i>\r\n");
      out.write("                                                </div></a>\r\n");
      out.write("                                            <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-arrow dropdown-menu-right\">\r\n");
      out.write("                                                <a class=\"dropdown-item d-flex\" href=\"#\">\r\n");
      out.write("                                                    <span class=\"avatar brround mr-3 align-self-center\"> <img src=\"assets/img/faces/male/4.jpg\" alt=\"imag\" ></span>\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <strong>Madeleine Scott</strong> te mando una solicitud\r\n");
      out.write("                                                        <div class=\" mt-2 small text-muted\">\r\n");
      out.write("                                                            <span class=\"btn btn-sm btn-primary\">Confirmar</span>\r\n");
      out.write("                                                            <span class=\"btn btn-sm btn-outline-primary\">Eliminar</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <a class=\"dropdown-item d-flex\" href=\"#\">\r\n");
      out.write("                                                    <span class=\"avatar brround mr-3 align-self-center\"><img src=\"assets/img/faces/female/14.jpg\" alt=\"imag\" ></span>\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <strong>rebica</strong> te mando una solicitud\r\n");
      out.write("                                                        <div class=\" mt-2 small text-muted\">\r\n");
      out.write("                                                            <span class=\"btn btn-sm btn-primary\">Confirmar</span>\r\n");
      out.write("                                                            <span class=\"btn btn-sm btn-outline-primary\">Eliminar</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <a class=\"dropdown-item d-flex\" href=\"#\">\r\n");
      out.write("                                                    <span class=\"avatar brround mr-3 align-self-center\"><img src=\"assets/img/faces/male/1.jpg\" alt=\"imag\"></span>\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <strong>Devid robott</strong> te mando una solicitud\r\n");
      out.write("                                                        <div class=\" mt-2 small text-muted\">\r\n");
      out.write("                                                            <span class=\"btn btn-sm btn-primary\">Confirmar</span>\r\n");
      out.write("                                                            <span class=\"btn btn-sm btn-outline-primary\">Eliminar</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <div class=\"dropdown-divider\"></div><a class=\"dropdown-item text-center text-muted-dark\" href=\"#\">Ver todas las solicitudes</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                        <li class=\"nav-item dropdown d-none d-md-flex\">\r\n");
      out.write("                                            <a aria-expanded=\"false\" aria-haspopup=\"true\" class=\"nav-link pr-0\" data-toggle=\"dropdown\" href=\"#\" role=\"button\">\r\n");
      out.write("                                                <div class=\"media align-items-center\">\r\n");
      out.write("                                                    <i class=\"fe fe-mail \"></i>\r\n");
      out.write("                                                </div></a>\r\n");
      out.write("                                            <div class=\"dropdown-menu  dropdown-menu-lg dropdown-menu-arrow dropdown-menu-right\">\r\n");
      out.write("                                                <a href=\"#\" class=\"dropdown-item text-center\">12 Nuevos Mensajes</a>\r\n");
      out.write("                                                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                                <a href=\"#\" class=\"dropdown-item d-flex\">\r\n");
      out.write("                                                    <span class=\"avatar brround mr-3 align-self-center\"><img src=\"assets/img/faces/male/41.jpg\" alt=\"img\"></span>\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <strong>Madeleine</strong> ¡Hola! Estoy disponible\r\n");
      out.write("                                                        <div class=\"small text-muted\">Hace 3 horas</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <a href=\"#\" class=\"dropdown-item d-flex\">\r\n");
      out.write("                                                    <span class=\"avatar brround mr-3 align-self-center\"><img src=\"assets/img/faces/female/1.jpg\" alt=\"img\" ></span>\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <strong>Anthony</strong> Nuevo producto publicando...\r\n");
      out.write("                                                        <div class=\"small text-muted\">Hace 5 horas</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                                <a href=\"#\" class=\"dropdown-item text-center\">Ver todos los mensajes</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item dropdown d-none d-md-flex\">\r\n");
      out.write("                                            <a aria-expanded=\"false\" aria-haspopup=\"true\" class=\"nav-link pr-0\" data-toggle=\"dropdown\" href=\"#\" role=\"button\">\r\n");
      out.write("                                                <div class=\"media align-items-center\">\r\n");
      out.write("                                                    <i class=\"fe fe-bell f-30 \"></i>\r\n");
      out.write("                                                </div></a>\r\n");
      out.write("                                            <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-arrow dropdown-menu-right\">\r\n");
      out.write("                                                <a href=\"#\" class=\"dropdown-item d-flex\">\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <strong>Alguien le dio link a tus publicaciones</strong>\r\n");
      out.write("                                                        <div class=\"small text-muted\">Hace 3 horas</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <a href=\"#\" class=\"dropdown-item d-flex\">\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <strong> 3 Nuevos comentarios</strong>\r\n");
      out.write("                                                        <div class=\"small text-muted\">Hace 5 horas</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <a href=\"#\" class=\"dropdown-item d-flex\">\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <strong> Servidor reseteado</strong>\r\n");
      out.write("                                                        <div class=\"small text-muted\">Hace 45 minutos</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                                <a href=\"#\" class=\"dropdown-item text-center\">Ver todas las notificaciones</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                                            <a aria-expanded=\"false\" aria-haspopup=\"true\" class=\"nav-link pr-md-0\" data-toggle=\"dropdown\" href=\"#\" role=\"button\">\r\n");
      out.write("                                                <div class=\"media align-items-center\">\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"media-body ml-5 d-none d-lg-block\">\r\n");
      out.write("                                                        <h3 class=\"mb-0\">");
      out.print(usuario);
      out.write("</h3>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div></a>\r\n");
      out.write("                                            <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\">\r\n");
      out.write("                                                <div class=\" dropdown-header noti-title\">\r\n");
      out.write("                                                    <h6 class=\"text-overflow m-6\">¡Bienvenid@!</h6>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                               <input class=\"dropdown-item\" type=\"submit\" value=\"Perfil\">\r\n");
      out.write("                                                <form method=\"post\" action=\"Sesiones\">\r\n");
      out.write("                                                    <input class=\"dropdown-item\" type=\"submit\" value=\"Cerrar Sesion\">\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                                <input type=\"hidden\" value=\"");
      out.print(id);
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </nav>\r\n");
      out.write("                            \r\n");
      out.write("                                      \r\n");
      out.write("                                </body>\r\n");
      out.write("                                </html> \r\n");
      out.write("                                       <!-- Ansta Scripts -->\r\n");
      out.write("                                <!-- Core -->\r\n");
      out.write("                                <script src=\"assets/plugins/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("                                <script src=\"assets/js/popper.js\"></script>\r\n");
      out.write("         \r\n");
      out.write("                                <!-- Echarts JS -->\r\n");
      out.write("                                <script src=\"assets/plugins/chart-echarts/echarts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Fullside-menu Js-->\r\n");
      out.write("                                <script src=\"assets/plugins/toggle-sidebar/js/sidemenu.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Custom scroll bar Js-->\r\n");
      out.write("                                <script src=\"assets/plugins/customscroll/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                                <!-- peitychart -->\r\n");
      out.write("                                <script src=\"assets/plugins/peitychart/jquery.peity.min.js\"></script>\r\n");
      out.write("                                <script src=\"assets/plugins/peitychart/peitychart.init.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Vector Plugin -->\r\n");
      out.write("                                <script src=\"assets/plugins/jvectormap/jquery-jvectormap-2.0.2.min.js\"></script>\r\n");
      out.write("                                <script src=\"assets/plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("                                <script src=\"assets/plugins/jvectormap/gdp-data.js\"></script>\r\n");
      out.write("                                <script src=\"assets/plugins/jvectormap/jquery-jvectormap-us-aea-en.js\"></script>\r\n");
      out.write("                                <script src=\"assets/plugins/jvectormap/jquery-jvectormap-uk-mill-en.js\"></script>\r\n");
      out.write("                                <script src=\"assets/plugins/jvectormap/jquery-jvectormap-au-mill.js\"></script>\r\n");
      out.write("                                <script src=\"assets/plugins/jvectormap/jquery-jvectormap-ca-lcc.js\"></script>\r\n");
      out.write("                                <script src=\"assets/js/dashboard2map.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Ansta JS -->\r\n");
      out.write("                                <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("                                <script src=\"assets/js/dashboard-sales.js\"></script>                          \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                   \r\n");
      out.write("        \r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Orden</title>\r\n");
      out.write("    </head>\r\n");
      out.write("   \r\n");
      out.write("    <body>\r\n");
      out.write("    <center>\r\n");
      out.write("        <div class=\"container-fluid pt-8\">\r\n");
      out.write("        <div class=\"page-header mt-0 shadow p-3\">\r\n");
      out.write("                                    <ol class=\"breadcrumb mb-sm-0\">\r\n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"Usuario.jsp\">Inicio</a></li>\r\n");
      out.write("                                        <li class=\"breadcrumb-item active\" aria-current=\"page\">Ordenes</li>\r\n");
      out.write("                                    </ol>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("          \r\n");
      out.write("         <!-- Button trigger modal -->\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\r\n");
      out.write("          Nueva orden\r\n");
      out.write("        </button>\r\n");
      out.write("        <!-- Modal -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Lista de ordenes</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                      <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Registrar Orden</title>\r\n");
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
      out.write("    <center>\r\n");
      out.write("        <form method=\"post\" action=\"Orden\" id=\"basic-form\" class=\"my-login-validation\"  novalidate=\"\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"card shadow\">\r\n");
      out.write("                        <div class=\"card-header\">\r\n");
      out.write("                            <h2 class=\"mb-0\">Registrar Orden</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"textOrden\">\r\n");
      out.write("                                    <div class=\"form-group\">  \r\n");
      out.write("                                        Fecha Orden\r\n");
      out.write("                                        <input type=\"date\" name=\"textFecha\" class=\"form-control\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div> \r\n");
      out.write("                               \r\n");
      out.write("                                        <input type=\"hidden\" name=\"textEstado\" class=\"form-control\" required value=\"Activo\">\r\n");
      out.write("                                   \r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"col-md-12\">\r\n");
      out.write("                                    <div class=\"form-group\">  \r\n");
      out.write("                                        Id Datos\r\n");
      out.write("                                        <select name=\"textIdDato\" class=\"form-control\" required>\r\n");
      out.write("                                            <option></option>\r\n");
      out.write("                                            ");

                                                DatosPersonalesDAO datDAO = new DatosPersonalesDAO();
                                                for (DatosPersonalesVO datVO : datDAO.listar()) {
                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(datVO.getIdDatos());
      out.write('"');
      out.write('>');
      out.print(datVO.getNombreDatos());
      out.write("</option>\r\n");
      out.write("                                            ");
 }
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        </div></div>\r\n");
      out.write("                                <div class=\" col-md-6\">\r\n");
      out.write("                                    <center>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary mb-0 btn-block waves-effect waves-light\">Registrar</button>\r\n");
      out.write("                                    </center>\r\n");
      out.write("                                </div>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>    \r\n");
      out.write("                    </div>          \r\n");
      out.write("                </div>    \r\n");
      out.write("            </div>       \r\n");
      out.write("            <input type=\"hidden\"  value=\"1\" name=\"opcion\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"color: red;\">\r\n");
      out.write("                ");

                if (request.getAttribute("MensajeError") != null) { 
      out.write("\r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("     \r\n");
      out.write("\r\n");
      out.write("                ");
} else {
      out.write("\r\n");
      out.write("                <div style=\"color: greenyellow\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("                ");
  }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("    </center>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery.prettyPhoto.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery.scrollUp.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"assets/js/main.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"JS/carrito.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("        <script src=\"assets/plugins/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- validacion de formularios -->\r\n");
      out.write("        <script src=\"JS/my-login.js\"></script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                  <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a href=\"inactivoOrden.jsp\"><button class=\"btn btn-primary\">Inactivos</button></a>\r\n");
      out.write("        <div style=\"color: red;\">\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("    </center>             \r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <div class=\"card shadow\">\r\n");
      out.write("                <div class=\"card-header\">\r\n");
      out.write("                    <h2 class=\"mb-0\">Lista de Ordenes</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <div class=\"table-responsive\">\r\n");
      out.write("                        <table id=\"example\" class=\"table table-striped table-bordered w-100 text-nowrap\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("\r\n");
      out.write("                                 <th>ID ORDEN</th>\r\n");
      out.write("                    <th>FECHA ORDEN</th>\r\n");
      out.write("                    <th>ESTADO ORDEN</th>\r\n");
      out.write("                    <th>ID DATOS FK</th>\r\n");
      out.write("                    <th></th>\r\n");
      out.write("                    <th>ACCIÓN</th>\r\n");
      out.write("\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                          ");

                    OrdenVO OrdeVO = new OrdenVO();
                    OrdenDAO OrdeDAO = new OrdenDAO();
                    ArrayList<OrdenVO> listaOrden = OrdeDAO.listar();
                    for (int i = 0; i < listaOrden.size(); i++) {

                    OrdeVO = listaOrden.get(i);
                
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                 <td>");
      out.print(OrdeVO.getIdOrden());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(OrdeVO.getFechaOrden());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(OrdeVO.getEstadoOrden());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(OrdeVO.getIdDatosFK());
      out.write("</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <form action=\"\">    \r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                       <form method=\"post\" action=\"Orden\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"textOrden\" value=\"");
      out.print(OrdeVO.getIdOrden());
      out.write("\">\r\n");
      out.write("                    <button class=\"btn btn-primary\">Editar</button>\r\n");
      out.write("                    <input type=\"hidden\" value=\"3\" name=\"opcion\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("                                ");
 }
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("        </div></div></div>\r\n");
      out.write(" \r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"row align-items-center justify-content-xl-between\">\n");
      out.write("            <div class=\"col-xl-6\">\n");
      out.write("                <div class=\"copyright text-center text-xl-left text-muted\">\n");
      out.write("                    <p class=\"text-sm font-weight-500\">Copyright 2021 © Todos los derechos reservados.Timtex</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <!-- Footer -->\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- app-content-->\n");
      out.write("<!-- app-content-->\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- Back to top -->\n");
      out.write("<a href=\"#top\" id=\"back-to-top\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("</html>\n");
      out.write("\t         \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("  <!-- Core -->\r\n");
      out.write("          \r\n");
      out.write("            <!-- Optional JS -->\r\n");
      out.write("            <script src=\"assets/plugins/chart.js/dist/Chart.min.js\"></script>\r\n");
      out.write("            <script src=\"assets/plugins/chart.js/dist/Chart.extension.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Data tables -->\r\n");
      out.write("            <script src=\"assets/plugins/datatable/jquery.dataTables.min.js\"></script>\r\n");
      out.write("            <script src=\"assets/plugins/datatable/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Fullside-menu Js-->\r\n");
      out.write("            <script src=\"assets/plugins/toggle-sidebar/js/sidemenu.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Custom scroll bar Js-->\r\n");
      out.write("            <script src=\"assets/plugins/customscroll/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Ansta JS -->\r\n");
      out.write("            <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("            <script>\r\n");
      out.write("                $(function (e) {\r\n");
      out.write("                    $('#example').DataTable();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    $('#example2').DataTable({\r\n");
      out.write("                        \"scrollY\": \"200px\",\r\n");
      out.write("                        \"scrollCollapse\": true,\r\n");
      out.write("                        \"paging\": false\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            </script>\r\n");
      out.write("    </body>\r\n");
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
