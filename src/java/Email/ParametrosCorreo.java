package Email;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Letty Morales
 */
@WebServlet(urlPatterns = {"/ParametrosCorreo"})
public class ParametrosCorreo extends HttpServlet {

    private String host,puerto,usuario,clave;
    
    public void init(){
        
        ServletContext contex = getServletContext();
        host = contex.getInitParameter("host");
        puerto = contex.getInitParameter("puerto");
        usuario = contex.getInitParameter("usuario");
        clave = contex.getInitParameter("clave");
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String destinatario = request.getParameter("destinatario");
        String asunto = request.getParameter("asunto");
        String contenido = request.getParameter("contenido");
        
        String resultado="";
        try {
            
        PropiedadesCorreo.enviarConGMail(destinatario, asunto, contenido, usuario, clave);            
        resultado = "El mensaje se envió correctamente";
            
        } catch (Exception e) {
            e.printStackTrace();
            resultado = "Error al enviar" + e.getMessage();
            
        }finally{
            request.setAttribute("resultado", resultado);
            getServletContext().getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

}