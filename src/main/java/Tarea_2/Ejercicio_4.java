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
public class Ejercicio_4 {
    public static void main(String[] args) {


        Scanner sp = new Scanner(System.in);
        System.out.println("Ingreser Primer numero");
        int num1 = sp.nextInt();
        
        System.out.println("Ingresar Segundo numero");
        int num2 = sp.nextInt();
        
        System.out.println("Ingresar Tercer numero");
        int num3 = sp.nextInt();
        
        //INGRESADOS en mayor a menor ,3,2,1//
        if (num1 > num2 && num2 > num3 && num3 < num1) {
            System.out.println(num1 +", " +num2+ ", " +num3);
        } else {
            // If, si el ultimo es mayor que el medio, 3,1,2//
            if (num1 > num2 && num2 < num3 && num1 > num3) {
                System.out.println(num1 +", " +num3+ ", " +num2);
                
            } else {
                //If, si el segundo es mayor al primero, 2,3,1//
                if (num1 < num2 && num2 > num3 && num3 < num1) {
                    System.out.println(num2 +", " +num1+ ", " +num3);
                } else {
                    
//                    //If, si 2,1,3  no entiendo esta esta al reves//
                    if (num1 > num2 && num2 < num3 && num3 > num1) {
                        System.out.println(num3 +", " +num1+ ", " +num2);
                       
                    } else {
                        //If, si 1,2,3//
                        if (num1 < num2 && num2 < num3 && num3 > num1) {
                            System.out.println(num3 +", " +num2+ ", "+num1);
                        } else {
                            
                            //If, si 1,3,2//
                            if (num1 < num2 && num2 > num3 && num3 > num1) {
                                System.out.println(num2 +", " +num3+ ", " +num1);
                            } else {
                            }
                        }
                    }
                }
            }
            
        }
            
      
            
        }
        
        
        
         
            
        }
        
        
    

