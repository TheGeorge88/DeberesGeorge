// ** ejercicio#1 papel papel tijera

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir jugada del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador1 = scanner.nextLine().toLowerCase();

        // Pedir jugada del jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugador2 = scanner.nextLine().toLowerCase();

        // Verificar que ambas jugadas sean válidas
        if (!esValido(jugador1) || !esValido(jugador2)) {
            System.out.println("¡Error! Jugada no válida. Solo se acepta piedra, papel o tijera.");
        } else if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
        } else if (
            (jugador1.equals("piedra") && jugador2.equals("tijera")) ||
            (jugador1.equals("papel") && jugador2.equals("piedra")) ||
            (jugador1.equals("tijera") && jugador2.equals("papel"))
        ) {
            System.out.println("Gana el jugador 1");
        } else {
            System.out.println("Gana el jugador 2");
        }

        scanner.close();
    }

    // Función para validar jugadas
    public static boolean esValido(String jugada) {
        return jugada.equals("piedra") || jugada.equals("papel") || jugada.equals("tijera");
    }
}
