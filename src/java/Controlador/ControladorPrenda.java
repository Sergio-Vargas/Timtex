/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.PrendaDAO;
import ModeloVO.PrendaVO;

/**
 *
 * @author sergio saenz
 */
public class ControladorPrenda {
    
    public String consultarDatos(){
        PrendaDAO PreDAO = new PrendaDAO();//dao
        String htmlcode = "";
        for(PrendaVO PreVO : PreDAO.listar()){//vo
            htmlcode += "<div class=\"col-sm-4\">\n" +
"							<div class=\"product-image-wrapper\">\n" +
"								<div class=\"single-products\">\n" +
"									<div class=\"productinfo text-center\">\n" +
"										<img src=\""+PreVO.getImagenPrenda()+"\" alt=\"\" />\n" +
"																			</div>\n" +
"									<div class=\"product-overlay\">\n" +
"										<div class=\"overlay-content\">\n" +
"                                                                               <h2>"+PreVO.getNombrePrenda()+"</h2>\n" +
"										<p>"+PreVO.getDescripcionPrenda()+"</p>\n" +
"										</div>\n" +
"									</div>\n" +
"								</div>\n" +
"                                                                <form>\n"+
"                                                              </form>\n"+
"                                                                <form method=\"post\" action=\"Prenda\">\n"+
"                                                                <input type=\"hidden\" name=\"textIdPrenda\" value=\""+PreVO.getIdPrenda()+"\">\n"+
"                                                                <button class=\"btn btn-default add-to-cart\">Ver detalles</button>\n"+
"                                                                <input type=\"hidden\" value=\"4\" name=\"opcion\">\n"+
"                                                                </form>\n"+

"							</div>\n" +
"						</div>";
        }        
        return htmlcode;        
    }
    
    
    public PrendaVO consultarDatos(String IdPrenda){
        return new PrendaDAO().consultarDatos(IdPrenda);
    }
    
}
