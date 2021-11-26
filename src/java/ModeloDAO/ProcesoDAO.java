/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.ProcesoVO;
import Util.Conexion;
import Util.Crud;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sara gabriela
 */
public class ProcesoDAO extends Conexion implements Crud{
   
    //1. Declarar variables u objetos
    //1. Declarar variables u objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion= false;
    private String sql;
    
    private String IdProceso="",DescripcionProceso="",FechaProceso="",HoraInicio="",HoraFin="",
                PrendasRealizadas="",EstadoProceso="",IdAsigOrdenFK="";
    
    public ProcesoDAO(){
     
    }
    
      //2. Crear método principal para recibir los datos del VO
    public ProcesoDAO(ProcesoVO ProVO){
        super();
        
        try {
    //3. Conectar a la BD
            conexion= this.obtenerConexion();
    //4. Traer al DAO los datos del VO para hacer la operación 
    
            IdProceso = ProVO.getIdProceso();
            DescripcionProceso = ProVO.getDescripcionProceso();
            FechaProceso = ProVO.getFechaProceso();
            HoraInicio=ProVO.getHoraInicio(); 
            HoraFin = ProVO.getHoraFin();
            PrendasRealizadas = ProVO.getPrendasRealizadas();
            EstadoProceso = ProVO.getEstadoProceso();
            IdAsigOrdenFK=ProVO.getIdAsigOrdenFK(); 
          
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            
        }
        
    }
    
    @Override
    public boolean aregarRegistro() {
        try {
            
            //Crear la sentencia
            sql = "INSERT INTO proceso (DescripcionProceso,FechaProceso,"
            + "HoraInicio,HoraFin,PrendasRealizadas,EstadoProceso,IdAsigOrdenFK)"
            + " VALUES (?,?,?,?,?,?,?);";
             //Crear el puente para esa conexion establecida
            puente = conexion.prepareStatement(sql);
            puente.setString(1, DescripcionProceso);
            puente.setString(2, FechaProceso);
            puente.setString(3, HoraInicio);
            puente.setString(4, HoraFin);
            puente.setString(5, PrendasRealizadas);
            puente.setString(6, EstadoProceso);
            puente.setString(7, IdAsigOrdenFK);
            puente.executeUpdate();
            operacion = true;
            
            System.out.println(sql);
            
        } catch (SQLException e) {
            Logger.getLogger(ProcesoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            
            //Crear la sentancia
            sql="update proceso set DescripcionProceso=?,"
            + "FechaProceso=?,HoraInicio=?,HoraFin=?," +
"           PrendasRealizadas=?,EstadoProceso=?,IdAsigOrdenFK=? where IdProceso=?";
            //Crear el puente para esa conexion establecida
            puente = conexion.prepareStatement(sql);
            puente.setString(1, DescripcionProceso);
            puente.setString(2, FechaProceso);
            puente.setString(3, HoraInicio);
            puente.setString(4, HoraFin);
            puente.setString(5, PrendasRealizadas);
            puente.setString(6, EstadoProceso);
            puente.setString(7, IdAsigOrdenFK);
             puente.setString(8, IdProceso);
            puente.executeUpdate();
            operacion= true;
            
        } catch (SQLException e) {
            Logger.getLogger(ProcesoDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                
                this.cerrarConexion();
                
            }catch (SQLException e){  
                Logger.getLogger(ProcesoDAO.class.getName()).log(Level.SEVERE, null,e);
            }
              
        }
        
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //CONSULTAR datos
    public ProcesoVO consultarDatos(String IdProceso) {
        
        ProcesoVO ProVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from proceso where IdProceso=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,IdProceso);
            mensajero = puente.executeQuery();  
            while (mensajero.next()) {                
                
                ProVO= new ProcesoVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4), 
                        mensajero.getString(5), mensajero.getString(6), 
                        mensajero.getString(7), mensajero.getString(8));
                
            }
            
        } catch (Exception e) {
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(ProcesoDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return ProVO;
    }
    // genera lista
    public ArrayList<ProcesoVO> listar() {

        ArrayList<ProcesoVO> listaProceso = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from proceso where EstadoProceso='Activo'";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                
                ProcesoVO ProVO = new ProcesoVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4), 
                        mensajero.getString(5), mensajero.getString(6), 
                        mensajero.getString(7),mensajero.getString(8));
                
                    listaProceso.add(ProVO);
            }

        } catch (Exception e) {
            Logger.getLogger(ProcesoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(ProcesoDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return listaProceso;
    }
    
    // genera lista
    public ArrayList<ProcesoVO> inactivo() {

        ArrayList<ProcesoVO> listaProcesoIna = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from proceso where EstadoProceso='Inactivo'";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                
                ProcesoVO ProVO = new ProcesoVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4), 
                        mensajero.getString(5), mensajero.getString(6), 
                        mensajero.getString(7),mensajero.getString(8));
                
                    listaProcesoIna.add(ProVO);
            }

        } catch (Exception e) {
            Logger.getLogger(ProcesoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(ProcesoDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return listaProcesoIna;
    }
    
    
     //CONSULTAR datos
    public ProcesoVO fecha(String FechaProceso,String IdAsigOrdenFK) {
        
        ProcesoVO ProVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "SELECT * FROM Proceso,AsigOrden WHERE FechaProceso=? && FechaProceso between FechaInicio and FechaFin\n" +
            "&& IdAsigOrdenFK=? && IdAsigOrden=IdAsigOrdenFK;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,FechaProceso);
            puente.setString(2,IdAsigOrdenFK);
            mensajero = puente.executeQuery();  
            while (mensajero.next()) {                
                
                ProVO= new ProcesoVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4), 
                        mensajero.getString(5), mensajero.getString(6), 
                        mensajero.getString(7), mensajero.getString(8));
                
            }
            
        } catch (Exception e) {
        } 

        return ProVO;
    }
    
    //Eliminar dato
    
     //CONSULTAR datos
    public boolean Eliminar() {
        
    
        try {
           
            sql = "delete from Proceso where IdProceso=(SELECT max(IdProceso) FROM Proceso)";
            puente = conexion.prepareStatement(sql);
            puente.executeUpdate();
            operacion= true;
            
        }  
        
        catch (Exception e) {
            Logger.getLogger(ProcesoDAO.class.getName()).log(Level.SEVERE, null, e);
        } 

        return operacion;
    } 
    
}
