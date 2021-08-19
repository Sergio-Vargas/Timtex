/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.AsigOrdenDAO;
import ModeloVO.AsigOrdenVO;
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
@WebServlet(name = "AsigOrden", urlPatterns = {"/AsigOrden"})
public class AsigOrden extends HttpServlet {

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
        String AsigOrden = request.getParameter("textAsigOrden");
        String CantidadPrenda = request.getParameter("textCantidad");
        String FechaInicio = request.getParameter("textFechaInicio");
        String FechaFin = request.getParameter("textFechaFin");
        String IdDatosFK = request.getParameter("textIdDatos");
        String IdOrdenFK = request.getParameter("textIdOrden");
        
        AsigOrdenVO AsigVO = new AsigOrdenVO(AsigOrden,CantidadPrenda,FechaInicio,FechaFin,IdDatosFK,IdOrdenFK);
        AsigOrdenDAO AsigDAO = new AsigOrdenDAO(AsigVO);
          
        switch (opcion) {
            case 1:
                if (AsigDAO.aregarRegistro()) {
                    request.setAttribute("MensajeExito", "La informacion se registró correctamente");

                } else {

                    request.setAttribute("MensajeError", "La infromacion no se registró correctamente");

                }
                request.getRequestDispatcher("registrarAsignar.jsp").forward(request, response);
                break;
                
            case 2: // Actualizar Registro

                if (AsigDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "La informacion se actualizó correctamente");

                } else {

                    request.setAttribute("MensajeError", "La infromacion no se actualizó correctamente");

                }
                request.getRequestDispatcher("actualizarAsignar.jsp").forward(request, response);
                break;
                
                
            case 3: //Consultar
             
                AsigVO = AsigDAO.consultarDatos(AsigOrden);
                if (AsigVO != null) {
                    request.setAttribute("identificacion consultada",AsigVO);
                    request.getRequestDispatcher("actualizarAsignar.jsp").forward(request, response);
                }else{
                    request.setAttribute("MensajeError", "La identificacion no existe");
                    request.getRequestDispatcher("consultarAsignar.jsp").forward(request, response);
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
