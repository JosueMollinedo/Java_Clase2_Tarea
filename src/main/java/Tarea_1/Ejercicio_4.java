/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_1;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner sp = new Scanner (System.in);
        System.out.println("Ingrese grados centrigrados");
        int grados1 = sp.nextInt();
        int conver1 = (grados1/5*9)+32;
        
        System.out.println("La convercion a Fahrenheit es " +conver1);
        
        
           
    }
    
}
