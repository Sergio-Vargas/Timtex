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
public class TipoPrendaVO {
    
    private String IdTipoPrenda,NombreTipoPrenda;

    public TipoPrendaVO() {
    }

    public TipoPrendaVO(String IdTipoPrenda, String NombreTipoPrenda) {
        this.IdTipoPrenda = IdTipoPrenda;
        this.NombreTipoPrenda = NombreTipoPrenda;
    }

    public String getIdTipoPrenda() {
        return IdTipoPrenda;
    }

    public void setIdTipoPrenda(String IdTipoPrenda) {
        this.IdTipoPrenda = IdTipoPrenda;
    }

    public String getNombreTipoPrenda() {
        return NombreTipoPrenda;
    }

    public void setNombreTipoPrenda(String NombreTipoPrenda) {
        this.NombreTipoPrenda = NombreTipoPrenda;
    }
    
}
