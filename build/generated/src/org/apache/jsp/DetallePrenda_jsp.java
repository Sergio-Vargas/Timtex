package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.PrendaDAO;
import ModeloVO.PrendaVO;

public final class DetallePrenda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

                    PrendaVO PreVO = new PrendaVO();
                    PrendaDAO PreDAO = new PrendaDAO();
                    ArrayList<PrendaVO> listaPrenda = PreDAO.listar();
                    for (int i = 0; i < listaPrenda.size(); i++) {

                    PreVO = listaPrenda.get(i);
                
      out.write("\n");
      out.write("       <div class=\"col-sm-9 padding-right\">\n");
      out.write("\t\t\t\t\t<div class=\"product-details\"><!--product-details-->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"view-product\">\n");
      out.write("                                                            <img src=\"");
      out.print(PreVO.getImagenPrenda());
      out.write("\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<h3>ZOOM</h3>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                        <div id=\"similar-product\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t<!-- Wrapper for slides -->\n");
      out.write("\t\t\t\t\t\t\t\t   \n");
      out.write("\n");
      out.write("\t\t\t<!-- Controls -->\n");
      out.write("\t\t\t<a class=\"left item-control\" href=\"#similar-product\" data-slide=\"prev\">\n");
      out.write("\t\t\t<i class=\"fa fa-angle-left\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<a class=\"right item-control\" href=\"#similar-product\" data-slide=\"next\">\n");
      out.write("\t\t\t<i class=\"fa fa-angle-right\"></i>\n");
      out.write("                        </a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\t\t\t<div class=\"col-sm-7\">\n");
      out.write("\t\t\t<div class=\"product-information\"><!--/product-information-->\n");
      out.write("                        <img src=\"images/product-details/new.jpg\" class=\"newarrival\" alt=\"\" />\n");
      out.write("\t\t\t<h2>");
      out.print(PreVO.getNombrePrenda());
      out.write("</h2>\n");
      out.write("\t\t\t<p>Web ID: ");
      out.print(PreVO.getDescripcionPrenda());
      out.write("</p>\n");
      out.write("                        <p>Web ID: ");
      out.print(PreVO.getIdPrenda());
      out.write("</p>\n");
      out.write("\t\t\t<img src=\"images/product-details/rating.png\" alt=\"\" />\n");
      out.write("                        <form action=\"agregarproducto\" method=\"post\">\n");
      out.write("                        <span>\n");
      out.write("\t\t\t<span>US </span>\n");
      out.write("\t\t\t<label>Quantity:</label>\n");
      out.write("                        <input type=\"hidden\" value=\"\" name=\"idproducto\">\n");
      out.write("                        <input type=\"text\" value=\"1\" id=\"txt-cantidad\" name=\"cantidad\"/>\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-fefault cart\">\n");
      out.write("\t\t\t<i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("\t\t\tAdd to cart\n");
      out.write("                    </button>\n");
      out.write("\t\t</span>\n");
      out.write("            </form>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("    </body>\n");
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
