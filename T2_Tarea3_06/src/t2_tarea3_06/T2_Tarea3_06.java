/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_06;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea3_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int intentos = 5;
        int num;
        boolean acertado = false;
        int misterio = (int)(Math.random() * 101);
        
        System.out.println("Pienso un número del 0 al 100, intenta adivinarlo. Tienes 5 intentos.");
        
        do {
            System.out.print("Introduce un número: ");
            num = scan.nextInt();
            intentos--;
            if ( (num > misterio) && (intentos > 0) ){
                System.out.println("El número que estoy pensando es menor que " + num);
                System.out.println("Te quedan "+intentos+" intentos.");
            }
            if ( (num < misterio) && (intentos > 0) ){
                System.out.println("El número que estoy pensando es mayor que " + num);
                System.out.println("Te quedan "+intentos+" intentos.");
            }
            if (num == misterio) {
                acertado = true;
                System.out.println("\n¡Enhorabuena! ¡Has acertado!");
            }
        } while (!acertado && (intentos > 0));
        
        if (!acertado)
            System.out.println("\nLo siento, no has acertado, el número que estaba pensando era el "+misterio+".");
    }
    
}
