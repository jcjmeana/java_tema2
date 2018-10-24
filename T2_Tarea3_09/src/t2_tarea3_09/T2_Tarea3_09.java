/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_09;

/**
 *
 * @author acer
 */
public class T2_Tarea3_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0, contador = 0;
        while (num != 24) {
            num = (int)(Math.random() * 51) * 2;
            System.out.print(num+" ");
            contador++;
        }
        
        if (contador == 1){
            System.out.println("Hay un único número.");
        } else {
            System.out.println("\nHay un total de: "+contador+" números.");
        }
        
    }
    
}
