/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_06;

/**
 *
 * @author acer
 */
public class T2_Tarea2_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Números del 320 a 160 de 20 en 20.\n");
        int i = 320;
        do {
            System.out.print(i+" ");
            i-=20;
        } while (i >= 160);
        System.out.println();
    }
    
}
