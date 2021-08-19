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

public class AsigOrdenVO {
    
    private String IdAsigOrden,CantidadPrenda,FechaInicio,FechaFin,IdDatosFK,IdOrdenFK;
    
    public AsigOrdenVO() {
    }

    public AsigOrdenVO(String IdAsigOrden, String CantidadPrenda, String FechaInicio, String FechaFin, String IdDatosFK, String IdOrdenFK) {
        this.IdAsigOrden = IdAsigOrden;
        this.CantidadPrenda = CantidadPrenda;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.IdDatosFK = IdDatosFK;
        this.IdOrdenFK = IdOrdenFK;
    }

    public String getIdAsigOrden() {
        return IdAsigOrden;
    }

    public void setIdAsigOrden(String IdAsigOrden) {
        this.IdAsigOrden = IdAsigOrden;
    }

    public String getCantidadPrenda() {
        return CantidadPrenda;
    }

    public void setCantidadPrenda(String CantidadPrenda) {
        this.CantidadPrenda = CantidadPrenda;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getIdDatosFK() {
        return IdDatosFK;
    }

    public void setIdDatosFK(String IdDatosFK) {
        this.IdDatosFK = IdDatosFK;
    }

    public String getIdOrdenFK() {
        return IdOrdenFK;
    }

    public void setIdOrdenFK(String IdOrdenFK) {
        this.IdOrdenFK = IdOrdenFK;
    }
    
    
}
