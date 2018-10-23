/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_17;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        try {
        int numero = scan.nextInt();
        System.out.println("La última cifra del número "+numero+" es el " + (numero % 10)+".");
        } catch (InputMismatchException e){
            System.out.println("El número introducido es incorrecto.");
        }
    }
    
}
