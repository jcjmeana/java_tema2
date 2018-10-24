/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_28;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int num = -1;
        do {
            System.out.print("Introduce un número entero: ");
            num = scan.nextInt();
            if (num < 0) {
                System.out.println("El número introducido es incorrecto.");
            }
        } while (num < 0);
        
        int factorial = num;
        
        if (num == 0) {
            System.out.println("0!=1");
        } else {
            for (int i = 1; i < num; i++) {
                factorial *= i;
            }
            System.out.println(num+" != "+factorial);
        }
        
    }
    
}
