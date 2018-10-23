/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_01;

/**
 *
 * @author acer
 */
public class T2_Tarea2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Múltiplos de 5: (del 0 al 100).\n");
        for (int i=0; i<=100; i++){
            if (i % 5 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
}
