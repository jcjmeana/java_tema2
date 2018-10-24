/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_30;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int primer_dia=0, segundo_dia =0, primer_hora, segundo_hora;
        String primerdia, segundodia, n1_dia="", n2_dia="";
        boolean datos;
        
        do {
            System.out.println("Primera hora:\n");
            System.out.print("Día: ");
            primerdia = scan.next();
            System.out.print("Hora: ");
            primer_hora = scan.nextInt();
            
            switch(primerdia) {
                case "lunes":
                case "1":
                    primer_dia = 1;
                    n1_dia = "Lunes";
                    break;
                case "martes":
                case "2":
                    primer_dia = 2;
                    n1_dia = "Martes";
                    break;
                case "miércoles":
                case "3":
                    primer_dia = 3;
                    n1_dia = "Miércoles";
                    break;
                case "jueves":
                case "4":
                    primer_dia = 4;
                    n1_dia = "Jueves";
                    break;
                case "viernes":
                case "5":
                    primer_dia = 5;
                    n1_dia = "Viernes";
                    break;
                case "sábado":
                case "6":
                    primer_dia = 6;
                    n1_dia = "Sábado";
                    break;
                case "domingo":
                case "7":
                    primer_dia = 7;
                    n1_dia = "Domingo";
                    break;
                default:
                    primer_dia = 0;
            }
            
            System.out.println("Segunda hora:");
            System.out.print("Día: ");
            segundodia = scan.next();
            System.out.print("Hora: ");
            segundo_hora = scan.nextInt();
            
            switch(segundodia) {
                case "lunes":
                case "1":
                    segundo_dia = 1;
                    n2_dia = "lunes";
                    break;
                case "martes":
                case "2":
                    segundo_dia = 2;
                    n2_dia = "martes";
                    break;
                case "miércoles":
                case "3":
                    segundo_dia = 3;
                    n2_dia = "miércoles";
                    break;
                case "jueves":
                case "4":
                    segundo_dia = 4;
                    n2_dia = "jueves";
                    break;
                case "viernes":
                case "5":
                    segundo_dia = 5;
                    n2_dia = "viernes";
                    break;
                case "sábado":
                case "6":
                    segundo_dia = 6;
                    n2_dia = "sábado";
                    break;
                case "domingo":
                case "7":
                    segundo_dia = 7;
                    n2_dia = "domingo";
                    break;
                default:
                    segundo_dia = 0;
            }
            datos = true;
            
            if (segundo_dia <= primer_dia) {
                System.out.println("El segundo día debe ser posterior al primero.");
                datos = false;
            }
            
            if ((primer_dia == 0) || (segundo_dia == 0)) {
                System.out.println("Has introducido mal el día de la semana.");
                System.out.println("Los días válidos son: lunes, martes, miércoles, "
                        + "jueves, viernes, sábado y domingo.");
                datos = false;
            }
            
            if ((primer_hora < 0) || (primer_hora > 23) || (segundo_hora < 0) || (segundo_hora > 23)) {
                System.out.println("Has introducido mal la hora del día.");
                System.out.println("Las horas válidas están comprendidas entre las 0 y 23.");
                datos = false;
            }
        } while (!datos);
        
        if (primer_hora <= 9 && segundo_hora <= 9){
            System.out.println("Entre las 0"+primer_hora+":00h del "
                    + "" +n1_dia+" y las 0"+segundo_hora+":00h del "
                            + ""+n2_dia+" hay "+(((segundo_dia*24)+segundo_hora)-((primer_dia * 24)+primer_hora))+" horas.");
        } else if (primer_hora <= 9) {
            System.out.println("Entre las 0"+primer_hora+":00h del "
                    + "" +n1_dia+" y las "+segundo_hora+":00h del "
                            + ""+n2_dia+" hay "+(((segundo_dia*24)+segundo_hora)-((primer_dia * 24)+primer_hora))+" horas.");
        } else if (segundo_hora <= 9) {
            System.out.println("Entre las "+primer_hora+":00h del "
                    + "" +n1_dia+" y las 0"+segundo_hora+":00h del "
                            + ""+n2_dia+" hay "+(((segundo_dia*24)+segundo_hora)-((primer_dia * 24)+primer_hora))+" horas.");
        } else {
            System.out.println("Entre las "+primer_hora+":00h del "
                    + "" +n1_dia+" y las "+segundo_hora+":00h del "
                            + ""+n2_dia+" hay "+(((segundo_dia*24)+segundo_hora)-((primer_dia * 24)+primer_hora))+" horas.");
        }
        
    }
    
}
