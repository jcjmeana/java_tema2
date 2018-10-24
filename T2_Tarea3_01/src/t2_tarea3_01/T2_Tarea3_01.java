/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_01;

/**
 *
 * @author acer
 */
public class T2_Tarea3_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tirada;
        int suma = 0;
        System.out.println("Tirada de tres dados: ");
        for(int i = 0; i < 3; i++) {
            tirada = (int)(Math.random() * 6) + 1;
            System.out.print(tirada + " ");
            suma += tirada;
        }
        System.out.println("\nSuma: "+suma+".");
    }
    
}
