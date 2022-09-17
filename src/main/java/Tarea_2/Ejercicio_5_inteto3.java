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
public class Ejercicio_5_inteto3 {
    public static void main(String[] args) {
        
        
        Scanner sp = new Scanner(System.in);
        
        System.out.println("Ingrese un numero de día");
        int dia = sp.nextInt();
        
        
        System.out.println("Ingrese un numero de mes");
        int mes = sp.nextInt();
        
        
        System.out.println("Ingrese un numero de año");
        int año = sp.nextInt();
        
        
        if (año > 0 && año < 2022) {
            
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
                
                if (dia > 0 && dia <= 31) {
                    System.out.println("Fecha ingresada es correcta dia: " +dia+ " mes: " +mes+ " año: " +año );
                    

                }
                else if (mes == 2) {
                    
                    if (dia > 0 && dia <=28) {
                        System.out.println("Fecha ingresada es correcta: " +dia+ " mes: " +mes+ " año: " +año );
                        
                    }
                    
                    else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
                        
                        
                        
                        if (dia > 0 && dia <= 30) {
                            System.out.println("Fecha ingresada es correcta: " +dia+ " mes: " +mes+ " año: " +año);
                            
                          
                            
                        }
                        
                    }else{
                        System.out.println("Fecha ingresada incorrecta");
                    }
                }
                
                
                
                
            }
           
            
        }else{
            
            System.out.println("Año incorrecto");
            
        }
    }
    
}
