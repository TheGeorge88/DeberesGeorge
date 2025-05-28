//**  12 euros la hora.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir las horas trabajadas
        System.out.print("Ingresa las horas trabajadas esta semana: ");
        double horasTrabajadas = scanner.nextDouble();

        // Definir tarifa por hora
        double tarifaHora = 12.0;

        // Calcular salario semanal
        double salarioSemanal = horasTrabajadas * tarifaHora;

        // Mostrar el salario
        System.out.println("El salario semanal es: " + salarioSemanal + " euros");

        scanner.close();
    }
}
