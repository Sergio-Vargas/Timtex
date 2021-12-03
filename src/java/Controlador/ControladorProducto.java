/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloVO.Producto;
import ModeloDAO.ModeloProducto;

/**
 *
 * @author Jonathan
 */
public class ControladorProducto {

    public String getProductos() {
        ModeloProducto mp = new ModeloProducto();
        String htmlcode = "";
        for (Producto producto : mp.getAllProductos()) {
            htmlcode
                    += 
                   
                    "<div class=\"col-md-6 col-lg-4\">\n"
                    + "<div class=\"snip1492 card shadow\">\n"
                    + "<img src=\"Imagenes/"+ producto.getImg() + "\" width=\"440px\" height=\"350px\" alt=\"sample85\" />\n"
                    + "<div class=\"figcaption\">\n"
                    + "<h3>" + producto.getNombre() + "</h3>\n"
                    + "<p>" + producto.getDescripcionPrenda() + "</p>\n"
                    + "<div class=\"price\">\n"
                    + "$" + producto.getPrecio() + "\n"
                    + "</div>\n"
                    + "</div>\n"
                    + "<i class=\"ion-ios-cart\"></i>\n"
                    + "<a href=\"product-details.jsp?id=" + producto.getId() + "\"></a>\n"
                    + "</div>\n"
                    + "</div>\n";
       
            
        }
        return htmlcode;
    }

    public Producto getProducto(int id) {
        return new ModeloProducto().getProducto(id);
    }
}
