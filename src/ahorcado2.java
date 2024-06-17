import java.util.Scanner;

public class ahorcado2 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al juego del ahorcado!");

        String palabraSecreta = "aguacate";
        int intentos = 0;
        int intentosMax = 10;
        char[] caracteresEncontrados = new char[palabraSecreta.length()];
        boolean palabraAdivinada = false;

        for (int i = 0; i < caracteresEncontrados.length; i++) {
            caracteresEncontrados[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMax) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Palabra oculta:" + String.valueOf(caracteresEncontrados));

            System.out.println("Escribe una letra: ");
            char letra = scanner.next().charAt(0);
            boolean letraCorrecta = false;

            for (int i = 0; i < caracteresEncontrados.length; i++) {
                if (letra == palabraSecreta.charAt(i)) {
                    letraCorrecta = true;
                    caracteresEncontrados[i] = letra;
                }
            }

            if (!letraCorrecta) {
                intentos ++;
                System.out.println("La letra no está en la palabra te quedan " + (intentosMax - intentos) + " Intentos" );

            }

            if (palabraSecreta.equals(String.valueOf(caracteresEncontrados))) {
                System.out.println("has adivinado la palabra, felicidades!");
                palabraAdivinada = true;
            }

        }

    }
}
