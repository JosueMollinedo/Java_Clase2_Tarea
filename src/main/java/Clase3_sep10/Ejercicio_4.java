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
public class Ejercicio_4 {public static void main(String[] args) {
        
            Scanner sp = new Scanner(System.in);
            
            System.out.println("---Adivina el numero---");
            int ingresado = sp.nextInt();
            
            int num = 502;
            
            while (ingresado != num) {

                if (ingresado > num) {
                    
                    System.out.println("El numero ingresado es mayor");
                    
                    break;
                     
                }else{
                    System.out.println("El numero igresado es menor");
                }
               
                if (ingresado == num) {
                    
                    break;
                    
                }
 
            }
                   
    }
    
}
