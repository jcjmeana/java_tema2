/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_08;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tablas de múltiplicar.\n");
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Número: ");
        int num = scan.nextInt();
        
        System.out.println();
        for (int i = 0; i<=10; i++){
            System.out.println(num+"x"+i+" = "+(num*i));
        }
    }
    
}
