//** se crea una variable de dirección telefono

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear el lector de entrada por consola
        Scanner scanner = new Scanner(System.in);

        // Pedir los datos al usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingresa tu teléfono: ");
        String telefono = scanner.nextLine();

        // Mostrar los datos ingresados
        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);

        // Cerrar el scanner
        scanner.close();
    }
}
