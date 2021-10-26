/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.AsigOrdenVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis martinez
 */
public class AsigOrdenDAO extends Conexion implements Crud{

    //1. Declarar variables u objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion= false;
    private String sql;
    
    private String IdAsigOrden="",CantidadPrenda="",FechaInicio="",FechaFin="",IdDatosFK="",IdDetalleOrdenFK="";

     
     public AsigOrdenDAO(){
     }
    
      //2. Crear método principal para recibir los datos del VO
        public AsigOrdenDAO(AsigOrdenVO AsigVO){
        super();
        
        try {
    //3. Conectar a la BD
            conexion= this.obtenerConexion();
    //4. Traer al DAO los datos del VO para hacer la operación 
            IdAsigOrden=AsigVO.getIdAsigOrden();
            CantidadPrenda=AsigVO.getCantidadPrenda();
            FechaInicio=AsigVO.getFechaInicio();
            FechaFin=AsigVO.getFechaFin();
            IdDatosFK=AsigVO.getIdDatosFK();
            IdDetalleOrdenFK=AsigVO.getIdDetalleOrdenFK();
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            
        }
        
    }
    
        
    
    @Override
    public boolean aregarRegistro() {
        try {
            //Crear la sentencia
            sql = "insert into AsigOrden(CantidadPrenda,FechaInicio,FechaFin,IdDatosFK,IdDetalleOrdenFK)"
            + "values(?,?,?,?,?)";
             //Crear el puente para esa conexion establecida
            puente = conexion.prepareStatement(sql);
            puente.setString(1,CantidadPrenda);
            puente.setString(2,FechaInicio);
            puente.setString(3,FechaFin);
            puente.setString(4,IdDatosFK);
            puente.setString(5,IdDetalleOrdenFK);
            puente.executeUpdate();
            operacion = true;
                        
        } catch (SQLException e) {
            Logger.getLogger(AsigOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try {
                this.cerrarConexion();
            }catch (SQLException e){  
                Logger.getLogger(AsigOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
            }    
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            //Crear la sentancia
            sql="update AsigOrden set CantidadPrenda=?,FechaInicio=?,FechaFin=?,"
            + "IdDatosFK=?,IdDetalleOrdenFK=? where IdAsigOrden=?";
            //Crear el puente para esa conexion establecida
            puente= conexion.prepareStatement(sql);
            puente.setString(1,CantidadPrenda);
            puente.setString(2,FechaInicio);
            puente.setString(3,FechaFin);
            puente.setString(4,IdDatosFK);
            puente.setString(5,IdDetalleOrdenFK);
            puente.setString(6,IdAsigOrden);
            puente.executeUpdate();
            operacion= true;
            
        } catch (SQLException e) {
            Logger.getLogger(AsigOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{    
            this.cerrarConexion();
                
            }catch (SQLException e){  
                Logger.getLogger(AsigOrdenDAO.class.getName()).log(Level.SEVERE, null,e);
            }
        }
        
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //CONSULTAR datos
    public AsigOrdenVO consultarDatos(String IdAsigOrden) {
        
        AsigOrdenVO AsigVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from AsigOrden where IdAsigOrden=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,IdAsigOrden);
            mensajero = puente.executeQuery();  
            while (mensajero.next()) {                
                
                AsigVO= new AsigOrdenVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3),mensajero.getString(4), mensajero.getString(5), 
                        mensajero.getString(6));
                
            }
            
        } catch (Exception e) {
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(AsigOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return AsigVO;
    }
    
    
    // genera lista
    public ArrayList<AsigOrdenVO> listar() {

        ArrayList<AsigOrdenVO> listaAsig = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from AsigOrden";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                
                AsigOrdenVO AsigVO = new AsigOrdenVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3),mensajero.getString(4), mensajero.getString(5), 
                        mensajero.getString(6));
                
                    listaAsig.add(AsigVO);
            }

        } catch (Exception e) {
            Logger.getLogger(AsigOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(AsigOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return listaAsig;
    }
    
    
}
