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
public class OrdenVO {
    
    private String IdOrden,FechaOrden,EstadoOrden,IdDatosFK;
    private String IdDetalleOrden,NombrePrenda,CantidadPrenda,Talla,IdOrdenFK;
    
    public OrdenVO() {
    }

    public OrdenVO(String IdOrden, String FechaOrden, String EstadoOrden, String IdDatosFK) {
        this.IdOrden = IdOrden;
        this.FechaOrden = FechaOrden; 
        this.EstadoOrden = EstadoOrden;
        this.IdDatosFK = IdDatosFK;
       
    }
    
    //constrcutor de detalle orden
    public OrdenVO(String IdDetalleOrden, String NombrePrenda, String CantidadPrenda, String Talla, String IdOrdenFK) {
        this.IdDetalleOrden = IdDetalleOrden;
        this.NombrePrenda = NombrePrenda;
        this.CantidadPrenda = CantidadPrenda;
        this.Talla = Talla;
        this.IdOrdenFK = IdOrdenFK;
    }
    
    
    
    public OrdenVO(String IdOrden, String FechaOrden, String EstadoOrden) {
        this.IdOrden = IdOrden;
        this.FechaOrden = FechaOrden; 
        this.EstadoOrden = EstadoOrden;
    }

    public String getIdOrden() {
        return IdOrden;
    }

    public void setIdOrden(String IdOrden) {
        this.IdOrden = IdOrden;
    }

    public String getFechaOrden() {
        return FechaOrden;
    }

    public void setFechaOrden(String FechaOrden) {
        this.FechaOrden = FechaOrden;
    }

    public String getEstadoOrden() {
        return EstadoOrden;
    }

    public void setEstadoOrden(String EstadoOrden) {
        this.EstadoOrden = EstadoOrden;
    }

    public String getIdDatosFK() {
        return IdDatosFK;
    }

    public void setIdDatosFK(String IdDatosFK) {
        this.IdDatosFK = IdDatosFK;
    }    
    
    //get y set de detalle orden

    public String getIdDetalleOrden() {
        return IdDetalleOrden;
    }

    public void setIdDetalleOrden(String IdDetalleOrden) {
        this.IdDetalleOrden = IdDetalleOrden;
    }

    public String getNombrePrenda() {
        return NombrePrenda;
    }

    public void setNombrePrenda(String NombrePrenda) {
        this.NombrePrenda = NombrePrenda;
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
    
    
}
