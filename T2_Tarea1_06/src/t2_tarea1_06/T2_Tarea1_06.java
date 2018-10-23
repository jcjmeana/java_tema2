/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_06;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cod e application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduc una altura h (en metros): ");
        double h = scan.nextDouble();
        double g = 9.81;
        double t = Math.sqrt(2*h*g);
        if (h < 0)
            System.out.println("Error: La altura h no puede ser negativa.");
        else
            System.out.println("Tiempo que tarda en caer: "+t+" segundos.");
    }
    
}
