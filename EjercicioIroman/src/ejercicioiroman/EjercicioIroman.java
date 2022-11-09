/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioiroman;

import java.util.Scanner;

/**
 *
 * @author maida
 */
public class EjercicioIroman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
        try {
            System.out.print("Ingrese 1 numero ");
            a = leer.nextInt();
            System.out.print("Ingrese 2 numero ");
            b = leer.nextInt();
        } catch (Exception e) {
            System.out.println("no es un numero");
        }
        
        System.out.println("Hola sigo aca");

    }

}
