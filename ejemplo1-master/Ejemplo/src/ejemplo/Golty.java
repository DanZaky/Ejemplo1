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
public class Golty implements Balon{
    private String referencia;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    @Override
    public String generarReferencia(){
        String referenciaGolty = "Tuchin";
        
        return referenciaGolty;
    }

    @Override
    public void marcaDeBalon() {
       System.out.println("La referencia del balon es tuchin");
    }
    
    
}
