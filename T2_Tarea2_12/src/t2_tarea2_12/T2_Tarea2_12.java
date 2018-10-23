/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_12;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo límite de repetición: ");
        int num = scan.nextInt();
        
        while (num <= 0) {
            System.out.print("El número tiene que ser mayor que 0.\n> ");
            num = scan.nextInt();
        }
        salto();

        switch (num) {
            case 1:
                System.out.print("0");
                break;
            case 2:
                System.out.print("0 1");
                break;
            default:
                System.out.print("0 1");
                int numMin = 0;
                int numMax = 1;
                int numAux;
                while(num > 2) {
                    numAux = numMin;
                    numMin = numMax;
                    numMax = numAux+numMax;
                    System.out.print(" "+numMax);
                    num--;
                }
        }    
        salto();
    }
    public static void salto(){
        System.out.println();
    }
}
