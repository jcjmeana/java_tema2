/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_13;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducir tres números enteros:\n");
        System.out.print("Número 1: ");
        int n1 = scan.nextInt();
        System.out.print("Número 2: ");
        int n2 = scan.nextInt();
        System.out.print("Número 3: ");
        int n3 = scan.nextInt();
        
        int menor, medio, mayor;
        
        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n1 && n2 < n3) {
            menor = n2;
        } else {
            menor = n3;
        }
        
        if (n1 > n2 && n1 > n3){
            mayor = n1;
        } else if (n2 > n1 && n2 > n3){
            mayor = n2;
        } else {
            mayor = n3;
        }
        
        if ((mayor == n1 && menor == n2) || (menor == n1 && mayor == n2)){
            medio = n3;
        } else if ((mayor == n2 && menor == n3) || (menor == n2 && mayor == n3)){
            medio = n1;
        } else {
            medio = n2;
        }
        
        System.out.println("Ordenados de menor a mayor: "+menor+", "+medio+", "+mayor+".");
    }
    
}
