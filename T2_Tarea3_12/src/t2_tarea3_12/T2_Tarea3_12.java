/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_12;
import java.*;
/**
 *
 * @author acer
 */
public class T2_Tarea3_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        int linea = 0;
        for(int i = 0; i < 8000; i++) {
            System.out.print("\033[32m"+(char)(Math.random() * (126 - 32 + 1) + 32));
            if (linea++ == 60) {
                linea = 0;
                Thread.sleep(20);
                System.out.println();
            }
        }
        System.out.println();
            
    }
    
}
