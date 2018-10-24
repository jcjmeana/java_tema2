/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_11;

/**
 *
 * @author acer
 */
public class T2_Tarea3_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota, suspensos = 0, suficientes = 0, bienes = 0,
                notables = 0, sobresalientes = 0;
        
        System.out.println("Notas:");
        
        for(int i = 0; i < 20; i++) {
            nota = (int)(Math.random() * 5);
            switch(nota) {
                case 0:
                    System.out.print("Suspenso ");
                    suspensos++;
                    break;
                case 1:
                    System.out.print("Suficiente ");
                    suficientes++;
                    break;
                case 2:
                    System.out.print("Bien ");
                    bienes++;
                    break;
                case 3:
                    System.out.print("Notable ");
                    notables++;
                    break;
                case 4:
                    System.out.print("Sobresaliente ");
                    sobresalientes++;
                    break;
            }
        }
        
        System.out.println("\n\nNúmero de suspensos: "+suspensos+".");
        System.out.println("Número de suficientes: "+suficientes+".");
        System.out.println("Número de bienes: "+bienes+".");
        System.out.println("Número de notables: "+notables+".");
        System.out.println("Número de sobresalientes: "+sobresalientes+".");
        
    }
    
}
