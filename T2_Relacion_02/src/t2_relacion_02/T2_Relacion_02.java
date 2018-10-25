/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_relacion_02;

/**
 *
 * @author acer
 */
public class T2_Relacion_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 1, contador = 1;
        while (contador <= 5){
            num++;
            if (num%2==0){
                System.out.print(num+" ");
                contador++;
            }
        }
        System.out.println();
        
    }
    
}
