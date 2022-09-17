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
public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner sp = new Scanner(System.in);

        System.out.println("Introduzca un numero");

        int num = sp.nextInt();

        while (num != 0) {

            if (num % 2 == 0) {

                System.out.println(num + " es numero par");

                System.out.println("Introduzca otro numero");
                int num2 = sp.nextInt();

                if (num2 % 2 == 0) {

                    System.out.println(num2 + " es numero par");

                }

            } else {
                System.out.println(num + " es numero impar");
                System.out.println("Introduzca otro numero");
                
                break;

               
            }
            if (num == 0) {
                break;

            }

        }

    }
}
