//** Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número límite
        System.out.print("Ingresa un número límite: ");
        int limite = scanner.nextInt();

        int i = 0;

        System.out.println("Múltiplos de 5 desde 0 hasta " + limite + ":");

        // Bucle while para mostrar múltiplos de 5
        while (i <= limite) {
            if (i % 5 == 0 && i != 0) {
                System.out.println(i);
            }
            i++;
        }

        scanner.close();
    }
}
