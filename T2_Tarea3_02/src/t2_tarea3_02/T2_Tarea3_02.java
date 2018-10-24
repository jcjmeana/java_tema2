/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_02;

/**
 *
 * @author acer
 */
public class T2_Tarea3_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palo = "";
        String carta;
        int numeroPalo = (int)(Math.random()*4)+1;
        switch(numeroPalo) {
            case 1:
                palo = "picas";
                break;
            case 2:
                palo = "corazones";
                break;
            case 3:
                palo = "diamantes";
                break;
            case 4:
                palo = "tréboles";
        }
        int numeroCarta = (int)(Math.random()*13)+1;
        switch(numeroCarta) {
            case 1:
                carta = "As";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
                carta = String.valueOf(numeroCarta);
        }
        System.out.println(carta+" de "+palo+".");
        
    }
    
}
