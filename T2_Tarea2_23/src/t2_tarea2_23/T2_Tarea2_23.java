/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_23;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce números, hasta que el programa se detenga.");
        Scanner scan = new Scanner(System.in);
        
        int num, suma = 0, elementos=0;
        
        do {
            System.out.print("> ");
            num = scan.nextInt();
            suma += num;
            elementos++;
        } while (suma <= 10000);
        
        System.out.println("\nHas introducido: "+elementos+" número(s).");
        System.out.println("La suma total es: "+suma+".");
        System.out.println("La media es: "+suma/elementos+".");
        
    }
    
}
