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

    
    public OrdenVO() {
    }

    public OrdenVO(String IdOrden, String FechaOrden, String EstadoOrden, String IdDatosFK) {
        this.IdOrden = IdOrden;
        this.FechaOrden = FechaOrden; 
        this.EstadoOrden = EstadoOrden;
        this.IdDatosFK = IdDatosFK;
       
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
}
