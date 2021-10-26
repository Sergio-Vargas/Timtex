/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.DetalleOrdenVO;
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
public class DetalleOrdenDAO extends Conexion implements Crud{
    
    //1. Declarar variables u objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion= false;
    private String sql;
    
    private String Talla="",IdDetalleOrden="",CantidadPrenda="",IdOrdenFK="",IdPrendaFK="";
    
    public DetalleOrdenDAO(){
     }
    
    //2. Crear método principal para recibir los datos del VO
        public DetalleOrdenDAO(DetalleOrdenVO DetaVO){
        super();
        
        try {
    //3. Conectar a la BD
            conexion= this.obtenerConexion();
    //4. Traer al DAO los datos del VO para hacer la operación 
            IdDetalleOrden=DetaVO.getIdDetalleOrden();
            CantidadPrenda=DetaVO.getCantidadPrenda();
            Talla=DetaVO.getTalla();
            IdOrdenFK=DetaVO.getIdOrdenFK();
            IdPrendaFK=DetaVO.getIdPrendaFK();
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            
        }
        
    }
    
    @Override
    public boolean aregarRegistro() {
         try {
            //Crear la sentencia
            sql = "insert into Detalle_Orden(CantidadPrenda,Talla,IdOrdenFK,IdPrendaFK)"
            + "values(?,?,?,?)";
             //Crear el puente para esa conexion establecida
            puente = conexion.prepareStatement(sql);
            puente.setString(1,CantidadPrenda);
            puente.setString(2,Talla);
            puente.setString(3,IdOrdenFK);
            puente.setString(4,IdPrendaFK);
            puente.executeUpdate();
            operacion = true;
                        
        } catch (SQLException e) {
            Logger.getLogger(DetalleOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try {
                this.cerrarConexion();
            }catch (SQLException e){  
                Logger.getLogger(DetalleOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
            }    
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            //Crear la sentancia
            sql="update Detalle_Orden set CantidadPrenda=?,Talla=?,IdOrdenFK=?,"
            + "IdPrendaFK=? where IdDetalleOrden=?";
            //Crear el puente para esa conexion establecida
            puente= conexion.prepareStatement(sql);
            puente.setString(1,CantidadPrenda);
            puente.setString(2,Talla);
            puente.setString(3,IdOrdenFK);
            puente.setString(4,IdPrendaFK);
            puente.setString(5,IdDetalleOrden);
            puente.executeUpdate();
            operacion= true;
            
        } catch (SQLException e) {
            Logger.getLogger(DetalleOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{    
            this.cerrarConexion();
                
            }catch (SQLException e){  
                Logger.getLogger(DetalleOrdenDAO.class.getName()).log(Level.SEVERE, null,e);
            }
        }
        
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     //CONSULTAR datos
    public DetalleOrdenVO consultarDatos(String IdDetalleOrden) {
        
        DetalleOrdenVO  AsigVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from Detalle_Orden where IdDetalleOrden=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,IdDetalleOrden);
            mensajero = puente.executeQuery();  
            while (mensajero.next()) {                
                
                AsigVO= new DetalleOrdenVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3),mensajero.getString(4), mensajero.getString(5));
                
            }
            
        } catch (Exception e) {
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(DetalleOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return AsigVO;
    }
    
    
    // genera lista
    public ArrayList<DetalleOrdenVO> listar() {

        ArrayList<DetalleOrdenVO> listaDetalle = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from Detalle_Orden";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                
                DetalleOrdenVO DetaVO = new DetalleOrdenVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3),mensajero.getString(4), mensajero.getString(5));
                
                    listaDetalle.add(DetaVO);
            }

        } catch (Exception e) {
            Logger.getLogger(DetalleOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(DetalleOrdenDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return listaDetalle;
    }
    
}
