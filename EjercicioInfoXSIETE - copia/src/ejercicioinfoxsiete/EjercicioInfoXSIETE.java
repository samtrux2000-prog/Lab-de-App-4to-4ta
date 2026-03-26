/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioinfoxsiete;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;
public class EjercicioInfoXSIETE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
         
        int nota;
        System.out.println("Ingrese una nota del 0 al 10");
        nota = teclado.nextInt();
        if (nota < 5) {
            System.out.println("Calificacion insuficiente");
    }else if (nota < 6) {
            System.out.println("Calificacion suficiente");
    }else if (nota < 7) {
            System.out.println("Calificacion bien");
    }else if (nota < 9) {
            System.out.println("Calificacion notable");    
    }else if (nota <= 10) {
            System.out.println("Calificacion sobresaliente");
    
    }
    }        
}