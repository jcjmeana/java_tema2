/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_27;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Introduzca un número mayor que 1: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        while (num <= 1){
            System.out.print("Introduzca un número mayor que 1: ");
            num = scan.nextInt();
        }
        
        int contador = 0;
        int suma = 0;
        System.out.print("Números: ");
        
        for (int i = 1; i < num; i++) {
            if ((i % 3) == 0) {
                System.out.print(i + " ");
                contador++;
                suma += i;
            }
        }
        
        if (suma == 0){
            System.out.print("\"No hay números.\"\n");
        }
        
        System.out.println("\nDesde 1 hasta "+num+" hay "+contador+" múltiplos de 3 y suman: "+suma+".");
        
    }
    
}
