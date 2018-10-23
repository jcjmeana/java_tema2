/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2_tarea1_16;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T2_Tarea1_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner scan = new Scanner(System.in);
        String respuesta;
        int puntos = 0;
        
        print("Saber si hay probabilidad de que tu pareja está siendo infiel.\n", 2);
        
        print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v)erdadero o (f)also: ", 1);
        respuesta = scan.next();
        while (!respuesta.equals("v") && !respuesta.equals("f")){
            print("Opción no reconocida, introdúcela de nuevo: ", 1);
            respuesta = scan.next();
        }
        if (respuesta.equals("v")) puntos+=3;

        print("\n2. Ha aumentado sus gastos de vestuario.\n(v)erdadero o (f)also: ", 1);
        respuesta = scan.next();
        while (!respuesta.equals("v") && !respuesta.equals("f")){
            print("Opción no reconocida, introdúcela de nuevo: ", 1);
            respuesta = scan.next();
        }
        if (respuesta.equals("v")) puntos+=3;
        
        print("\n3. Ha perdido el interés que mostraba anteriormente por ti.\n(v)erdadero o (f)also: ", 1);
        respuesta = scan.next();
        while (!respuesta.equals("v") && !respuesta.equals("f")){
            print("Opción no reconocida, introdúcela de nuevo: ", 1);
            respuesta = scan.next();
        }
        if (respuesta.equals("v")) puntos+=3;
        
        print("\n4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n(v)erdadero o (f)also: ", 1);
        respuesta = scan.next();
        while (!respuesta.equals("v") && !respuesta.equals("f")){
            print("Opción no reconocida, introdúcela de nuevo: ", 1);
            respuesta = scan.next();
        }
        if (respuesta.equals("v")) puntos+=3;
        
        print("\n5. No te deja que mires la agenda de su teléfono móvil.\n(v)erdadero o (f)also: ", 1);
        respuesta = scan.next();
        while (!respuesta.equals("v") && !respuesta.equals("f")){
            print("Opción no reconocida, introdúcela de nuevo: ", 1);
            respuesta = scan.next();
        }
        if (respuesta.equals("v")) puntos+=3;
        
        print("\n6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n(v)erdadero o (f)also: ", 1);
        respuesta = scan.next();
        while (!respuesta.equals("v") && !respuesta.equals("f")){
            print("Opción no reconocida, introdúcela de nuevo: ", 1);
            respuesta = scan.next();
        }
        if (respuesta.equals("v")) puntos+=3;
        
        print("\n7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n(v)erdadero o (f)also: ", 1);
        respuesta = scan.next();
        while (!respuesta.equals("v") && !respuesta.equals("f")){
            print("Opción no reconocida, introdúcela de nuevo: ", 1);
            respuesta = scan.next();
        }
        if (respuesta.equals("v")) puntos+=3;
        
        print("\n8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n(v)erdadero o (f)also: ", 1);
        respuesta = scan.next();
        while (!respuesta.equals("v") && !respuesta.equals("f")){
            print("Opción no reconocida, introdúcela de nuevo: ", 1);
            respuesta = scan.next();
        }
        if (respuesta.equals("v")) puntos+=3;
        
        print("\n9. Has notado que últimamente se perfuma más.\n(v)erdadero o (f)also: ", 1);
        respuesta = scan.next();
        while (!respuesta.equals("v") && !respuesta.equals("f")){
            print("Opción no reconocida, introdúcela de nuevo: ", 1);
            respuesta = scan.next();
        }
        if (respuesta.equals("v")) puntos+=3;
        
        print("\n10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n(v)erdadero o (f)also: ", 1);
        respuesta = scan.next();
        while (!respuesta.equals("v") && !respuesta.equals("f")){
            print("Opción no reconocida, introdúcela de nuevo: ", 1);
            respuesta = scan.next();
        }
        if (respuesta.equals("v")) puntos+=3;
        
        System.out.println();
        if (puntos<=10)
            print("¡Enhorabuena! Tu pareja parece ser totalmente fiel.", 2);
        
        else if ((puntos >= 11) && (puntos <=22))
            print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. ¡No bajes la guardia!", 2);
        
        else if (puntos >= 23)
            print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.", 2);
        else 
            print("Hubo un error en el recuento de los puntos.", 2);
        
    }
    public static void print(Object texto, int modo){
        switch(modo){
            case 1:
                System.out.print(texto);
                break;
            case 2:
                System.out.println(texto);
                break;
            default:
                System.out.println("\u001B[31mError: print no definido.\u001B[0m");
                break;
        }
    }
    
}
