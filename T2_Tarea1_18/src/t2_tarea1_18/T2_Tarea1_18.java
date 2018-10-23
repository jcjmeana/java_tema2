/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_18;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author acer
 */
public class T2_Tarea1_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Número entero de 5 cifras como máximo: ");
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        boolean valido = false;
        int cifra = 0;
        
        if (num < 10) {
            cifra = num;
            valido = true;
        } else if (( num >= 10 ) && (num < 100)){
            cifra = num / 10;
            valido = true;
        } else if ((num >= 100) && (num < 1000)){
            cifra = num / 100;
            valido = true;
        } else if ((num >= 1000) && (num < 10000)){
            cifra = num / 1000;
            valido = true;
        } else if (num >= 10000 && num <= 99999){
            cifra = num / 10000;
            valido = true;
        }
        
        if (valido) {
            System.out.println("\nLa primera cifra del número "+num+" es el "+cifra+".");
        } else {
            System.out.println("\nEl número introducido es incorrecto.");
        }
        
    }
    
}
