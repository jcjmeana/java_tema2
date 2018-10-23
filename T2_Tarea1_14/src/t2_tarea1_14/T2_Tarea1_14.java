/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_14;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scan.nextInt();
        System.out.println();
        
        if (num%2 == 0)
            System.out.print("El número "+num+" es par ");
        else
            System.out.print("El número "+num+" es impar ");
        
        if (num%5 == 0)
            System.out.print("y es divisible por 5.\n");
        else
            System.out.print("y no es divisible por 5.\n");
        
    }
    
}
