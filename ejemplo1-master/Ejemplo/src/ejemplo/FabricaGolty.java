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
public class FabricaGolty implements BalonDeFutbol {

    public Balon crearBalon() {
        Golty miGolty = new Golty();
        miGolty.setReferencia(miGolty.generarReferencia());
         System.out.println("Se ha creado un nuevo Golty  ");
        return miGolty;
    }
}
