// ** divisible entre 5

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el número al usuario
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si es par
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número no es par.");
        }

        // Verificar si es divisible entre 5
        if (numero % 5 == 0) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible entre 5.");
        }

        scanner.close();
    }
}
