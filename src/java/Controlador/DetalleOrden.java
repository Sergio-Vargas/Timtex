/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.DetalleOrdenDAO;
import ModeloVO.DetalleOrdenVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sergio saenz
 */
@WebServlet(name = "DetalleOrden", urlPatterns = {"/DetalleOrden"})
public class DetalleOrden extends HttpServlet {

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
       
        //1. Recibir datos de las Vistas
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        String IdDetalleOrden = request.getParameter("textIdDetalleOrden");
        String CantidadPrenda = request.getParameter("textCantidad");
        String Talla = request.getParameter("textTalla");
        String IdOrdenFK =request.getParameter("textIdOrdenFK");
        String IdPrendaFK = request.getParameter("textIdPrendaFK");
        
        DetalleOrdenVO DetaVO = new DetalleOrdenVO(IdDetalleOrden,CantidadPrenda,Talla,IdOrdenFK,IdPrendaFK);
        DetalleOrdenDAO DetaDAO = new DetalleOrdenDAO(DetaVO);
          
        switch (opcion) {
            case 1:
                if (DetaDAO.aregarRegistro()) {
                    request.setAttribute("MensajeExito", "El pedido se registró correctamente");

                } else {

                    request.setAttribute("MensajeError", "La infromacion no se registró correctamente");

                }
                request.getRequestDispatcher("registrarOrden.jsp").forward(request, response);
                break;
                
            case 2: // Actualizar Registro

                if (DetaDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "La informacion se actualizó correctamente");

                } else {

                    request.setAttribute("MensajeError", "La infromacion no se actualizó correctamente");

                }
                request.getRequestDispatcher("actualizarDetalleOrden.jsp").forward(request, response);
                break;
                
                
            case 3: //Consultar
             
                DetaVO = DetaDAO.consultarDatos(IdDetalleOrden);
                if (DetaVO != null) {
                    request.setAttribute("identificacion consultada",DetaVO);
                    request.getRequestDispatcher("actualizarDetalleOrden.jsp").forward(request, response);
                }else{
                    request.setAttribute("MensajeError", "La identificacion no existe");
                    request.getRequestDispatcher("consultarDetalleOrden.jsp").forward(request, response);
                }
                break;
                
        }
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
