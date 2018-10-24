/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_25;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        
        int num = scan.nextInt();
        int alreves = 0;
        
        while (num > 0) {
            alreves=(alreves*10)+(num%10);
            num /= 10;
        }
        System.out.println("\nNúmero invertido: "+alreves+".");
        
    }
    
}
