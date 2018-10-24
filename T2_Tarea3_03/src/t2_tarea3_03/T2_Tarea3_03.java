/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea3_03;

/**
 *
 * @author acer
 */
public class T2_Tarea3_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palo = "";
        String carta;
        switch((int)(Math.random()*4)){
            case 0:
                palo = "oros";
                break;
            case 1:
                palo = "copas";
                break;
            case 2:
                palo = "bastos";
                break;
            case 3:
                palo = "espadas";
                break;
        }
        int numeroCarta = (int)(Math.random()*11)+1;
        switch(numeroCarta) {
            case 1:
                carta = "As";
                break;
            case 8:
                carta = "Sota";
                break;
            case 9:
                carta = "Caballo";
                break;
            case 10:
                carta = "Rey";
                break;
            default:
            carta = String.valueOf(numeroCarta);
        }
        System.out.println(carta+" de "+palo+".");
        
    }
    
}
