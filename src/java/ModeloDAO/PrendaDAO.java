/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.PrendaVO;
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
public class PrendaDAO extends Conexion implements Crud{

    //1. Declarar variables u objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion= false;
    private String sql;
    
    
    String IdPrenda="";
    String ImagenPrenda="",NombrePrenda="",DescripcionPrenda="", PrecioPrenda="", EstadoPrenda="";
    String IdTipoPrendaFK;

    
    public PrendaDAO(){
     }
    
      //2. Crear método principal para recibir los datos del VO
    public PrendaDAO(PrendaVO PreVO){
        super();
        
        try {
    //3. Conectar a la BD
            conexion= this.obtenerConexion();
    //4. Traer al DAO los datos del VO para hacer la operación 
    
            IdPrenda = PreVO.getIdPrenda();
            ImagenPrenda = PreVO.getImagenPrenda();
            NombrePrenda = PreVO.getNombrePrenda(); 
            DescripcionPrenda = PreVO.getDescripcionPrenda();
            PrecioPrenda=PreVO.getPrecioPrenda();
            EstadoPrenda=PreVO.getEstadoPrenda();
            IdTipoPrendaFK=PreVO.getIdTipoPrendaFK();
                            
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    @Override
    public boolean aregarRegistro() {
        try {
            //Crear la sentencia
            sql = "INSERT INTO prenda(ImagenPrenda,NombrePrenda,"
            + "DescripcionPrenda,PrecioPrenda,EstadoPrenda,IdTipoPrendaFK)VALUES(?,?,?,?,?);";

            //Crear el puente para esa conexion establecida
            puente = conexion.prepareStatement(sql);
            puente.setString(1, ImagenPrenda);
            puente.setString(2, NombrePrenda);
            puente.setString(3, DescripcionPrenda);
            puente.setString(4,PrecioPrenda);
            puente.setString(5, EstadoPrenda);
            puente.setString(6, IdTipoPrendaFK);
            puente.executeUpdate();
            operacion = true;
         
            
        } catch (SQLException e) {
            Logger.getLogger(PrendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                
                this.cerrarConexion();
                
            }catch (SQLException e){  
                Logger.getLogger(PrendaDAO.class.getName()).log(Level.SEVERE, null,e);
            }
              
        }
        
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            
            //Crear la sentancia
            sql="update prenda set ImagenPrenda=?,NombrePrenda=?,"
            + "DescripcionPrenda=?,PrecioPrenda=?,EstadoPrenda=?,IdTipoPrendaFK=? where IdPrenda=?;";
 
            //Crear el puente para esa conexion establecida
            puente= conexion.prepareStatement(sql);
            puente.setString(1, ImagenPrenda);
            puente.setString(2, NombrePrenda);
            puente.setString(3, DescripcionPrenda);
            puente.setString(4,PrecioPrenda);
            puente.setString(5, EstadoPrenda);
            puente.setString(6, IdTipoPrendaFK);
            puente.setString(7, IdPrenda);
            puente.executeUpdate();
            operacion= true;
            
        } catch (SQLException e) {
            Logger.getLogger(PrendaDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                
                this.cerrarConexion();
                
            }catch (SQLException e){  
                Logger.getLogger(PrendaDAO.class.getName()).log(Level.SEVERE, null,e);
            }
              
        }
        
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //CONSULTAR datos
    public PrendaVO consultarDatos(String IdPrenda) {
        
        PrendaVO PreVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from prenda where IdPrenda=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,IdPrenda);
            mensajero = puente.executeQuery();  
            while (mensajero.next()) {                
                
                PreVO= new PrendaVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4), 
                        mensajero.getString(5), mensajero.getString(6),mensajero.getString(7));
                        
            }
            
        } catch (Exception e) {
        } 

        return PreVO;
    }
    
   
    // genera lista
    public ArrayList<PrendaVO> listar() {

        ArrayList<PrendaVO> listaPrenda = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select*from Prenda where EstadoPrenda='Activo'";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                
                PrendaVO PreVO = new PrendaVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4), 
                        mensajero.getString(5), mensajero.getString(6),mensajero.getString(7));
                
                    listaPrenda.add(PreVO);
            }

        } catch (Exception e) {
            Logger.getLogger(PrendaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(PrendaDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return listaPrenda;
    }
    
    
    // genera lista
    public ArrayList<PrendaVO> inactivo() {

        ArrayList<PrendaVO> listaPrendaIna = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select*from Prenda where EstadoPrenda='Inactivo'";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                
                PrendaVO PreVO = new PrendaVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4), 
                        mensajero.getString(5), mensajero.getString(6),mensajero.getString(7));
                
                    listaPrendaIna.add(PreVO);
            }

        } catch (Exception e) {
            Logger.getLogger(PrendaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(PrendaDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return listaPrendaIna;
    }
    
}
