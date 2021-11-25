/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.OrdenDAO;
import ModeloVO.Articulo;
import ModeloVO.OrdenVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Util.Conexion2;
import java.sql.*;

/**
 *
 * @author sergio saenz
 */
@WebServlet(name = "Orden", urlPatterns = {"/Orden"})
public class Orden extends HttpServlet {

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
        String IdOrden = request.getParameter("textOrden");
        String FechaOrden =request.getParameter("textFecha");
        if(FechaOrden==null){
        FechaOrden =LocalDate.now().toString();
        }
        String EstadoOrden = request.getParameter("textEstado");
        String IdDatosFK = request.getParameter("textIdDato");

        OrdenVO OrdeVO = new OrdenVO(IdOrden,FechaOrden,EstadoOrden,IdDatosFK);        
        OrdenDAO OrdeDAO = new OrdenDAO(OrdeVO);
       
         switch (opcion) {
            case 1:
            
                HttpSession sesion = request.getSession(false);
                ArrayList<Articulo> articulos = sesion.getAttribute("carrito") == null ? new ArrayList<>() : (ArrayList) sesion.getAttribute("carrito");
                
                Connection cn;
                Conexion2 con = new Conexion2();
                cn = con.conectar();
                
                if (OrdeDAO.aregarRegistro()){
                    String IdDetalleOrden[]= request.getParameterValues("textIdDetalleOrden");
                    String CantidadPrenda[] = request.getParameterValues("textCantidad");
                    String Talla[]= request.getParameterValues("textTalla");
                    String IdOrdenFK =request.getParameter("textIdOrdenFK");
                    String IdPrendaFK[]= request.getParameterValues("textIdPrendaFK");
                    
                    for(int i=0; i<IdDetalleOrden.length;i++){
                    try{
                    CallableStatement cs = cn.prepareCall("insert into Detalle_Orden(CantidadPrenda,Talla,IdOrdenFK,IdPrendaFK)"
                    +"values(?,?,?,?)");
                 
                    cs.setString(1, CantidadPrenda[i]);
                    cs.setString(2, Talla[i]);
                    cs.setString(3, IdOrdenFK);
                    cs.setString(4, IdPrendaFK[i]);
                    int j = cs.executeUpdate();
                    if(j==1){
                        request.setAttribute("MensajeExito", "La informacion se registró correctamente");
                        articulos.clear();
                    }else{
                        request.setAttribute("MensajeError", "La infromacion no se registró correctamente");
                    }
                }catch(Exception e){System.out.println(e);}
                    
                    }                    
                } else {

                    request.setAttribute("MensajeError", "La infromacion no se registró correctamente");

                }
                request.getRequestDispatcher("cart.jsp").forward(request, response);
                break;
                
            case 2: // Actualizar Registro

                if (OrdeDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "La informacion se actualizó correctamente");

                } else {

                    request.setAttribute("MensajeError", "La infromacion no se actualizó correctamente");

                }
                request.getRequestDispatcher("actualizarOrden.jsp").forward(request, response);
                break;
                
                
            case 3: //Consultar
                
                OrdeVO = OrdeDAO.consultarDatos(IdOrden);
                if (OrdeVO != null) {
                    
                    request.setAttribute("identificacion consultada",OrdeVO);
                    request.getRequestDispatcher("actualizarOrden.jsp").forward(request, response);
                
                }else{
                    request.setAttribute("MensajeError", "La identificacion no existe");
                    request.getRequestDispatcher("consultarOrden.jsp").forward(request, response);
                }
                break;
         
            case 4:
                 if (OrdeDAO.aregarRegistro()) {
                    request.setAttribute("MensajeExito", "La informacion se registro correctamente");

                } else {

                    request.setAttribute("MensajeError", "La infromacion no se registro correctamente");

                }
                request.getRequestDispatcher("consultarOrden.jsp").forward(request, response);
            break;    
            
            case 5:
                  ArrayList<OrdenVO> listaOrden = OrdeDAO.lista(IdDatosFK);
                    
                    for (int i = 0; i < listaOrden.size(); i++) {
                        OrdeVO = listaOrden.get(i);
                    }
                    request.setAttribute("rol", listaOrden);
                    
                    if (listaOrden.size()>0) {
                        
                        request.getRequestDispatcher("OrdenesUsuario.jsp").forward(request, response);
                        
                    }else{
                        request.setAttribute("MensajeError", "No hay ordenes registrados");
                        request.getRequestDispatcher("login.jsp").forward(request, response);
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
