package ejerciciospracticar;
import java.util.Scanner;

public class EP0211 {
    /*
     * EP0211. Escribe una aplicación que solicite al usuario un número comprendido
     * entre 0 y
     * 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
     * Amplía: eres capaz de escribir un programa que funcione para números de
     * cualquier
     * número de cifras? (dentro del rango de los tipos de datos enteros).
     * Encapsula el algoritmo en un método con el siguiente prototipo:
     * public static boolean esCapicua(long n)
     */
    /*
     * if (n < 10) {
     * System.out.println("si es");
     * }
     * 
     * if (n < 100 && n > 10) {
     * int primer = n % 10;
     * System.out.println(primer);
     * int segundo = n / 10;
     * System.out.println(segundo);
     * if (primer + segundo == n) {
     * System.out.println("es capicua");
     * } else {
     * System.out.println("no lo es");
     * }
     * }
     * if (n < 1000 && n > 100) {
     * int primer = n % 10;
     * System.out.println(primer);
     * int segundo = (n / 10) % 10;
     * System.out.println(segundo);
     * int tercero = n / 100;
     * System.out.println(tercero);
     * if (primer + segundo + tercero == n) {
     * System.out.println("es capicua");
     * } else {
     * System.out.println("no lo es");
     * }
     * }
     * if (n < 10000 && n > 1000) {
     * int primer = n % 10;
     * System.out.println(primer);
     * int segundo = (n / 10) % 10;
     * System.out.println(segundo);
     * int tercero = (n / 100) % 10;
     * System.out.println(tercero);
     * int cuarto = n / 1000;
     * System.out.println(cuarto);
     * 
     * if (primer + segundo + tercero + cuarto == n) {
     * System.out.println("es capicua");
     * } else {
     * System.out.println("no lo es");
     * }
     * }
     */

    public static int digito(int n) {
        int reverso = 0;
        for (int i = 1; i <= n; i *= 10) {
            int dig = n / i % 10;
            reverso = reverso * 10 + dig;
        }
        return reverso;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        comprobar(n);

    }

    private static void comprobar(int n) {
        if (digito(n) == n) {
            System.err.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}