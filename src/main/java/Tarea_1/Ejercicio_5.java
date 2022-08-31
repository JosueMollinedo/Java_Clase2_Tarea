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
public class Ejercicio_5 {
    public static void main(String[] args) {
    
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese el Radio de una circunferencia");
        double radio1 = sp.nextDouble();
        double diametro1 = 2* Math.PI *radio1;
        double area1 = Math.PI * (radio1*radio1);
       
        
        System.out.println("El Diametro del circulo es " +diametro1);
        System.out.println("El Area del circulo es " +area1);
       
        
        
        
    }
    
    
}
