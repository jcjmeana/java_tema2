/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_14;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea3_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.");
        System.out.print("Escribe LISTO, cuando estes preparado: ");
        
        String listo = scan.next();
        while (!listo.equals("LISTO")){
            System.out.print("\nEscribe LISTO, cuando estes preparado: ");
            listo = scan.next();
        }
        
        int intentos=5, pensado, minimo=0, maximo=100, comparacion;
        boolean acertado = false;
        
        do {
            pensado = (int)(Math.random() * (maximo - minimo) + minimo);
            System.out.println("¿Es el " + pensado + "?");
            
            System.out.print("El número que estás pensando es [1] MAYOR, [2] MENOR, [3] SÍ. ");
            comparacion = scan.nextInt();
            
            intentos--;
            if ((comparacion == 1) && (intentos > 0))
                minimo = pensado + 1;
            if ((comparacion == 2) && (intentos > 0))
                maximo = pensado - 1;
            if (comparacion == 3) {
                acertado = true;
                System.out.println("¡Bien! ¡He acertado!");
            }
            
        } while(!acertado && (intentos > 0));
        
        if (!acertado) {
            System.out.println("¡Qué mal! No he logrado acertar.");
        }
        
    }
    
}
