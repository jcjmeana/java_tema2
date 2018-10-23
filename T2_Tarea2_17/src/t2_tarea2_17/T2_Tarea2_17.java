/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_17;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0, num = 0;
        do {
            System.out.print("Introduzca un número entero positivo: ");
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();
            if(num < 0)
                System.out.println("El número introducido es incorrecto..");
        } while (num < 0);
        for(int i = num; i<num + 100; i++) {
            suma+=i;
        }
        System.out.println("\nLa suma de los 100 números siguientes a "+num+" es: "+suma+".");
    }
    
}
