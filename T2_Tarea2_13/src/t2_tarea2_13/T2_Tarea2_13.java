/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_13;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca 10 números enteros:");
        
        int negativo = 0;
        int positivo = 0;
        for (int i = 1; i<=10; i++){
            System.out.print("> ");
            int num = scan.nextInt();
            if (num < 0)
                negativo++;
            else
                positivo++;
        }
        
        System.out.println("\nHay "+positivo+" número(s) positivo(s) y"
                + " "+negativo+" número(s) negativo(s).");
    }
    
}
