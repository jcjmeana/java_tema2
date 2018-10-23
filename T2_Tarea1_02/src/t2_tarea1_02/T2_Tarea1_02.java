/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_02;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una hora: ");
        int hora = scan.nextInt();
        
        if (hora >= 6 && hora <= 12 ){
            System.out.println("Buenos días.");
        } else if (hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes.");
        } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
            System.out.println("Buenas noches.");
        } else {
            System.out.println("La hora introducida no existe.");
        }
    }
    
}
