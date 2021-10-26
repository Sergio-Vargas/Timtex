package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.DetalleOrdenDAO;
import ModeloVO.DetalleOrdenVO;
import ModeloVO.PrendaVO;
import ModeloDAO.PrendaDAO;
import ModeloVO.OrdenVO;
import ModeloDAO.OrdenDAO;

public final class consultarDetalleOrden_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/registrarDetalleOrden.jsp");
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
      out.write("        <title>Detalle Orden</title>\n");
      out.write("        <link href=\"Estilos/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Estilos/dataTables.bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("\t\n");
      out.write(".estilotabla{\n");
      out.write("\twidth: 1000px;\n");
      out.write("\tborder-radius: 8px;\n");
      out.write("\tpadding:20px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tbox-shadow: 0px 0px 10px 1px gray;\n");
      out.write("\theight:auto;\n");
      out.write("}\n");
      out.write(" @media screen and (max-width: 800px) { \n");
      out.write("\t.Ctabla{\n");
      out.write("\twidth:480px;\n");
      out.write("\tborder-radius: 8px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tbox-shadow: 0px 0px 10px 1px gray;\n");
      out.write("\theight:600px;\n");
      out.write("}\n");
      out.write("} \n");
      out.write("</style>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Lista de Detalles Orden</h1\n");
      out.write("         \n");
      out.write("         <!-- Button trigger modal -->\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n");
      out.write("          Nuevo Detalle Orden\n");
      out.write("        </button>\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Registrar Detalle</h5>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                      <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                     ");
      out.write("\n");
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
      out.write("        <title>Registrar Detalle</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Registrar Detalle</h1>\n");
      out.write("       <form method=\"post\" action=\"DetalleOrden\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Id Detalle Orden<br>\n");
      out.write("                        <input type=\"text\" name=\"textIdDetalleOrden\" ><br><br>\n");
      out.write("                        Cantidad Prenda<br>\n");
      out.write("                        <input type=\"text\" name=\"textCantidad\"><br><br>\n");
      out.write("                        Talla<br>\n");
      out.write("                        <input type=\"text\" name=\"textTalla\" ><br><br>\n");
      out.write("                         Id Orden FK<br>\n");
      out.write("                        <select name=\"textIdOrdenFK\">\n");
      out.write("                        <option>Seleccione...</option>\n");
      out.write("                        ");

                        OrdenDAO OrdeDAO = new OrdenDAO();    
                        for (OrdenVO OrdeVO : OrdeDAO.listar()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(OrdeVO.getIdOrden());
      out.write('"');
      out.write('>');
      out.print(OrdeVO.getIdOrden());
      out.write("</option>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        </select><br>\n");
      out.write("                        Id Prenda FK<br>\n");
      out.write("                         <select name=\"textIdPrendaFK\">\n");
      out.write("                        <option>Seleccione...</option>\n");
      out.write("                        ");

                        PrendaDAO preDAO = new PrendaDAO();    
                        for (PrendaVO preVO : preDAO.listar()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(preVO.getIdPrenda());
      out.write('"');
      out.write('>');
      out.print(preVO.getNombrePrenda());
      out.write("</option>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        </select><br>\n");
      out.write("                </th>\n");
      out.write("            </table>\n");
      out.write("            <button>Registar</button>\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("        </form><br><br>\n");
      out.write("        <div style=\"color: red;\">\n");
      out.write("            ");

                if (request.getAttribute("MensajeError") != null) { 
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("     \n");
      out.write("\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            <div style=\"color: greenyellow\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\n");
      out.write("            ");
  }
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("                  <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"color: red;\">\n");
      out.write("\n");
      out.write("            ");
if (request.getAttribute("MensajeError") != null) { 
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("     \n");
      out.write("\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            <div style=\"color: greenyellow\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\n");
      out.write("            ");
  }
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"estilotabla Ctabla\"><br>\n");
      out.write("            <table class=\"table display AllDataTables table-striped table-responsive\">\n");
      out.write("                <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID DETALLE ORDEN</th>\n");
      out.write("                    <th>CANTIDAD PRENDA</th>\n");
      out.write("                    <th>TALLA</th>\n");
      out.write("                    <th>ID ORDEN FK</th>\n");
      out.write("                    <th>ID PRENDA FK</th>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th>ACCIÓN</th>\n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                ");

                    DetalleOrdenVO DetaVO = new DetalleOrdenVO();
                    DetalleOrdenDAO DetaDAO = new DetalleOrdenDAO();
                    ArrayList<DetalleOrdenVO> listaDetalle = DetaDAO.listar();
                    for (int i = 0; i <listaDetalle.size(); i++) {
                    DetaVO =listaDetalle.get(i);
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(DetaVO.getIdDetalleOrden());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(DetaVO.getCantidadPrenda());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(DetaVO.getTalla());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(DetaVO.getIdOrdenFK());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(DetaVO.getIdPrendaFK());
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <form>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                    <form method=\"post\" action=\"DetalleOrden\">\n");
      out.write("                    <input type=\"hidden\" name=\"textIdDetalleOrden\" value=\"");
      out.print(DetaVO.getIdDetalleOrden());
      out.write("\">\n");
      out.write("                    <button class=\"btn btn-primary\">Editar</button>\n");
      out.write("                    <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("                    </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("               <tr>\n");
      out.write("                    <th>ID DETALLE ORDEN</th>\n");
      out.write("                    <th>CANTIDAD PRENDA</th>\n");
      out.write("                    <th>TALLA</th>\n");
      out.write("                    <th>ID ORDEN FK</th>\n");
      out.write("                    <th>ID PRENDA FK</th>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th>ACCIÓN</th>\n");
      out.write("                </tr>   \n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    <script src=\"JS/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"JS/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"JS/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"JS/dataTables.bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script>\n");
      out.write("\t\t  $(document).ready( function () {\n");
      out.write("\t\t    $('.AllDataTables').DataTable({\n");
      out.write("\t\t\t\t\"deferRender\":true,\n");
      out.write("\t\t\t\t\"scroller\":true,\n");
      out.write("\t\t\t\t\"aScrollX\":\"100%\",\n");
      out.write("\t\t\t    \"sScrollY\":\"300px\",\n");
      out.write("\t\t\t    \"bScrollCollapse\":true\n");
      out.write("\t\t    });\n");
      out.write("\t\t} );\n");
      out.write("              \n");
      out.write("\t</script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
