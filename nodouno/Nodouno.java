/*
Solorzano Trejo Brandon Uriel
3S11
Nodo 1 Eliminar nodo
 */
package nodouno;
import java.util.Scanner;
public class Nodouno {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
        int opt = 0;
        String dato;
        nodo n = new nodo();
        
        do {
        System.out.println("\n<<<<<Opciones>>>>>\n");
        System.out.println("1. Agrega los datos");
        System.out.println("2. Mostrar los datos");
        System.out.println("3. Eliminar datos");
        System.out.println("4. Salir");
        
        switch (opt = sc.nextInt()) {
        case 1:
        n.agregar();
        break;

        case 2:
        n.mostrar();
        break;
                    
        case 3:
        n.eliminar();
        break;
        }
        } while (opt != 4);
        }
        }
  
