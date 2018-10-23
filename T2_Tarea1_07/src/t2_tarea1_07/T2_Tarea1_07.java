/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_07;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Introduce una segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.print("Introduce una última nota: ");
        double nota3 = scan.nextDouble();
        
        if (nota1 < 0 || nota2 < 0 || nota3 < 0 || nota1 > 10 || nota2 > 10 || nota3 > 10)
            System.out.println("Una de las notas está mal introducida.");
        else
            System.out.println("Nota Media: "+((nota1+nota2+nota3)/3));
    }
    
}
