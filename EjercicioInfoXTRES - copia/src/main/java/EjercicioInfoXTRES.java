/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Alumno
 */
import java.util.Scanner;

public class EjercicioInfoXTRES {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
        System.out.println("ingrese un numero");
        num2 = teclado.nextInt();
        
        int cifra1 = num1%10;
        int cifra2 = num2%10;
        
          if (cifra1 == cifra2)      
          { System.out.println("Las ultimas cifras son iguales");
        } else 
          System.out.println("Las ultimas cifras no son iguales");
    } 
}

