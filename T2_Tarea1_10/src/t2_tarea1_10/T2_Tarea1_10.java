/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_10;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("¿En qué día naciste? ");
        int dia = scan.nextInt();
        System.out.print("¿En qué mes naciste? (En números) ");
        int mes = scan.nextInt();
        
        System.out.println();
        if ((dia >= 21 && dia <= 31 && mes == 3) || (dia <= 20 && dia >= 01 && mes == 4)){
            System.out.println("Horóscopo: Aries.");
        } else if ((dia >= 21 && dia <= 30 && mes == 4) || (dia <= 21 && dia >= 01 && mes == 5)){
            System.out.println("Horóscopo: Tauro.");
        } else if ((dia >= 22 && dia <= 31 && mes == 5) || (dia <= 21 && dia >= 01 && mes == 6)){
            System.out.println("Horóscopo: Géminis.");
        } else if ((dia >= 22 && dia <= 30 && mes == 6) || (dia <= 22 && dia >= 01 && mes == 7)){
            System.out.println("Horóscopo: Cáncer.");
        } else if ((dia >= 23 && dia <= 31 && mes == 7) || (dia <= 22 && dia >= 01 && mes == 8)){
            System.out.println("Horóscopo: Leo.");
        } else if ((dia >= 23 && dia <= 31 && mes == 8) || (dia <= 22 && dia >= 01 && mes == 9)){
            System.out.println("Horóscopo: Virgo.");
        } else if ((dia >= 23 && dia <= 30 && mes == 9) || (dia <= 22 && dia >= 01 && mes == 10)){
            System.out.println("Horóscopo: Libra.");
        } else if ((dia >= 23 && dia <= 31 && mes == 10) || (dia <= 22 && dia >= 01 && mes == 11)){
            System.out.println("Horóscopo: Escorpio.");
        } else if ((dia >= 23 && dia <= 30 && mes == 11) || (dia <= 21 && dia >= 01 && mes == 12)){
            System.out.println("Horóscopo: Sagitario.");
        } else if ((dia >= 22 && dia <= 31 && mes == 12) || (dia <= 20 && dia >= 01 && mes == 1)){
            System.out.println("Horóscopo: Capricornio.");
        } else if ((dia >= 21 && dia <= 31 && mes == 1) || (dia <= 19 && dia >= 01 && mes == 2)){
            System.out.println("Horóscopo: Acuario.");
        } else if ((dia >= 21 && dia <= 29 && mes == 2) || (dia <= 20 && dia >= 01 && mes == 3)){
            System.out.println("Horóscopo: Piscis.");
        } else {
            System.out.println("Esa fecha no existe.");
        }
    }
    
}
