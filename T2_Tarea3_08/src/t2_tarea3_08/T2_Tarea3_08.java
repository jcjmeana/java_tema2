/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_08;

/**
 *
 * @author acer
 */
public class T2_Tarea3_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int partido;
        int columnas = 3;
        
        for (int fila = 1; fila <= 15; fila++) {
            System.out.printf("%4d. |", fila);
            
            if (fila == 15) {
                columnas = 1;
            }
            
            for (int apuesta = 1; apuesta <= columnas; apuesta++) {
                partido = (int)(Math.random() * 6) + 1;
                switch(partido) {
                    case 1:
                        case 2:
                        case 3:
                            System.out.print("1  |");
                            break;
                    case 4:
                        case 5:
                            System.out.print(" X |");
                            break;
                    case 6:
                        System.out.print("  2|");
                }
            }
            
            System.out.println();
        }
        
    }
    
}
