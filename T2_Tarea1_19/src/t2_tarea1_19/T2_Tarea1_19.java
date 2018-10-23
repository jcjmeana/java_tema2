/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_19;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Introduce un número entero positivo o negativo:");
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int digitos = 0;
        boolean valido = false;
        
        if (num < 10) {
            digitos = 1;
            valido = true;
        } else if ((num >= 10) && (num < 100)) {
            digitos = 2;
            valido = true;
        } else if ((num >= 100 ) && (num < 1000)) {
            digitos = 3;
            valido = true;
        } else if ((num >= 1000) && (num < 10000)) {
            digitos = 4;
            valido = true;
        } else if (num >= 10000 && num <= 99999) {
            digitos = 5;
            valido = true;
        }
        
        if (valido)
            System.out.println("El número "+num+" tiene "+digitos+" dígito(s).");
        else
            System.out.println("El número introducido es demasiado largo.");
        
    }
    
}
