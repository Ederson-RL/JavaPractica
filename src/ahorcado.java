import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) {
        System.out.println("Escribre una letra");

        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "farmacia";
        int IntentosMax = 10;
        int Intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_'; 
        }

        // System.out.println(letrasAdivinadas);

        while (!palabraAdivinada && Intentos < IntentosMax) {
            System.out.println("Palabra a adivinar" + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra por favor");

            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            for (int i = 0; i < letrasAdivinadas.length; i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                Intentos ++;
                System.out.println("letra incorrecta, te quedan " + (IntentosMax - Intentos) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Genial has adivinado la palabra completa!");
            }

            if (Intentos >= IntentosMax) {
                System.out.println("Lo siento, no te quedan mas intentos");
                System.out.println("Game over");
            }
        }
        scanner.close();
        
    }
}