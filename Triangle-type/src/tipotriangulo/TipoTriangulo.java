/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipotriangulo;

import java.util.Scanner;

/**
 *
 * @author Y.Morales
 */
public class TipoTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo(args);
    }

    public static void Triangulo(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.print("Digite el primer lado:");
        num1 = numero.nextInt();

        System.out.print("Digite el segundo lado :");
        num2 = numero.nextInt();

        System.out.print("Digite el tercer lado :");
        num3 = numero.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("El triangulo es Equilatero");
        } else {
            if (num1==num2 || num1==num3 || num3==num2){
                System.out.println("El triangulo es Isoseles");
                
            }else{
                if(num1 != num2 || num1!=num3 || num3!= num2){
                 System.out.println("El triangulo es Escaleno");   
                }
            }
        }
    }
}
