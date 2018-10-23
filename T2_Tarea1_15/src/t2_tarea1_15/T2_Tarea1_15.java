/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_15;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número, una letra o un símbolo "
                + "para realizar una pirámide: ");
        String simbolo = scan.next();
        if (simbolo.length() == 0  || simbolo.length() > 1) {
            System.out.println("Error: Por favor, introduce un único carácter.");
        } else {
            System.out.print("\nHorientación de la pirámide:"
                    + "\n[1] Arriba\n[2] Abajo\n[3] Izquierda\n[4] Derecha\n> ");
            int modo = scan.nextInt();
            switch(modo) {
                case 1:
                    System.out.println("\nResultado:");
                    System.out.println("   "+simbolo+"  ");
                    System.out.println("  "+simbolo+""+simbolo+""+simbolo+"  ");
                    System.out.println(" "+simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo+" ");
                    System.out.println(simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo);
                    break;
                case 2:
                    System.out.println("\nResultado:");
                    System.out.println(simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo);
                    System.out.println(" "+simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo+" ");
                    System.out.println("  "+simbolo+""+simbolo+""+simbolo+"  ");
                    System.out.println("   "+simbolo+"  ");
                    break;
                case 3:
                    System.out.println("\nResultado:");
                    System.out.println("        "+simbolo);
                    System.out.println("     "+simbolo+simbolo+simbolo+simbolo);
                    System.out.println("  "+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
                    System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
                    System.out.println("  "+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
                    System.out.println("     "+simbolo+simbolo+simbolo+simbolo);
                    System.out.println("        "+simbolo);
                    break;
                case 4:
                    System.out.println("\nResultado:");
                    System.out.println(simbolo);
                    System.out.println(simbolo+simbolo+simbolo+simbolo);
                    System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
                    System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
                    System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
                    System.out.println(simbolo+simbolo+simbolo+simbolo);
                    System.out.println(simbolo);
                    break;
                default:
                    System.out.println("Has introducido mal la opción.");
                    break;
            }
            
        }
        
    }
    
}
