/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author sergio saenz
 */
public class DetalleOrdenVO {
 
    String IdDetalleOrden;
    String CantidadPrenda;
    String Talla;
    String IdOrdenFK;
    String IdPrendaFK;

    public DetalleOrdenVO() {
    }

    public DetalleOrdenVO(String IdDetalleOrden, String CantidadPrenda, String Talla, String IdOrdenFK, String IdPrendaFK) {
        this.IdDetalleOrden = IdDetalleOrden;
        this.CantidadPrenda = CantidadPrenda;
        this.Talla = Talla;
        this.IdOrdenFK = IdOrdenFK;
        this.IdPrendaFK = IdPrendaFK;
    }

    public String getIdDetalleOrden() {
        return IdDetalleOrden;
    }

    public void setIdDetalleOrden(String IdDetalleOrden) {
        this.IdDetalleOrden = IdDetalleOrden;
    }

    public String getCantidadPrenda() {
        return CantidadPrenda;
    }

    public void setCantidadPrenda(String CantidadPrenda) {
        this.CantidadPrenda = CantidadPrenda;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getIdOrdenFK() {
        return IdOrdenFK;
    }

    public void setIdOrdenFK(String IdOrdenFK) {
        this.IdOrdenFK = IdOrdenFK;
    }

    public String getIdPrendaFK() {
        return IdPrendaFK;
    }

    public void setIdPrendaFK(String IdPrendaFK) {
        this.IdPrendaFK = IdPrendaFK;
    }

   
    
    
}
