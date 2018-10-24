/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_29;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número entero grande: ");
        int grande = scan.nextInt();
        System.out.print("Introduce un número entero pequeño: ");
        int pequeño = scan.nextInt();
        
        System.out.println("\nLos numeros menores que "+grande+" y que no son divisibles"
                + " entre "+pequeño+" son:");
        
        for (int i = 1; i < grande; i++) {
            if ((i % pequeño) != 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
}
