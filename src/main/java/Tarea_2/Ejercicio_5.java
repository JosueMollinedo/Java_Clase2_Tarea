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
public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner sp = new Scanner(System.in);

        System.out.println("ingresa el numero de un dia");
        int dia = sp.nextInt();

        

        
          //mes//switch// 
        System.out.println("Ingrese el numero del mes");
        int mes = sp.nextInt();
        
      
        switch (mes) {
            case 1:
                System.out.println("Mes ingresado Enero");
                break;
            case 2:
                System.out.println("Mes ingresado Febrero");
                break;
            case 3:
                System.out.println("Mes ingresado Marzo");
                break;
            case 4:
                System.out.println("Mes ingresado Abril");
                break;
            case 5:
                System.out.println("Mes ingresado Mayo");
                break;
            case 6:
                System.out.println("Mes ingresado Junio");
                break;
            case 7:
                System.out.println("Mes ingresado Julio");
                break;
            case 8:
                System.out.println("Mes ingresado Agosto");
                break;
            case 9:
                System.out.println("Mes ingresado Septiembre");
                break;
            case 10:
                System.out.println("Mes ingresado Octubre");
                break;
            case 11:
                System.out.println("Mes ingresado Noviembre");
                break;
            case 12:
                System.out.println("Mes ingresado Diciembre");
                break;

            default:
                throw new AssertionError("Mes invalido");
        }
        
        
        
        //año//
        
        System.out.println("Ingrese el año");
        int año = sp.nextInt();

        //año//
        if (año < 2023 && año > 0) {

        } else {
            System.out.println("Año incorrecto");
        }
        
        


    }

}
