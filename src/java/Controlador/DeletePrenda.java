/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloVO.DetalleOrdenVO;
import ModeloVO.PrendaVO;
import java.io.IOException;
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
@WebServlet(name = "DeletePrenda", urlPatterns = {"/DeletePrenda"})
public class DeletePrenda extends HttpServlet {

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
        
        
        String iddetalle = request.getParameter("textIdPrenda");
        
        HttpSession miSesion = request.getSession(true);
        ArrayList<DetalleOrdenVO> detalle = miSesion.getAttribute("carrito") == null ? null : (ArrayList) miSesion.getAttribute("carrito");
        
        if(detalle != null){
            for(DetalleOrdenVO d : detalle){                
                if(d.getIdPrendaFK() == iddetalle){
                    detalle.remove(d);
                    break;
                }
            }
        }
             
        
        ControladorPrenda pre = new ControladorPrenda();                                                    
      
        for(DetalleOrdenVO d : detalle){
        PrendaVO PreVO = pre.consultarDatos(d.getIdPrendaFK());  
        PreVO.getIdPrenda(); 
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
