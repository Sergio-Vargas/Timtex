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
    private String IdPrenda,ImagenPrenda,NombrePrenda,Talla,DescripcionPrenda,EstadoPrenda,IdTipoPrendaFK;

    public PrendaVO() {
    }

    public PrendaVO(String IdPrenda, String ImagenPrenda, String NombrePrenda, String Talla, String DescripcionPrenda, String EstadoPrenda, String IdTipoPrendaFK) {
        this.IdPrenda = IdPrenda;
        this.ImagenPrenda = ImagenPrenda;
        this.NombrePrenda = NombrePrenda;
        this.Talla = Talla;
        this.DescripcionPrenda = DescripcionPrenda;
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

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getDescripcionPrenda() {
        return DescripcionPrenda;
    }

    public void setDescripcionPrenda(String DescripcionPrenda) {
        this.DescripcionPrenda = DescripcionPrenda;
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
