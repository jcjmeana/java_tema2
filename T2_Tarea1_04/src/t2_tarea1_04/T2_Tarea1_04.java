/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_04;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas: ");
        int horas = scan.nextInt();
        if (horas >= 0 && horas <= 40) {
            System.out.println("Salario: " + horas*12+" euros.");
        } else if (horas >= 41){
            int horasExtras = horas-40;
            System.out.println("Salario: "+((horasExtras*16)+480)+" euros.");
        }
    }
    
}
