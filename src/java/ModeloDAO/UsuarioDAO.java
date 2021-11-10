/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.UsuarioVO;
import Util.Conexion;
import Util.Crud;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergio saenz
 */
public class UsuarioDAO extends Conexion implements Crud {
    //1. Declarar variables u objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion= false;
    private String sql;

    private String IdUsuario="",NombreUsuario="",CorreoDatos="",ClaveUsuario="",IdCargoFK="";
    
    public UsuarioDAO(){
    }
    
    
    //2. Crear método principal para recibir los datos del VO
    public UsuarioDAO(UsuarioVO usuVO){
        super();
        
        try {
    //3. Conectar a la BD
            conexion= this.obtenerConexion();
    //4. Traer al DAO los datos del VO para hacer la operación 
            IdUsuario = usuVO.getIdUsuario();
            NombreUsuario = usuVO.getNombreUsuario();
            CorreoDatos=usuVO.getCorreoDatos();
            ClaveUsuario = usuVO.getClaveUsuario();
            IdCargoFK=usuVO.getIdCargoFK(); 
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            
        }
        
    }
    //5
    
    @Override
    public boolean aregarRegistro() {
        try {
            
            //Crear la sentancia
            sql ="insert into Usuario (NombreUsuario,CorreoDatos,ClaveUsuario,IdCargoFK) values (?,?,?,?)";
            //Crear el puente para esa conexion establecida
            puente = conexion.prepareStatement(sql);
            puente.setString(1,NombreUsuario);
            puente.setString(2,CorreoDatos);
            puente.setString(3,ClaveUsuario);
            puente.setString(4,IdCargoFK);
            puente.executeUpdate();
            operacion= true;
            
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        finally {
            try {
                this.cerrarConexion();
            }catch (SQLException e){  
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
            
        }
        
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
         try {
            
            //Crear la sentancia
            sql="update Usuario NombreUsuario=?,CorreoDatos=?,ClaveUsuario=?,IdCargoFK=? where IdUsuario=?";
            //Crear el puente para esa conexion establecida
            puente= conexion.prepareStatement(sql);
            puente.setString(1, NombreUsuario);
            puente.setString(2, CorreoDatos);
            puente.setString(3, ClaveUsuario);
            puente.setString(4, IdCargoFK);
            puente.setString(5, IdUsuario);
            puente.executeUpdate();
            operacion= true;
            
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                
                this.cerrarConexion();
                
            }catch (SQLException e){  
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null,e);
            }
              
        }
        
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public boolean iniciarSesion (String usuario, String clave){
    
    try {
        conexion=this.obtenerConexion();
        sql="select * from Usuario where NombreUsuario=? && ClaveUsuario=?";
        puente = conexion.prepareStatement(sql);
        puente.setString(1, usuario);
        puente.setString(2, clave);
        mensajero = puente.executeQuery();
        if (mensajero.next()) {
            operacion = true;
        }
        
    } catch (SQLException e) {
        Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
    }finally{
            try{
                 this.cerrarConexion();
            }catch (Exception e){ 
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
            
        }
    return operacion;
 
    }
    
    
    public ArrayList<UsuarioVO> listar() {

        ArrayList<UsuarioVO> listaUsuario = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuario";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                
                UsuarioVO usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4),mensajero.getString(5));
                
                    listaUsuario.add(usuVO);
            }

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return listaUsuario;
    }
    
    //CONSULTAR datos
    public UsuarioVO consultar(String NombreUsuario) {
        
        UsuarioVO usuVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuario where NombreUsuario=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,NombreUsuario);
            mensajero = puente.executeQuery();  
            while (mensajero.next()) {                
                
                usuVO= new UsuarioVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4),mensajero.getString(5));
                        
            }
            
        } catch (Exception e) { 
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        
        return usuVO;
    }
    
    //CONSULTAR email
    public UsuarioVO consultaremail(String CorreoDatos ) {
        
        UsuarioVO usuVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuario where CorreoDatos=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,CorreoDatos);
            mensajero = puente.executeQuery();  
            while (mensajero.next()) {                
                
                usuVO= new UsuarioVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4),mensajero.getString(5));
                        
            }
            
        } catch (Exception e) { 
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        
        return usuVO;
    }
}
