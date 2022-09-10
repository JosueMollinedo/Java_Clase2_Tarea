/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_2;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Ejercicio_5_Intento2 {
    public static void main(String[] args) {
        
        Scanner sp = new Scanner(System.in);
        
        //intro//
        System.out.println("Ingresar una fecha");
       
       
        System.out.println("Ingresa el dia en numeros");
        int dia = sp.nextInt();
        
       
        System.out.println("Ingresa el numero del mes");
        int mes = sp.nextInt();
        
        
        System.out.println("Ingresa el año");
        int año = sp.nextInt();
        
        
        
        
        if (dia < 31 && dia > 0) {
            
        } else {
            System.out.println("Numero incorrecto");
            
        }
        
        if (mes < 13 && mes > 0) {
            
        } else {
            System.out.println("Numero de mes incorrecto");
        }
                
        if (año < 2023 && año > 0) {
            
        } else {
            System.out.println("Año incorrecto");
        }
        
        
            
        }
    }
    
}
