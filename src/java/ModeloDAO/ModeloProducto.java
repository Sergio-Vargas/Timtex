/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;


import Util.Conexion;
import ModeloVO.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class ModeloProducto extends Conexion{
     
    public ArrayList<Producto> getAllProductos(){
        ArrayList<Producto> productos = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "select*from Prenda where EstadoPrenda='Activo'";
            pst = obtenerConexion().prepareCall(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                productos.add(new Producto(rs.getInt("IdPrenda"), rs.getString("NombrePrenda"), rs.getString("ImagenPrenda"),rs.getString("DescripcionPrenda"), rs.getDouble("PrecioPrenda"),rs.getString("EstadoPrenda"), rs.getInt("IdTipoPrendaFK")));
            }
        } catch (Exception e) {
            
        } finally{
            try {
                if(rs != null) rs.close();
                if(pst != null) pst.close();
                if(obtenerConexion() != null) obtenerConexion().close();
            } catch (Exception e) {
            }
        }       
        return productos;        
    }
    
    public Producto getProducto(int id){
        Producto producto = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "select*from Prenda where IdPrenda=?";
            pst = obtenerConexion().prepareCall(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while(rs.next()){
                producto = new Producto(rs.getInt("IdPrenda"), rs.getString("NombrePrenda"), rs.getString("ImagenPrenda"),rs.getString("DescripcionPrenda"), rs.getDouble("PrecioPrenda"),rs.getString("EstadoPrenda"), rs.getInt("IdTipoPrendaFK"));
            }
        } catch (Exception e) {
            
        } finally{
            try {
                if(rs != null) rs.close();
                if(pst != null) pst.close();
                if(obtenerConexion() != null) obtenerConexion().close();
            } catch (Exception e) {
            }
        }       
        return producto;
        
    }    
    
   
}
