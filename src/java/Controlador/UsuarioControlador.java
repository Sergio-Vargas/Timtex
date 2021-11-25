/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.RolDAO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.UsuarioVO;
import Email.PropiedadesCorreo;
import Util.PasswordGenerator;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
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
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/Usuario"})
public class UsuarioControlador extends HttpServlet {
    
    private String host, puerto, usuario, clave;

    public void init() {
        ServletContext contex = getServletContext();
        host = contex.getInitParameter("host");
        puerto = contex.getInitParameter("puerto");
        usuario = contex.getInitParameter("usuario");
        clave = contex.getInitParameter("clave");

    }
    
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
        String IdUsuario = request.getParameter("textId");
        String NombreUsuario = request.getParameter("textUsuario");
        String CorreoDatos=request.getParameter("textCorreo");
        String ClaveUsuario = request.getParameter("textClave");
          if (ClaveUsuario == null) {
            ClaveUsuario = PasswordGenerator.getPassword(
                    PasswordGenerator.MINUSCULAS
                    + PasswordGenerator.MAYUSCULAS
                    + PasswordGenerator.NUMEROS, 20);
        }
        
        String IdCargoFK =request.getParameter("textCargo");
        String EstadoUsu=request.getParameter("textEstado");
        //2. Hacer pregunta ¿Quién tiene los datos de forma segura en el sistema? = VO
        UsuarioVO usuVO = new UsuarioVO(IdUsuario,NombreUsuario,CorreoDatos,ClaveUsuario,IdCargoFK,EstadoUsu);
        
        //3.¿Quién hace las operaciones? = DAO
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
        
