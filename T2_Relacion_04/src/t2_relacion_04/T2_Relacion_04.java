/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_relacion_04;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Relacion_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducir tres números enteros:\n");
        System.out.print("Número a: ");
        int a = scan.nextInt();
        System.out.print("Número b: ");
        int b = scan.nextInt();
        System.out.print("Número c: ");
        int c = scan.nextInt();
        
        int menor, medio, mayor;
        
        if (a < b && a < c) {
            menor = a;
        } else if (b < a && b < c) {
            menor = b;
        } else {
            menor = c;
        }
        
        if (a > b && a > c){
            mayor = a;
        } else if (b > a && b > c){
            mayor = b;
        } else {
            mayor = c;
        }
        
        if ((mayor == a && menor == b) || (menor == a && mayor == b)){
            medio = c;
        } else if ((mayor == b && menor == c) || (menor == b && mayor == c)){
            medio = a;
        } else {
            medio = b;
        }
        
        System.out.println("\nOrdenados de menor a mayor: "+menor+", "+medio+", "+mayor+".");
        
    }
    
}
