/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_12;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuestionario (10 Preguntas):");
        int puntos = 0;
        
        System.out.println("\nPregunta 1: ¿En qué aula se da programación?");
        System.out.println("[1] R3.\n[2] R4.\n[3] R11.");
        System.out.print("\nRespuesta: ");
        int r1 = scan.nextInt();
        
        System.out.println("\nPregunta 2: ¿Qué hace el \"System.out.print()\"?");
        System.out.println("[1] Muestra una salida por pantalla.\n[2] Permite introducir texto por la consola.\n[3] Imprime un pdf del texto en pantalla.");
        System.out.print("\nRespuesta: ");
        int r2 = scan.nextInt();
        
        System.out.println("\nPregunta 3: ¿Qué módulo se imparte las últimas horas del viernes?");
        System.out.println("[1] Entornos de Desarrollo.\n[2] Sistemas Informáticos.\n[3] Lenguaje de Marcas.");
        System.out.print("\nRespuesta: ");
        int r3 = scan.nextInt();
        
        System.out.println("\nPregunta 4: ¿Qué lenguaje utilizamos en el módulo de Programación?");
        System.out.println("[1] C#.\n[2] PHP.\n[3] Java.");
        System.out.print("\nRespuesta: ");
        int r4 = scan.nextInt();
        
        System.out.println("\nPregunta 5: ¿Qué entorno de desarrollo se utiliza en Programación?");
        System.out.println("[1] NetBeans.\n[2] Eclipse.\n[3] Visual Studio.");
        System.out.print("\nRespuesta: ");
        int r5 = scan.nextInt();
        
        System.out.println("\nPregunta 6: ¿Qué sistema operativo utilizan los ordenadores del instituto?");
        System.out.println("[1] Windows 8.\n[2] Windows 10.\n[3] WIndows Vista.");
        System.out.print("\nRespuesta: ");
        int r6 = scan.nextInt();
        
        System.out.println("\nPregunta 7: ¿Qué lenguaje utilizamos en el módulo de Programación?");
        System.out.println("[1] F#.\n[2] Java.\n[3] Python.");
        System.out.print("\nRespuesta: ");
        int r7 = scan.nextInt();
        
        System.out.println("\nPregunta 8: ¿Qué tipo de lenguaje es HTML?");
        System.out.println("[1] Interpretado.\n[2] Compilado.\n[3] Satinado.");
        System.out.print("\nRespuesta: ");
        int r8 = scan.nextInt();
        
        System.out.println("\nPregunta 9: ¿Qué no es JAVA?");
        System.out.println("[1] Compilado.\n[2] Multiplataforma.\n[3] Interpretado.");
        System.out.print("\nRespuesta: ");
        int r9 = scan.nextInt();
        
        System.out.println("\nPregunta 10: ¿Qué pregunta se ha repetido dos veces?");
        System.out.println("[1] 2 y 5.\n[2] 3 y 6.\n[3] 4 y 7.");
        System.out.print("\nRespuesta: ");
        int r10 = scan.nextInt();
        
        String correcto = "Correcta. +1 Punto.";
        String incorrecto = "Incorrecta. +0 Punto.";
        String invalido = "Inválida. +0 Punto.";
        
        String r1r, r2r, r3r, r4r, r5r, r6r, r7r, r8r, r9r, r10r;
        
        switch (r1) {
            case 2:
                r1r = correcto;
                puntos++;
                break;
            case 1:
            case 3:
                r1r = incorrecto;
                break;
            default:
                r1r = invalido;
                break;
        }
        
        switch (r2) {
            case 1:
                r2r = correcto;
                puntos++;
                break;
            case 2:
            case 3:
                r2r = incorrecto;
                break;
            default:
                r2r = invalido;
                break;
        }
        
        switch (r3) {
            case 1:
                r3r = correcto;
                puntos++;
                break;
            case 2:
            case 3:
                r3r = incorrecto;
                break;
            default:
                r3r = invalido;
                break;
        }
        
        switch (r4) {
            case 3:
                r4r = correcto;
                puntos++;
                break;
            case 1:
            case 2:
                r4r = incorrecto;
                break;
            default:
                r4r = invalido;
                break;
        }
        
        switch (r5) {
            case 1:
                r5r = correcto;
                puntos++;
                break;
            case 2:
            case 3:
                r5r = incorrecto;
                break;
            default:
                r5r = invalido;
                break;
        }
        
        switch (r6) {
            case 2:
                r6r = correcto;
                puntos++;
                break;
            case 1:
            case 3:
                r6r = incorrecto;
                break;
            default:
                r6r = invalido;
                break;
        }
        
        switch (r7) {
            case 2:
                r7r = correcto;
                puntos++;
                break;
            case 1:
            case 3:
                r7r = incorrecto;
                break;
            default:
                r7r = invalido;
                break;
        }
        
        switch (r8) {
            case 1:
                r8r = correcto;
                puntos++;
                break;
            case 2:
            case 3:
                r8r = incorrecto;
                break;
            default:
                r8r = invalido;
                break;
        }
        
        switch (r9) {
            case 3:
                r9r = correcto;
                puntos++;
                break;
            case 1:
            case 2:
                r9r = incorrecto;
                break;
            default:
                r9r = invalido;
                break;
        }
        
        switch (r10) {
            case 3:
                r10r = correcto;
                puntos++;
                break;
            case 1:
            case 2:
                r10r = incorrecto;
                break;
            default:
                r10r = invalido;
                break;
        }
        
        System.out.println("\nResultado:\n"
                + "[1] "+r1r+"\n[2] "+r2r+"\n[3] "+r3r+"\n[4] "+r4r
                +"\n[5] "+r5r+"\n[6] "+r6r+"\n[7] "+r7r+"\n[8] "+r8r
                +"\n[9] "+r9r+"\n[10] "+r10r+"\n\nTotal: "+puntos+" punto(s).");
        
    }
    
}
