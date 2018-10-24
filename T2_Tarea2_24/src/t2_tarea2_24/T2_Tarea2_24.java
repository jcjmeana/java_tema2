/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_24;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide: ");
        int alturaInt = scan.nextInt();
        
        int altura = 1;
        
        while (altura <= alturaInt) {
            for (int i = 1; i<altura; i++) {
                System.out.print(i);
            }
            for (int i = altura; i>0; i--) {
                System.out.print(i);
            }
            
            System.out.println();
            altura++;
        }
        
    }
    
}
