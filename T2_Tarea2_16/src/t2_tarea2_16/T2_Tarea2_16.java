/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_16;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scan.nextInt();
        
        if (num<=1){
            System.out.println("\nEl número "+num+" no es primo.");
        } else {
            boolean primo = true;
            for (int i = 2; i<=11; i++){
                if (num!=i && num%i==0){
                    primo = false;
                }
            }
            if (primo)
                System.out.println("\nEl número "+num+" es primo.");
            else {
                System.out.println("\nEl número "+num+" no es primo.");
            }
        }
    }
    
}
