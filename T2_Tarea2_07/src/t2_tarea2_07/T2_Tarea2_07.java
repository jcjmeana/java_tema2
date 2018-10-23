/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_07;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Caja Fuerte.\n");
        Scanner scan = new Scanner(System.in);
        
        int intento = 1;
        String combinacion = "0246";
        
        System.out.print("Combinación: ");
        String introducir = scan.next();
        
        while (!introducir.equals(combinacion) && intento < 4){
            intento++;
            System.out.println("Lo siento, combinación incorrecta.");
            System.out.print("Combinación: ");
            introducir = scan.next();
        }
        
        if (introducir.equals(combinacion)){
            System.out.println("\nLa caja fuerte se ha abierto satisfactoriamente.");
        } else {
            System.out.println("\nMáximos intentos superados, caja fuerte bloqueada.");
        }
    }
    
}
