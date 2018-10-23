/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_11;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una hora (Ejemplo 04:12): ");
        String horaIntroducida = scan.next();

        try {
            String[] horaPartida = horaIntroducida.split(":");
            int hora = Integer.parseInt(horaPartida[0]);
            int minutos = Integer.parseInt(horaPartida[1]);
            int horaRestante = 23-hora;
            int minutosRestante = 60-minutos;
            if ((hora < 0 || hora > 23) || (minutos > 59 || minutos < 0)){
                System.out.println("\nError: La hora introducida no existe.");
            } else if (hora == 00 && minutos == 00){
                System.out.println("\nYa es medianoche.");
            } else if (horaRestante == 23 && minutosRestante == 60){
                System.out.println("\nQuedan 24 horas para la medianoche.\nTotal: 86.400 segundos.");
            } else if (minutosRestante == 60) {
                System.out.println("\nQuedan "+(horaRestante+1)+" hora(s) para la medianoche.\n"
                        + "Total: "+(horaRestante*3600)+" segundos.");
            } else {
                System.out.println("\nQuedan "+horaRestante+" hora(s) y "+minutosRestante+
                        " minuto(s) para la medianoche.\nTotal: "+((horaRestante*3600)+
                                (minutosRestante*60))+" segundos.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: Hora mal introducida. Por favor, sigue el ejemplo.");
        } catch (NumberFormatException e){
            System.out.println("\nError: Introduce una hora.");
        }
        
    }
    
}
