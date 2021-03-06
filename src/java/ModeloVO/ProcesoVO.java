/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author sara gabriela
 */
public class ProcesoVO {
        private String IdProceso,DescripcionProceso,FechaProceso,HoraInicio,HoraFin,
                PrendasRealizadas,EstadoProceso,IdAsigOrdenFK;
        
        public ProcesoVO() {
        
        }

    public ProcesoVO(String IdProceso, String DescripcionProceso, String FechaProceso, String HoraInicio, String HoraFin, String PrendasRealizadas, String EstadoProceso, String IdAsigOrdenFK) {
        this.IdProceso = IdProceso;
        this.DescripcionProceso = DescripcionProceso;
        this.FechaProceso = FechaProceso;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
        this.PrendasRealizadas = PrendasRealizadas;
        this.EstadoProceso = EstadoProceso;
        this.IdAsigOrdenFK = IdAsigOrdenFK;
    }

    public String getIdProceso() {
        return IdProceso;
    }

    public void setIdProceso(String IdProceso) {
        this.IdProceso = IdProceso;
    }

    public String getDescripcionProceso() {
        return DescripcionProceso;
    }

    public void setDescripcionProceso(String DescripcionProceso) {
        this.DescripcionProceso = DescripcionProceso;
    }

    public String getFechaProceso() {
        return FechaProceso;
    }

    public void setFechaProceso(String FechaProceso) {
        this.FechaProceso = FechaProceso;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String HoraFin) {
        this.HoraFin = HoraFin;
    }

    public String getPrendasRealizadas() {
        return PrendasRealizadas;
    }

    public void setPrendasRealizadas(String PrendasRealizadas) {
        this.PrendasRealizadas = PrendasRealizadas;
    }

    public String getEstadoProceso() {
        return EstadoProceso;
    }

    public void setEstadoProceso(String EstadoProceso) {
        this.EstadoProceso = EstadoProceso;
    }

    public String getIdAsigOrdenFK() {
        return IdAsigOrdenFK;
    }

    public void setIdAsigOrdenFK(String IdAsigOrdenFK) {
        this.IdAsigOrdenFK = IdAsigOrdenFK;
    }

}
