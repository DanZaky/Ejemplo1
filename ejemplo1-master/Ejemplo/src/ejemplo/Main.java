/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author Daniel Mesa
 */
public class Main {

    public static void main(String[] args) {
        FabricaAdidas adidas = new FabricaAdidas();
        FabricaGolty golty = new FabricaGolty();

        System.out.println("Ingrese la marca de balón");
        System.out.println("1. Adidas");
        System.out.println("2. Golty");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                FabricaDeBalones.crearFabricaDeBalon(adidas);
                break;
            case 2:
                FabricaDeBalones.crearFabricaDeBalon(golty);
                break;
           
            default:
                System.out.println("No es un valor valido");
                break;
        }
    }
}
