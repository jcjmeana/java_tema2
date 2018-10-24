/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_21;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce los números enteros que quieras,\npara detener la introducción inserte un número negativo.");

        Scanner scan = new Scanner(System.in);
        
        int numero, sumaimpar=0, elementos=0, impares=0, maxpar=0;
        
        do {
            System.out.print("> ");
            numero = scan.nextInt();
            if (numero >= 0) {
                elementos++;
                if ((numero % 2) == 1) {
                    sumaimpar += numero;
                    impares++;
                } else {
                    if (numero > maxpar)
                    maxpar = numero;
                }
            }
        } while (numero >= 0);
        
        System.out.println();
        System.out.println("Ha introducido: "+elementos+" número(s).");
        System.out.println("La media de los impares es: "+sumaimpar/impares+".");
        System.out.println("El máximo de los pares es: "+maxpar+".");
        
    }
    
}
