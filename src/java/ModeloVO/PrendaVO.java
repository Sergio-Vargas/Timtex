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
public class PrendaVO {
    String IdPrenda;
    String ImagenPrenda;
    String NombrePrenda;
    String DescripcionPrenda;
    String PrecioPrenda;
    String EstadoPrenda;
    String IdTipoPrendaFK;

    public PrendaVO() {
    }

    public PrendaVO(String IdPrenda, String ImagenPrenda, String NombrePrenda, String DescripcionPrenda, String PrecioPrenda, String EstadoPrenda, String IdTipoPrendaFK) {
        this.IdPrenda = IdPrenda;
        this.ImagenPrenda = ImagenPrenda;
        this.NombrePrenda = NombrePrenda;
        this.DescripcionPrenda = DescripcionPrenda;
        this.PrecioPrenda = PrecioPrenda;
        this.EstadoPrenda = EstadoPrenda;
        this.IdTipoPrendaFK = IdTipoPrendaFK;
    }

    public PrendaVO(String ImagenPrenda, String NombrePrenda, String DescripcionPrenda, String PrecioPrenda, String EstadoPrenda, String IdTipoPrendaFK) {
        this.ImagenPrenda = ImagenPrenda;
        this.NombrePrenda = NombrePrenda;
        this.DescripcionPrenda = DescripcionPrenda;
        this.PrecioPrenda = PrecioPrenda;
        this.EstadoPrenda = EstadoPrenda;
        this.IdTipoPrendaFK = IdTipoPrendaFK;
    }
    public String getIdPrenda() {
        return IdPrenda;
    }

    public void setIdPrenda(String IdPrenda) {
        this.IdPrenda = IdPrenda;
    }

    public String getImagenPrenda() {
        return ImagenPrenda;
    }

    public void setImagenPrenda(String ImagenPrenda) {
        this.ImagenPrenda = ImagenPrenda;
    }

    public String getNombrePrenda() {
        return NombrePrenda;
    }

    public void setNombrePrenda(String NombrePrenda) {
        this.NombrePrenda = NombrePrenda;
    }

    public String getDescripcionPrenda() {
        return DescripcionPrenda;
    }

    public void setDescripcionPrenda(String DescripcionPrenda) {
        this.DescripcionPrenda = DescripcionPrenda;
    }

    public String getPrecioPrenda() {
        return PrecioPrenda;
    }

    public void setPrecioPrenda(String PrecioPrenda) {
        this.PrecioPrenda = PrecioPrenda;
    }

    public String getEstadoPrenda() {
        return EstadoPrenda;
    }

    public void setEstadoPrenda(String EstadoPrenda) {
        this.EstadoPrenda = EstadoPrenda;
    }

    public String getIdTipoPrendaFK() {
        return IdTipoPrendaFK;
    }

    public void setIdTipoPrendaFK(String IdTipoPrendaFK) {
        this.IdTipoPrendaFK = IdTipoPrendaFK;
    }
    
    
    
    
    
    
}
