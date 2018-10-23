/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_01;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        String diaIntroducido = scan.next().toLowerCase();
        
        switch(diaIntroducido) {
            case "lunes":
                System.out.println("Base de Datos.");
                break;
            case "martes":
                System.out.println("FOL.");
                break;
            case "miercoles": case "miércoles":
                System.out.println("Programación.");
                break;
            case "jueves":
                System.out.println("Programación.");
                break;
            case "viernes":
                System.out.println("Entornos de Desarrollo.");
                break;
            default:
                System.out.println("El día introducido o no existe, o no hay clase.");
                break;
        }
        
    }
    
}
