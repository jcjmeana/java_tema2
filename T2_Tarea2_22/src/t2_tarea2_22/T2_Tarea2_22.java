/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea2_22;

/**
 *
 * @author acer
 */
public class T2_Tarea2_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Lista de números primos entre 2 y 100:");
        boolean primo;
        
        for (int i = 2; i <= 100; i++) {
            primo = true;
            
            for (int n = 2; n<i; n++) {
                if (i % n == 0) {
                    primo = false;
                }
            }
            
            if (primo)
                System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
