//** Ejercicio 1Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número límite
        System.out.print("Ingresa un número límite: ");
        int limite = scanner.nextInt();

        System.out.println("Múltiplos de 5 (sin incluir el 0) hasta " + limite + ":");

        // Bucle for para mostrar múltiplos de 5 (mayores que 0)
        for (int i = 1; i <= limite; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

