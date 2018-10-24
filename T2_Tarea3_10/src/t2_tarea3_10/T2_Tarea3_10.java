/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_10;

/**
 *
 * @author acer
 */
public class T2_Tarea3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r, longitud;
        String base = "";
        
        for(int i = 1; i <= 10; i++) {
            longitud = (int)(Math.random() * 40) + 1;
            r = (int)(Math.random() * 6);
            
            switch(r) {
                case 0:
                    base = "*";
                    break;
                case 1:
                    base = "-";
                    break;
                case 2:
                    base = "=";
                    break;
                case 3:
                    base = ".";
                    break;
                case 4:
                    base = "|";
                    break;
                case 5:
                    base = "@";
                    break;
            }
            
            for(int j = 1; j <= longitud; j++) {
                System.out.print(base);
            }
            
            System.out.println();
            
        }
            
    }
    
}
