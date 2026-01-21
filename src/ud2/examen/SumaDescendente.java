package ud2.examen;

import java.util.Scanner;

public class SumaDescendente {
    public static void main(String[] args) {
        int n = 4578; // Scanner
        System.out.println(sumaDescendente3(n));
    }

    static double sumaDescendente3(int n) {
        int suma = 0;
        for (int i = 10; i <= n; i *= 10) {
            suma += n % i;
        }
        return suma + n;

    }

    static void sumaDescendente2(int n) {
        int suma = 0;
        for (int i = 10; i <= n; i *= 10) {
            suma += n % i;
        }
        System.out.println(n + suma);
    }

    private static int sumaDescendente(int n) {
        int suma = 0;
        for (int i = 10; i <= n; i *= 10) {
            suma += n % i;
        }
        return suma;
    }

}