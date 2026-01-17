package ud2.ejercicios;

import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        digitoAtrasDelante(n);
        System.out.println();
        digitoDelanteAtras(n);
    }

    static void digitoAtrasDelante(int n) {
        for (int i = 1; i <= n; i *= 10) {
            System.out.println(n / i % 10);
        }
    }

    static void digitoDelanteAtras(int n) {
        int invertido = 0;
        while (n != 0) {
            invertido = invertido * 10 + n % 10;
            n = n / 10;
        }
        for (int i = 1; i <= invertido; i *= 10) {
            System.out.println(invertido / i % 10);

        }
    }

}
