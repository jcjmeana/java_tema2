/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_11;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = scan.nextInt();
        System.out.println();
        
        int contador = 1;
        for (int i = num+1; contador<=5; i++){
            contador++;
            System.out.println(i+"\t"+(i*i)+"\t"+(i*i*i));
        }
    }
    
}
