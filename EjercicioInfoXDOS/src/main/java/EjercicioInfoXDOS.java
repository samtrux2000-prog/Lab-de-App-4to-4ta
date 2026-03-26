/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Alumno
 */
 import java.util.Scanner;

public class EjercicioInfoXDOS {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese un Numero");
        num1 = teclado.nextInt();
        
        System.out.println("ingrese otro Numero");
        num2 = teclado.nextInt();
        
         if (num1 > num2) {
            System.out.println("el mayor es"+ num1);
        } else {
            System.out.println("el mayor es"+ num2);
}
    }
}
