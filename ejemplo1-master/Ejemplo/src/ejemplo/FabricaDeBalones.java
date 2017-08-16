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
public class FabricaDeBalones {
    
 public static void crearFabricaDeBalon(BalonDeFutbol factory){
  /**Aplicamos Polimorfismo*/
  Balon objetoBalon= factory.crearBalon();
  objetoBalon.marcaDeBalon();
 }

}
