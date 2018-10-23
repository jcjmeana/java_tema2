/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_14;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class T2_Tarea2_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce la base de la potencia: ");
        int base = scan.nextInt();
        System.out.print("Introduce el exponente (Positivo) de la potencia: ");
        int exponente = scan.nextInt();
        
        while (exponente < 0){
            System.out.print("El exponente tiene que ser positivo.\n> ");
            exponente=scan.nextInt();
        }
        System.out.println();
        
        int resultado = 0;
        switch(exponente){
            case 0:
                resultado=1;
                break;
            case 1:
                resultado=base;
                break;
            default:
                int baseAux = base;
                for (int i=2; i<=exponente; i++){
                    base*=baseAux;
                }
                resultado = base;
                break;
        }
        System.out.println("Resultado: "+resultado);
        
    }
    
}
