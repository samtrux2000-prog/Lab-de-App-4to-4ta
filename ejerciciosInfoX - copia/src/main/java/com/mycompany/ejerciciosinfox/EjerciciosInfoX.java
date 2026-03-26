/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosinfox;

/**
 *
 * @author Alumno
 */
 import java.util.Scanner;

public class EjerciciosInfoX {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese el primer número:");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        num2 = teclado.nextInt();
        
        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números no son iguales.");
        }
        
    }
}
