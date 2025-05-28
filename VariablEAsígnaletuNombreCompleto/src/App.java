//** variable nombre y asígnale tu nombre completo

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear un lector para ingresar datos por consola
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre
        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();

        // Mostrar saludo humanizado
        System.out.println("¡Hola " + nombre + "! Qué gusto saludarte 😊");

        // Cerrar el scanner
        scanner.close();
    }
}

