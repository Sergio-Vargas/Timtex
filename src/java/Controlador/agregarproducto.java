/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import ModeloVO.DetalleOrdenVO;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sergio saenz
 */
@WebServlet(name = "agregarproducto", urlPatterns = {"/agregarproducto"})
public class agregarproducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        String IdDetalle =request.getParameter("textIdDetalle");
        String cantidad =request.getParameter("textCantidad");
        String talla=request.getParameter("textTalla");
        String IdOrden = request.getParameter("textOrden");
        String prenda = request.getParameter("textprenda");
        
        HttpSession miSesion = request.getSession(true);
        ArrayList<DetalleOrdenVO> detalle = miSesion.getAttribute("carrito") == null ? new ArrayList<>() : (ArrayList) miSesion.getAttribute("carrito");
        
        boolean flag = false;        
        if(detalle.size() > 0){
            for(DetalleOrdenVO d : detalle){
                if(prenda == d.getIdPrendaFK()){
                    d.setIdDetalleOrden(d.getIdDetalleOrden()+IdDetalle);
                    d.setCantidadPrenda(d.getCantidadPrenda() + cantidad);
                    d.setTalla(talla);
                    d.setIdPrendaFK(prenda);
                    flag = true;
                    break;
                }
            }
        }
        
        if(!flag){
            detalle.add(new DetalleOrdenVO(IdDetalle,cantidad,talla,IdOrden,prenda));
        }
        
        miSesion.setAttribute("carrito",detalle);  
        
        response.sendRedirect("registrarOrden.jsp");
        
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
