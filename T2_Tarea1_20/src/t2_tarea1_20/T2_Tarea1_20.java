/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_20;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Número entero positivo de 5 cifras como máximo: ");
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        boolean capicua = false;
        
        if (num < 10) {
            capicua = true;
        } else if ((num >= 10) && (num < 100)) {
            if ((num / 10) == (num % 10)) {
                capicua = true;
            }
        } else if ((num >= 100) && (num < 1000)) {
            if ((num / 100) == (num % 10)) {
                capicua = true;
            }
        } else if ((num >= 1000) && (num < 10000)) {
            if (((num / 1000) == (num % 10)) && (((num / 100 ) % 10)== ((num / 10) % 10))) {
                capicua = true;
            }
        } else if (num >= 10000 && num <= 99999) {
            if (((num / 10000) == (num % 10) ) && ((((num / 1000) % 10)) == ((num / 10) % 10))) {
                capicua = true;
            }
        } else if (num >= 100000) {
            System.out.println("El número es demasiado largo.");
            System.exit(0); /* Número demasiado largo, se cierra el programa */
        }
        
        System.out.println();
        if (capicua) {
            System.out.println("El número "+num+" es capicúa.");
        } else {
            System.out.println("El número "+num+" no es capicúa.");
        }
        
    }
    
}
