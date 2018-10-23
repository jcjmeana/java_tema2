/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_05;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Se va a resolver la siguiente ecuación: ax + b = 0");
        System.out.print("Introduce el valor de a: ");
        int a = scan.nextInt();
        System.out.print("Introduce el valor de b: ");
        int b = scan.nextInt();
        
        if (a == 0) {
            System.out.println("\nLa ecuación no tiene solución.");
        } else {
            int x = (-b/a);
            System.out.println("\nx es igual a "+x+".");
        }
        
    }
    
}
