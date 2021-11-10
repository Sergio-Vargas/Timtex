/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Jonathan
 */
public class Articulo {
    
    private int idProducto;
    private int cantidad;
    private int talla;

    public Articulo(int idProducto, int cantidad, int talla) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.talla = talla;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    
    
}
