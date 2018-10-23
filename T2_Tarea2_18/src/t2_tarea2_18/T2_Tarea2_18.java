/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_18;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int prinum, segnum;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Introduce un número entero: ");
            prinum = scan.nextInt();
            System.out.print("Introduce otro número entero: ");
            segnum = scan.nextInt();
            if (prinum == segnum) System.out.println("Los números introducidos son incorrectos, deben ser desiguales.\n");
        } while (prinum == segnum);
        
        if (prinum > segnum) {
            int num_aux = prinum;
            prinum = segnum;
            segnum = num_aux;
        }
        
        for (int i = prinum; i<=segnum; i+=7) {
            System.out.print(i+" ");
        }
        System.out.println();
        
    }
    
}
