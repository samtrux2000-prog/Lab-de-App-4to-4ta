/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioinfoxseis;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;
public class EjercicioInfoXSEIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = teclado.nextInt();
          System.out.println("Ingrese un numero");
        int num2 = teclado.nextInt();
          System.out.println("Ingrese un numero");
        int num3 = teclado.nextInt();
        
        int mayor = num1;
        if (mayor < num2)
            mayor = num2;
        if (mayor < num3);
            mayor = num3;
            System.out.println ("El numero mayor es "+ mayor);
    }
}



        
    


    
    
                
