/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;
import ModeloVO.TipoPrendaVO;
import java.sql.*;
import Util.Conexion;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author sergio saenz
 */
public class TipoPrendaDAO extends Conexion{

   //1. Declarar variables u objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private String sql;
    
    public ArrayList<TipoPrendaVO> listar() {

        ArrayList<TipoPrendaVO> listaTipoPrenda = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from TipoPrenda";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                
                TipoPrendaVO TPreVO = new TipoPrendaVO(mensajero.getString(1), mensajero.getString(2));
                
                    listaTipoPrenda.add(TPreVO);
            }

        } catch (Exception e) {
            Logger.getLogger(TipoPrendaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(TipoPrendaDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return listaTipoPrenda;
    }
    
    
}
