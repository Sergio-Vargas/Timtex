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
public class Producto {
    
    private int id;
    private String nombre;
    private String img;
    private String DescripcionPrenda;
    private double precio;
    private String EstadoPrenda;
    private int IdTipoPrendaFK;

    public Producto(int id, String nombre, String img, String DescripcionPrenda, double precio, String EstadoPrenda, int IdTipoPrendaFK) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
        this.DescripcionPrenda = DescripcionPrenda;
        this.precio = precio;
        this.EstadoPrenda = EstadoPrenda;
        this.IdTipoPrendaFK = IdTipoPrendaFK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcionPrenda() {
        return DescripcionPrenda;
    }

    public void setDescripcionPrenda(String DescripcionPrenda) {
        this.DescripcionPrenda = DescripcionPrenda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstadoPrenda() {
        return EstadoPrenda;
    }

    public void setEstadoPrenda(String EstadoPrenda) {
        this.EstadoPrenda = EstadoPrenda;
    }

    public int getIdTipoPrendaFK() {
        return IdTipoPrendaFK;
    }

    public void setIdTipoPrendaFK(int IdTipoPrendaFK) {
        this.IdTipoPrendaFK = IdTipoPrendaFK;
    }
    
    
    
}
