/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_05;

/**
 *
 * @author acer
 */
public class T2_Tarea3_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int maximo = 100;
        int minimo = 199;
        int suma = 0;
        int num;
        
        System.out.println("Números:");
        
        for (int n = 0; n < 50; n++) {
            num = (int)(Math.random()*100) + 100;
            System.out.print(num + " ");
            suma += num;
            if (num < minimo) {
                minimo = num;
            }
            if (num > maximo) {
                maximo = num;
            }
        }
        System.out.println("\n\nMínimo: "+minimo+".\nMáximo: "+maximo+".\nMedia: "+suma/50+".");
        
    }
    
}
