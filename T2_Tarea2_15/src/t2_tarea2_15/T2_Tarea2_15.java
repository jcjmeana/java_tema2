/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_15;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        int base = scan.nextInt();
        System.out.print("Introduce un exponente (Entero positivo): ");
        int exponente = scan.nextInt();
        
        while (exponente < 1){
            System.out.print("El exponente tiene que ser un entero positivo, introdúcelo de nuevo: ");
            exponente = scan.nextInt();
        }
        System.out.print("\nResultado: ");
        if (exponente == 1) {
            System.out.println(base);
        } else {
            System.out.print(base+"^1="+base+"  ");
            int contador = 2;
            int baseInicial = base;
            do {
                int baseAux = base;
                for (int i=2; i<=contador; i++){
                    base*=baseAux;
                }
                System.out.print(baseInicial+"^"+contador+"="+base+"  ");
                contador++;
                base = baseInicial;
            } while (contador <= exponente);
        }
        System.out.println();
        
    }
    
}
