/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_09;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Número: ");
        
        int digitos = 1, i;
        boolean negativo = false;
        
        try {
            int num = scan.nextInt();
            
            if (num < 0) {
                num=-num;
                negativo = true; /*Si es negativo lo pasamos a positivo para que funcione el programa */
            }
            
            i = num;
            while (i >= 10) {
                i /= 10;
                digitos++;
            }
            
            if (negativo)
                System.out.println("\n"+(-num)+" tiene "+digitos+" dígito(s).");
            else
                System.out.println("\n"+num+" tiene "+digitos+" dígito(s).");
            
        } catch (Exception e) {
            System.out.println("\nEl número introducido es incorrecto.");
        }
    
    }
    
}
