//** Escribe un programa que calcule el área de un rectángulo.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear lector de datos desde consola
        Scanner scanner = new Scanner(System.in);

        // Pedir la base
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();

        // Pedir la altura
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área
        double area = base * altura;

        // Mostrar el resultado
        System.out.println("El área del rectángulo es: " + area);

        // Cerrar el scanner
        scanner.close();
    }
}
