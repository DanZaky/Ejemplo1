/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author Daniel Mesa
 */
public class FabricaAdidas implements BalonDeFutbol {

    public Balon crearBalon() {
        Adidas miAdidas = new Adidas();
        miAdidas.setReferencia(miAdidas.generarReferencia());
         System.out.println("Se ha creado un nuevo Adidas  ");
        return miAdidas;
    }
}
