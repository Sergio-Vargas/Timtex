package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.PrendaDAO;
import ModeloVO.PrendaVO;
import ModeloVO.UsuarioVO;

public final class Cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Estilos/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");



      out.write("\n");
      out.write("  \n");

   HttpSession buscarSesion =(HttpSession)request.getSession();
   String usuario ="";
    if(buscarSesion.getAttribute("datosUsuario")==null){
    
         request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
    else{
    UsuarioVO usuVO=(UsuarioVO)buscarSesion.getAttribute("datosUsuario");
    usuario =usuVO.getNombreUsuario();
    
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sesiones</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div style=\"float:right;\">\n");
      out.write("        <h1 style=\"color:gray;\">Bienvenido:");
      out.print(usuario);
      out.write("</h1>\n");
      out.write("        <form method=\"post\" action=\"Sesiones\">\n");
      out.write("            <input type=\"submit\" value=\"Cerrar Sesion\">\n");
      out.write("        </form><br><br>\n");
      out.write("        <div><br><br>\n");
      out.write("            <div>\n");
      out.write("                \n");
      out.write("            </div><br><br>\n");
      out.write("            <div>\n");
      out.write("                \n");
      out.write("            </div><br><br>\n");
      out.write("            </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <h1>Cliente</h1>\n");
      out.write("         ");

                    PrendaVO PreVO = new PrendaVO();
                    PrendaDAO PreDAO = new PrendaDAO();
                    ArrayList<PrendaVO> listaPrenda = PreDAO.listar();
                    for (int i = 0; i < listaPrenda.size(); i++) {

                    PreVO = listaPrenda.get(i);
                
      out.write("\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t<div style=\"border:2px red solid;\" class=\"productinfo text-center\">\n");
      out.write("\t\t\t<img src=\"PreVO.getImagenPrenda()\"  alt=\"\">\n");
      out.write("                        <h2>");
      out.print(PreVO.getNombrePrenda());
      out.write("</h2>\n");
      out.write("\t\t\t<p>");
      out.print(PreVO.getDescripcionPrenda());
      out.write("</p>\n");
      out.write("                        <form>\n");
      out.write("                        </form>\n");
      out.write("\t\t\t<form method=\"post\" action=\"Prenda\">\n");
      out.write("                        <input type=\"hidden\" name=\"textIdPrenda\" value=\"");
      out.print(PreVO.getIdPrenda());
      out.write("\">\n");
      out.write("                        <button class=\"btn btn-default add-to-cart\">Ver detalles</button>\n");
      out.write("                        <input type=\"hidden\" value=\"4\" name=\"opcion\">\n");
      out.write("                        </form>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>    \n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"JS/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"JS/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"JS/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"JS/dataTables.bootstrap.min.js\" type=\"text/javascript\"></script>\n");
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
