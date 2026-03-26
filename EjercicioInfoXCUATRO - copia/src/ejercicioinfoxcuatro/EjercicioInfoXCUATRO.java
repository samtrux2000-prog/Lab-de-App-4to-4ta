/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioinfoxcuatro;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;
public class EjercicioInfoXCUATRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner teclado = new Scanner(System.in);
      
       System.out.println ("Escribir el primer numero = ");
       
         int num1  = teclado.nextInt();

         if (num1 % 3 ==0){
             if (num1% 5 ==0){
                 System.out.println ("El numero es multiplo de 3 y 5");
                         }else
                 System.out.println ("El numero no es multiplo de 5");
             }else{
                     System.out.println ("El numero no es multiplo de 3");
             }
         }
    
    
}
