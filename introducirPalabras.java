import java.util.Scanner;

public class introducirPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar palabra 1
        System.out.print("Introduzca palabra 1: ");
        String palabra1 = scanner.nextLine();

        // Solicitar palabra 2
        System.out.print("Introduzca palabra 2: ");
        String palabra2 = scanner.nextLine();

        // Solicitar palabra 3
        System.out.print("Introduzca palabra 3: ");
        String palabra3 = scanner.nextLine();

        // Mostrar las palabras en una línea
        System.out.println(palabra1 + " " + palabra2 + " " + palabra3);

        scanner.close();
    }
}

