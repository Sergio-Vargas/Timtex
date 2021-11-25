/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import java.sql.*;

/**
 *
 * @author sergio saenz
 */
public class Conexion2 {
     //segundo metodo de conexion
    Connection conectar = null;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectodifal","root","");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar: "+e.getMessage());
        }
        return conectar;
    }
    
}
