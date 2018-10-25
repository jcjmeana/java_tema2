/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_relacion_07;

/**
 *
 * @author acer
 */
public class T2_Relacion_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        System.out.println("Nuúmero que NO son múltiplos de 5 del 1 al 100:");
        for (int i = 5; i<=100; i++){
            if (i%5!=0)
                System.out.print(i+" ");
            if (contador%20==0)
                System.out.println();
            contador++;
        }
        System.out.println();
    }
    
}
