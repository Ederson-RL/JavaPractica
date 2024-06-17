public class Vectores {
    public static void main(String[] args) {
        int[] numeros = { 10, 20, 30, 40, 50 };
        int indice = 0;

        for (int numero : numeros) {
            System.out.println(numero);
            System.out.println(indice);
            indice ++;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
