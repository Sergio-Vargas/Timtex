/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.Articulo;
import ModeloVO.OrdenVO;
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
public class OrdenDAO extends Conexion implements Crud{
     //1. Declarar variables u objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion= false;
    private String sql;
    
    private String IdOrden="",FechaOrden="",EstadoOrden="",IdDatosFK="";

    public OrdenDAO(){
     }
    
      //2. Crear método principal para recibir los datos del VO
    public OrdenDAO(OrdenVO OrdeVO){
        super();
        
        try {
    //3. Conectar a la BD
            conexion= this.obtenerConexion();
    //4. Traer al DAO los datos del VO para hacer la operación 
    
            IdOrden = OrdeVO.getIdOrden();
            FechaOrden = OrdeVO.getFechaOrden();
            EstadoOrden=OrdeVO.getEstadoOrden(); 
            IdDatosFK = OrdeVO.getIdDatosFK();
                            
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    
    private int idProducto,cantidad,talla;
    private String orden="",IdPrendaFK="";
    
      //2. Crear método principal para recibir los datos del VO
    public OrdenDAO(Articulo art,OrdenVO OrdeVO){
        super();
        
        try {
            
    //3. Conectar a la BD
            conexion= this.obtenerConexion();
    //4. Traer al DAO los datos del VO para hacer la operación 
    
            idProducto = art.getIdProducto();
            cantidad = art.getCantidad();
            talla=art.getTalla(); 
            orden=OrdeVO.getIdOrden();
            IdPrendaFK = art.getIdPrendaFK() ;
                            
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    
    
    
    @Override
    public boolean aregarRegistro() {
         try {
            //Crear la sentencia
            sql = "INSERT INTO orden(FechaOrden,EstadoOrden,"
            + " IdDatosFK)VALUES(?,?,?);";
   
            //Crear el puente para esa conexion establecida
            puente = conexion.prepareStatement(sql);
            puente.setString(1, FechaOrden);
            puente.setString(2, EstadoOrden);
            puente.setString(3, IdDatosFK);
            puente.executeUpdate();
            operacion = true;
         
            
        } catch (SQLException e) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                
                this.cerrarConexion();
                
            }catch (SQLException e){  
                Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null,e);
            }
              
        }
        
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            
            //Crear la sentancia
            sql="update orden set FechaOrden=?,EstadoOrden=?,"
                + "IdDatosFK=? where IdOrden=?;";
 
            //Crear el puente para esa conexion establecida
            puente= conexion.prepareStatement(sql);
            puente.setString(1, FechaOrden);
            puente.setString(2, EstadoOrden);
            puente.setString(3, IdDatosFK);
            puente.setString(4, IdOrden);
            puente.executeUpdate();
            operacion= true;
            
        } catch (SQLException e) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                
                this.cerrarConexion();
                
            }catch (SQLException e){  
                Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null,e);
            }
              
        }
        
        return operacion;
    }
    

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //CONSULTAR datos
    public OrdenVO consultarDatos(String IdOrden) {
        
        OrdenVO OrdeVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from orden where IdOrden=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,IdOrden);
            mensajero = puente.executeQuery();  
            while (mensajero.next()) {                
                
                OrdeVO= new OrdenVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4));
                        
            }
            
        } catch (Exception e) {
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return OrdeVO;
    }
    
    // genera lista
    public ArrayList<OrdenVO> listar() {

        ArrayList<OrdenVO> listaOrden = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from orden where EstadoOrden='Activo'";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                
                OrdenVO OrdeVO = new OrdenVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4));
                
                    listaOrden.add(OrdeVO);
            }

        } catch (Exception e) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return listaOrden;
    }
    
    
    // genera lista
    public ArrayList<OrdenVO> inactivo() {

        ArrayList<OrdenVO> listaOrdenIna = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from orden where EstadoOrden='Inactivo'";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                
                OrdenVO OrdeVO = new OrdenVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4));
                
                    listaOrdenIna.add(OrdeVO);
            }

        } catch (Exception e) {
            Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(OrdenDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return listaOrdenIna;
    }
    
            
        public ArrayList<OrdenVO> lista(String IdDatosFK){
    
        ArrayList<OrdenVO> listaOrden= new ArrayList<>(); 
        try{
        conexion=this.obtenerConexion();
        sql="select IdOrden,FechaOrden,EstadoOrden,IdDatosFK from Orden ord, DatosPersonales dat,Usuario usu where usu.IdUsuario=?"
        + " and usu.IdUsuario=dat.IdUsuarioFK &&  dat.IdDatos=ord.IdDatosFK ;";
        puente = conexion.prepareStatement(sql);   
        puente.setString(1,IdDatosFK);
        mensajero=puente.executeQuery();
        
        System.out.println(sql);
        while(mensajero.next()){
        
        OrdenVO ordeVO= new OrdenVO(mensajero.getString(1), mensajero.getString(2),
              mensajero.getString(3),mensajero.getString(4));
        listaOrden.add(ordeVO);
    
        }
        }catch(Exception e){
         Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);   
        }
        return listaOrden; 
    }
   
      public ArrayList<OrdenVO> listaDetalle(String IdDatosFK,String IdOrden){
    
        ArrayList<OrdenVO> listaDetalle= new ArrayList<>(); 
        try{
        conexion=this.obtenerConexion();
        sql="select IdDetalleOrden,pre.NombrePrenda,CantidadPrenda,Talla,IdOrdenFK from Orden ord,Detalle_Orden det,"
        + "DatosPersonales dat,Usuario usu,Prenda pre \n" +
        "where usu.IdUsuario=? && usu.IdUsuario=dat.IdUsuarioFK &&\n" +
        "dat.IdDatos=ord.IdDatosFK && ord.IdOrden=? && ord.IdOrden=det.IdOrdenFK && pre.Idprenda=det.IdPrendaFK;";
        puente = conexion.prepareStatement(sql);   
        puente.setString(1,IdDatosFK);
        puente.setString(2,IdOrden);
        mensajero=puente.executeQuery();
        
        System.out.println(sql);
        while(mensajero.next()){
        
        OrdenVO ordeVO= new OrdenVO(mensajero.getString(1), mensajero.getString(2),
              mensajero.getString(3),mensajero.getString(4),
              mensajero.getString(5));
        listaDetalle.add(ordeVO);
    
        }
        }catch(Exception e){
         Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);   
        }
        return listaDetalle; 
    }   
}

