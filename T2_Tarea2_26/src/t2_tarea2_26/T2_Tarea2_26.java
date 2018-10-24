/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_26;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea2_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int numero = scan.nextInt();
        System.out.print("Introduzca un dígito: ");
        int digito = scan.nextInt();
        
        int alreves = 0, longitud =0, posicion = 1;
        System.out.print("\nEl "+digito+" aparece dentro del "+numero+" en la posición número ");
        
        
        if (numero == 0) {
            longitud = 1;
        }
        
        while (numero > 0) {
            alreves = (alreves * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        } 
        
        while (alreves > 0) {
            if ((alreves % 10) == digito) {
                System.out.print(posicion+" ");
            }
            alreves /= 10;
            posicion++;
        }
        
        System.out.println();
    }
    
}