        //4.Administrar operaciones del módulos
        switch (opcion) {

            case 1: 
                // registrar usuario
                usuVO = usuDAO.consultar(NombreUsuario);
                UsuarioVO usuVO1 = new UsuarioVO(IdUsuario,NombreUsuario,CorreoDatos,ClaveUsuario,IdCargoFK,EstadoUsu);
                usuVO1 = usuDAO.consultaremail(CorreoDatos);
                
                if (usuVO == null) {
                    
                    if(usuVO1==null){  
                        
                    if (usuDAO.aregarRegistro()) {
                            String destinatario = CorreoDatos;
                            String asunto = "Bienvenido a timtex";     
                            String contenido = "Gracias por registrarte con nosotros "+NombreUsuario;
                            PropiedadesCorreo.enviarConGMail(destinatario, asunto, contenido, usuario, clave);
                            request.setAttribute("MensajeExito", "El usuario se registró correctamente");
                        //request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);

                    } else {
                        request.setAttribute("MensajeError", "El usuario no se registró correctamente");
                        //request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                    }
                    
                      }else{
                        request.setAttribute("MensajeError", "El correo ya existe en el sistema");
                    }
                } else {

                    request.setAttribute("MensajeError", "El usuario ya existe en el sistema");
                    
                }
                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                break;
                
            case 2: // Actualizar Registro
                
                if (usuDAO.actualizarRegistro()) {
                    
                    request.setAttribute("MensajeExito", "El usuario se actualizó correctamente");
                    
                }else {
                    
                    request.setAttribute("MensajeError", "El usuario NO se actualizó correctamente");
                    
                }
                request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);
                break;
                
            case 3: //Inicio de Sesión
                usuVO = usuDAO.consultar(NombreUsuario); 
                usuVO1 =usuDAO.consultarDatos(NombreUsuario);
                if (usuVO!=null) {
                
                        
                if (usuDAO.iniciarSesion(NombreUsuario,ClaveUsuario)) {
                    
                    HttpSession miSesion =request.getSession(true);
                    RolDAO rolDAO= new RolDAO();
                    
                    miSesion.setAttribute("datosUsuario", usuVO);
                    
                    
                    if(usuVO1!=null){
                    ArrayList<UsuarioVO> listaRoles= rolDAO.rol(NombreUsuario);
                    
                    for(int i=0;i<listaRoles.size();i++){
                    usuVO=listaRoles.get(i);
                    IdCargoFK = usuVO.getIdCargoFK();
                    }
                    miSesion.setAttribute("rol",listaRoles); 
                    
                    
                    if(usuVO.getRol().equals("Administrador")){
                        
                    request.getRequestDispatcher("Usuario.jsp").forward(request, response);
                    }
                    else if(usuVO.getRol().equals("Empleado")){
                        
                    request.getRequestDispatcher("Usuario.jsp").forward(request, response);
                    }
                    else{
                        
                    request.getRequestDispatcher("Cliente.jsp").forward(request, response);
                    }
                     }else{
                     request.setAttribute("MensajeError","Debe registrarse primero");
                  request.getRequestDispatcher("registrarDatosPersonales.jsp").forward(request, response);   
                         
                }
                } else{
                 
                    request.setAttribute("MensajeError","El usuario y/o la contraseña son incorrectos");
                     request.getRequestDispatcher("Login.jsp").forward(request, response);
                    
                } 
                   }
                 
                                
                break;
                
            case 4: 
                // registrar empleado admin o empleado normal
                usuVO = usuDAO.consultar(NombreUsuario);
                UsuarioVO usuVO3 = new UsuarioVO(IdUsuario,NombreUsuario,CorreoDatos,ClaveUsuario,IdCargoFK,EstadoUsu);
                usuVO3 = usuDAO.consultaremail(CorreoDatos);
               
                if (usuVO == null) {
                    
                    if(usuVO3==null){  
                        
                    if (usuDAO.aregarRegistro()) {
                        String destinatario = CorreoDatos;
                        String asunto = "Usted fue registrado en el Sistema Timtex";     
                        String contenido = "Bienvenido a Timtex"+" Su usuario es: "+NombreUsuario+" Su clave es: "+ClaveUsuario;
                        PropiedadesCorreo.enviarConGMail(destinatario, asunto, contenido, usuario, clave);
                        request.setAttribute("MensajeExito", "El usuario se registró correctamente");
                        //request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);

                    } else {
                        request.setAttribute("MensajeError", "El usuario no se registró correctamente");
                        //request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                    }
                    
                      }else{
                        request.setAttribute("MensajeError", "El correo ya existe en el sistema");
                    }
                } else {

                    request.setAttribute("MensajeError", "El usuario ya existe en el sistema");
                    
                }
                request.getRequestDispatcher("registrarEmpleado.jsp").forward(request, response);
                break;    
                
            case 5:
                usuVO1 = usuDAO.consultaremail(CorreoDatos);
                 System.out.println("---------------------"+usuVO1);
                if(usuVO1!=null){  
                if(usuDAO.correoclave()){
                    String destinatario = CorreoDatos;
                    String asunto = "Timtex - Recuperación de contraseña";
                    String contenido = "Estimado usuario hemos recuperado tu contraseña,intenta ingresar nuevamentecon tu respectivo usuario y contraseña   -Contraseña: " + ClaveUsuario;
                    PropiedadesCorreo.enviarConGMail(destinatario, asunto, contenido, usuario, clave);
                    request.setAttribute("MensajeExito", "Por favor revise su correo");
                }else{
                    request.setAttribute("MensajeError", "No se pudo enviar el correo correctamente");
                }
                }else{
                        request.setAttribute("MensajeError", "El correo no existe en el sistema");
                    }
                 request.getRequestDispatcher("forgot.jsp").forward(request, response);
            break;  
            
            case 6:
                if(usuDAO.Estado()){   
                    request.setAttribute("identificacion consultada",usuDAO);
                    request.setAttribute("MensajeExito", "El estado se actualizó correctamente");
                }else{
                    request.setAttribute("MensajeError", "El estado no se actualizo correctamente");
                }    
                request.getRequestDispatcher("consultarIngreso.jsp").forward(request, response);
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
