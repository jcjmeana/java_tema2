/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_09;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número para a: ");
        double a = scan.nextDouble();
        System.out.print("Introduce un número para b: ");
        double b = scan.nextDouble();
        System.out.print("Introduce un número para c: ");
        double c = scan.nextDouble();
        
        System.out.println();
        double raizEcuacion = (b*b)-4*a*c;
        double resultado1 = (-b+Math.sqrt(raizEcuacion))/(2*a);
        double resultado2 = (-b-Math.sqrt(raizEcuacion))/(2*a);
        
        if (a == 0) {
            if (b == 0){
                System.out.println("Esta ecuación no tiene resultado,"
                        + " porque no se puede dividir entre 0.");
            } else {
                System.out.println("Resultado: "+(-c/b));
            }
        } else if (raizEcuacion < 0) {
            System.out.println("Esta ecuación no tiene resultado,"
                    + " porque la raíz cuadrada es negativa.");
        } else {
            System.out.println("Resultado 1: "+resultado1);
            System.out.println("Resultado 2: "+resultado2);
        }
    }
    
}
