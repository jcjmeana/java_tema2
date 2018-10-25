/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_relacion_05;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Relacion_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce tu fecha de nacimiento. (Formato DD-MM-YYYY): ");
        String fechaNac = scan.next();
        
        int dia = 0, mes = 0, año = 0;
        try {
            String[] fechaPartida = fechaNac.split("-");
            dia = Integer.parseInt(fechaPartida[0]);
            mes = Integer.parseInt(fechaPartida[1]);
            año = Integer.parseInt(fechaPartida[2]);
        } catch (Exception e){
            System.out.println("\nError: Fecha de nacimiento mal introducida.");
            System.exit(0);
        }
        
        int añoMaximo = Calendar.getInstance().get(Calendar.YEAR);
        if ((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || (año < 1900 || año > añoMaximo)){
            System.out.println("\nLa fecha introducida no es posible.");
        } else {
            int sumaTotal = dia+mes+año;
            String totalSuma = Integer.toString(sumaTotal);
            
            int[] digitos = new int[totalSuma.length()];

            int i = digitos.length-1;
            while (sumaTotal > 0) {
                digitos[i] = sumaTotal%10;
                sumaTotal = sumaTotal/10;
                i--;
            }

            int resultado = 0;
            for(int n=0; n<digitos.length; n++){
                resultado+=digitos[n];
            }
            while (resultado % 10 != 0 && resultado > 9){
                resultado = (resultado/10)+(resultado%10);
            }
            if (resultado == 10) resultado = 1;
            
            System.out.println("\nTu número de la suerte es: "+resultado+".");
            
        }
        
    }
    
}
