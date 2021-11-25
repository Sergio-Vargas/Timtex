/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Util.Conexion2;
import java.sql.*;

/**
 *
 * @author sergio saenz
 */
public class ObtenerCodigo {
 
     public static String CodigoVenta(){
        
        String Codigo = "";
        Connection cn;
        Conexion2 con = new Conexion2();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("SELECT MAX(IdOrden)+1 AS Codigo FROM Orden;");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Codigo = rs.getString("Codigo");
            }
        }catch(Exception e){
           System.out.println(e);
        }
        return Codigo;
    }
    
}
