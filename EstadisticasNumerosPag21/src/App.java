//**   introduzca un numero negativo

 import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNumeros = 0;
        int sumaImpares = 0;
        int cantidadImpares = 0;
        int mayorPar = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Ingresa un número (negativo para terminar): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // salir del bucle
            }

            cantidadNumeros++;

            if (numero % 2 == 0) {
                // Es par
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            } else {
                // Es impar
                sumaImpares += numero;
                cantidadImpares++;
            }
        }

        System.out.println("\nCantidad de números ingresados: " + cantidadNumeros);

        if (cantidadImpares > 0) {
            double mediaImpares = (double) sumaImpares / cantidadImpares;
            System.out.println("Media de los impares: " + mediaImpares);
        } else {
            System.out.println("No se ingresaron números impares.");
        }

        if (mayorPar != Integer.MIN_VALUE) {
            System.out.println("Mayor número par: " + mayorPar);
        } else {
            System.out.println("No se ingresaron números pares.");
        }

        scanner.close();
    }
}
