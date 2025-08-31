/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        //calcular decimales
        Scanner myObj = new Scanner(System.in); // crear objeto tipo scanner, myObj nombre variable para usarlo despues
        System.out.println("Ingrese el primer numero: ");
        double a = myObj.nextDouble(); // pedir flotante a
        System.out.println("Ingrese el segundo numero: ");
        double b = myObj.nextDouble(); // pedir flotante b
        System.out.println("Ingrese la opcion desea: "); // menu principal
        System.out.println("---Menu principal---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = myObj.nextInt();
        
        double resultado = 0;
        if (opcion == 1) {
            resultado = a + b;
        }else if (opcion == 2) {
            resultado = a - b;
        }else if (opcion == 3) {
            resultado = a * b;
        }else if (opcion == 4) {
            if (b == 0) {
                resultado = 0;
            }else {
                resultado = a / b;
            }
        }else {
            System.out.println("Ingrese una opcion valida");
        }
        System.out.println("El resultado es: " + resultado);
        
    }    
}
