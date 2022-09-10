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
public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner sp = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int num1 = sp.nextInt();

        System.out.println("Ingresar segundo numero");
        int num2 = sp.nextInt();

        if (num1 > num2) {
            System.out.println("El orden es " +num2 +", " +num1);
             
        }
        else
            System.out.println("El orden es " +num1 +", " +num2);
    }
}
