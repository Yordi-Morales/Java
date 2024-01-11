/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edadactual;

import java.util.Scanner;

/**
 *
 * @author Y.Morales
 */
public class EdadActual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Edad(args);
    }

    public static void Edad(String[] args) {
        Scanner numero = new Scanner(System.in);
        int fecha = 0;
        int cumpleaños= 0;
        int edad = 0;
        int año = 2020;
        int comparacion = 0;
        
        
        System.out.print("Digite el año de su nacimiento:");
        fecha = numero.nextInt();

        System.out.print("¿Ya cumpliste años?(0 para no y 1 para si)");
        cumpleaños = numero.nextInt();

        if (cumpleaños == comparacion) {
            edad = año-fecha- 1;
            System.out.println("La edad actual es de " + edad+" años");
        } else {
            edad = año+1 - fecha ;
            System.out.println("La edad actual es de " + edad+" años");
        }
    }
}
