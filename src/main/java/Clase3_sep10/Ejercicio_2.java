/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase3_sep10;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Ejercicio_2 {public static void main(String[] args) {
        
            Scanner sp = new Scanner(System.in);
            
            System.out.println("Ingrese un numero");
            int num1 = sp.nextInt();
            
            if (num1 >= 0) {
                System.out.println("El numero es positivo");
                
            } else {
                System.out.println("El numero es negativo");
            }
            
            
            while (num1 != 0) {
                
                System.out.println("Ingrese otro numero");
                int num2 = sp.nextInt();
                
                if (num2 >= 0) {
                System.out.println("El numero es positivo");
                
            } else {
                System.out.println("El numero es negativo");
                
                
            }
                
                if (num2 == 0) {
                    break;
                    
                }
           
    
    }

            
}

}