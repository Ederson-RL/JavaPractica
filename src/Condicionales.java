import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la maquina expendedora de comida");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que bebida te gusta?");
        System.out.println("1 - café");
        System.out.println("2 - gaseosa");
        System.out.println("3 - mate");
        System.out.println("4 - vino");
        int opcion = scanner.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("Excelente elección, el café combina con java");
                break;
            case 2:
                System.out.println("Ten cuidado con el azucar");
                break;
            case 3:
                System.out.println("por que esa nariz tan grande? que mentira dijiste?");
                break;
            case 4:
                System.out.println("te vas a matar prro, plis no manejes :v");
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }

    }
}
