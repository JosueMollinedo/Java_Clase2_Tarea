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
public class Ejercicio_1_int2 {
    public static void main(String[] args) {
        
        Scanner sp = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = sp.nextInt();
        int pote = num*num;
        
        System.out.println("El cuadrado del numero es: " +pote);
        
        
        
        while (num > 0) {
            System.out.println("Ingrese otro numero");
            int num2 = sp.nextInt();
            int pote2 = num2*num2;
            System.out.println("El cuadrado del numero es: " +pote2);
            if (num2 < 0) {
                break;
                
            }
            
        }
        
        
                
                 
        
       
    }
    
}
