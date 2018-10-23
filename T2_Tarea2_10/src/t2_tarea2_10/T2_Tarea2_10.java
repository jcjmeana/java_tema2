/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_10;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce números positivos para calcular la media."
                + "\nPara finalizar la introducción, escriba un número negativo.\n");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("> ");
        double num = scan.nextDouble();
        System.out.println();
        
        int i = 0;
        double introducido;
        do {
            i++;
            System.out.print("> ");
            introducido = scan.nextDouble();
            if (introducido >= 0) num += introducido;
            System.out.println();
        } while (introducido >= 0);
        
        System.out.println("La media es: "+(num/i));
    }
    
}
