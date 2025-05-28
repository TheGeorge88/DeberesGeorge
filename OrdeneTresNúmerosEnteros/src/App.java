// ** ordene tres números enteros

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir tres números al usuario
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        // Guardar los números en un arreglo
        int[] numeros = {num1, num2, num3};

        // Ordenar el arreglo
        Arrays.sort(numeros);

        // Mostrar los números ordenados
        System.out.println("\nNúmeros ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
