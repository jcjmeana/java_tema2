/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_20;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca una altura para la pirámide: ");
        int altura = scan.nextInt();
        System.out.print("Introduzca el carácter para la forma: ");
        String forma = scan.next();
        
        int altura_pir = 1;
        int fuera = altura - 1;
        int dentro = 0;
        
        while (altura_pir < altura) {
            for (int i = 1; i<=fuera; i++) {
                System.out.print(" ");
            }
            System.out.print(forma);
            for (int i = 1; i< dentro; i++) {
                System.out.print(" ");
            }
            if (altura_pir>1) {
                System.out.print(forma);
            }
            System.out.println();
            altura_pir++;
            fuera--;
            dentro += 2;
        }
        
        for (int i = 1; i<altura_pir*2; i++) {
            System.out.print(forma);
        }
        System.out.println();
        
    }
    
}
