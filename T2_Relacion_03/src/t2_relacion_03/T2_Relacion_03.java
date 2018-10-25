/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_relacion_03;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Relacion_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String num = scan.nextLine();
        
        int intNum = Integer.parseInt(num);
        int[] digitos = new int[num.length()];
        
        int i = digitos.length-1;
        while (intNum > 0) {
            digitos[i] = intNum%10;
            intNum = intNum/10;
            i--;
        }
        
        int resultado = 0;
        for(int n=0; n<digitos.length; n++){
            resultado += (digitos[n])*(digitos[n])*(digitos[n]);
        }
        
        System.out.println("\nNúmero Armstrong: "+resultado);
        
    }
    
}
