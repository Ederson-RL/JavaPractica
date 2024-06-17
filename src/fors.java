public class fors {
    public static void main(String[] args) {
        System.out.println("");

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        int contador = 1;
        
        while (contador <= 10) {
            System.out.println(contador);
            contador ++;
        }

        contador = 1;

        do {
            System.out.println(contador);
            contador ++;
        } while (contador <=10);
    }
}
