// ** Realiza un conversor de Kb a Mb.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad en kilobytes
        System.out.print("Ingresa la cantidad en kilobytes (KB): ");
        double kilobytes = scanner.nextDouble();

        // Convertir a megabytes (1 MB = 1024 KB)
        double megabytes = kilobytes / 1024;

        // Mostrar el resultado
        System.out.println(kilobytes + " KB equivalen a " + megabytes + " MB");

        scanner.close();
    }
}
