/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_03;

/**
 *
 * @author acer
 */
public class T2_Tarea2_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        System.out.println("Múltiplos de 5: (del 0 al 100).\n");
        
        do {
            if (i%5 == 0) System.out.print(i+" ");
            i++;
        } while (i>=0 && i<=100);
        
        System.out.println();
    }
    
}
