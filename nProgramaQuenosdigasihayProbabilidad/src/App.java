//** PROGRAMA DIGA SI HAY PROBABILIDAD

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntuacion = 0;

        // Preguntas del test
        String[] preguntas = {
            "1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.",
            "2. Ha aumentado sus gastos de vestuario.",
            "3. Ha perdido el interés que mostraba anteriormente por ti.",
            "4. Ahora se asea con más frecuencia o se arregla más que antes.",
            "5. No te deja que mires la agenda de su teléfono móvil.",
            "6. A veces tiene llamadas que no quiere contestar cuando estás tú delante.",
            "7. Últimamente se preocupa más por cuidar su figura o broncearse.",
            "8. Muchos días viene tarde del trabajo alegando tener más carga laboral.",
            "9. Has notado que últimamente se perfuma más.",
            "10. Se confunde y menciona lugares donde no ha ido contigo."
        };

        System.out.println("Responde con 'true' (verdadero) o 'false' (falso):");

        // Bucle para hacer las preguntas
        for (String pregunta : preguntas) {
            System.out.println(pregunta);
            System.out.print("Respuesta (true/false): ");
            boolean respuesta = scanner.nextBoolean();
            if (respuesta) {
                puntuacion += 3;
            }
        }

        // Evaluar el resultado
        System.out.println("\n--- Resultado del test ---");

        if (puntuacion <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (puntuacion <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más.");
        }

        scanner.close();
    }
}
