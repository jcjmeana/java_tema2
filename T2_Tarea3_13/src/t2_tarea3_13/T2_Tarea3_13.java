/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_13;

/**
 *
 * @author acer
 */
public class T2_Tarea3_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dado1, dado2;
        do {
            dado1 = (int)(Math.random() * 6) + 1;
            dado2 = (int)(Math.random() * 6) + 1;
            System.out.println(dado1+"\t"+dado2);
        } while (dado1 != dado2);
    }
    
}
