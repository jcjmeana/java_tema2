/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_19;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_19 {

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
        
        int planta = 1;
        int longitud = 1;
        int espacio = altura-1;
        
        while (planta<=altura) {
            for (int i = 1; i<= espacio; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i<=longitud; i++) {
                System.out.print(forma);
            }
            
            System.out.println();
            planta++;
            espacio--;
            longitud += 2;
        }
        
    }
    
}
