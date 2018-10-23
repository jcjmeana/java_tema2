/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_03;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        String introducido = scan.next();

        try {
            int num = Integer.parseInt(introducido);
            switch (num){
                case 1:
                    System.out.println("Lunes.");
                    break;
                case 2:
                    System.out.println("Martes.");
                    break;
                case 3:
                    System.out.println("Miércoles.");
                    break;
                case 4:
                    System.out.println("Jueves.");
                    break;
                case 5:
                    System.out.println("Viernes.");
                    break;
                case 6:
                    System.out.println("Sábado.");
                    break;
                case 7:
                    System.out.println("Domingo.");
                    break;
                default:
                    System.out.println("Ese número no tiene día de la semana.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: No has introducido un número.");
        }
        
    }
    
}
