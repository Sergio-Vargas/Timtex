package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.ProcesoDAO;
import ModeloVO.ProcesoVO;
import ModeloVO.AsigOrdenVO;
import ModeloDAO.AsigOrdenDAO;

public final class consultarProceso_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/registrarProceso.jsp");
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
      out.write("        <title>Proceso</title>\n");
      out.write("        <link href=\"Estilos/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Estilos/dataTables.bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("\t\n");
      out.write(".estilotabla{\n");
      out.write("\twidth: 1000px;\n");
      out.write("\tborder-radius: 8px;\n");
      out.write("\tpadding:10px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tbox-shadow: 0px 0px 10px 1px gray;\n");
      out.write("\theight:auto;\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 800px) { \n");
      out.write("\t.Ctabla{\n");
      out.write("\twidth:470px;\n");
      out.write("\tborder-radius: 8px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tbox-shadow: 0px 0px 10px 1px gray;\n");
      out.write("\theight:620px;\n");
      out.write("}\n");
      out.write("} \n");
      out.write("</style>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Lista de Procesos</h1>\n");
      out.write("         <!-- Button trigger modal -->\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n");
      out.write("          Nuevo Proceso\n");
      out.write("        </button>\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Registrar Proceso</h5>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                      <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar proceso</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Registrar Proceso</h1>\n");
      out.write("         <form method=\"post\" action=\"Proceso\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        <input type=\"hidden\" name=\"textIdProceso\"><br><br>\n");
      out.write("                        Descripci??n proceso<br>\n");
      out.write("                        <input type=\"text\" name=\"textDescripcion\"><br><br>\n");
      out.write("                        Fecha proceso<br>\n");
      out.write("                        <input type=\"date\" name=\"textFecha\"><br><br>\n");
      out.write("                        Hora inicio<br>\n");
      out.write("                        <input type=\"time\" name=\"textHorai\"><br><br>\n");
      out.write("                        Hora fin<br>\n");
      out.write("                        <input type=\"time\" name=\"textHoraf\"><br><br>\n");
      out.write("                        Prendas realizadas<br>\n");
      out.write("                        <input type=\"text\" name=\"textPrendasr\"><br><br>\n");
      out.write("                        Estado Proceso<br>\n");
      out.write("                        <select name=\"textEstado\">\n");
      out.write("                        <option>Seleccione...</option>\n");
      out.write("                        <option value=\"Activo\">Activo</option>\n");
      out.write("                        </select><br>\n");
      out.write("                        Id Asignaci??n<br>\n");
      out.write("                        <select name=\"textAsig\">\n");
      out.write("                        <option>Seleccione...</option>\n");
      out.write("                        ");

                        AsigOrdenDAO AsigDAO = new AsigOrdenDAO();    
                        for (AsigOrdenVO AsigVO : AsigDAO.listar()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(AsigVO.getIdAsigOrden());
      out.write('"');
      out.write('>');
      out.print(AsigVO.getIdAsigOrden());
      out.write("</option>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        </select><br>\n");
      out.write("                        \n");
      out.write("                        <td></td>\n");
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
      out.write("</html>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                  <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a href=\"inactivoProceso.jsp\"><button class=\"btn btn-primary\">Inactivos</button></a>\n");
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
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"estilotabla Ctabla\"><br>\n");
      out.write("            <table class=\"table display AllDataTables table-striped \">\n");
      out.write("                <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID PROCESO</th>\n");
      out.write("                    <th>DESCRIPCI??N PROCESO</th>\n");
      out.write("                    <th>FECHA PROCESO</th>\n");
      out.write("                    <th>HORA INICIO</th>\n");
      out.write("                    <th>HORA FIN</th>\n");
      out.write("                    <th>PRENDAS REALIZADAS</th>\n");
      out.write("                    <th>ESTADO PROCESO</th>\n");
      out.write("                    <th>ID ASIG ORDEN FK</th>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th>ACCI??N</th>\n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                ");

                    ProcesoVO ProVO = new ProcesoVO();
                    ProcesoDAO ProDAO = new ProcesoDAO();
                    ArrayList<ProcesoVO> listaProceso = ProDAO.listar();
                    for (int i = 0; i < listaProceso.size(); i++) {

                    ProVO = listaProceso.get(i);
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(ProVO.getIdProceso());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ProVO.getDescripcionProceso());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ProVO.getFechaProceso());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ProVO. getHoraInicio());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ProVO.getHoraFin());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ProVO.getPrendasRealizadas());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ProVO.getEstadoProceso());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ProVO.getIdAsigOrdenFK());
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <form>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                    <form method=\"post\" action=\"Proceso\">\n");
      out.write("                    <input type=\"hidden\" name=\"textIdProceso\" value=\"");
      out.print(ProVO.getIdProceso());
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
      out.write("                <tr>\n");
      out.write("                  <th>ID PROCESO</th>\n");
      out.write("                    <th>DESCRIPCI??N PROCESO</th>\n");
      out.write("                    <th>FECHA PROCESO</th>\n");
      out.write("                    <th>HORA INICIO</th>\n");
      out.write("                    <th>HORA FIN</th>\n");
      out.write("                    <th>PRENDAS REALIZADAS</th>\n");
      out.write("                    <th>ESTADO PROCESO</th>\n");
      out.write("                    <th>ID ASIG ORDEN FK</th>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th>ACCI??N</th>\n");
      out.write("                </tr>    \n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <form method=\"post\" action=\"GenerarPDF.jsp\" target=\"_blank\">\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Generar Reporte\">\n");
      out.write("            <input type=\"hidden\" value=\"ReporteProcesos.jasper\" name=\"nombreReporte\">\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("                \n");
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
