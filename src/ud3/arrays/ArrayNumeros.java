package ud3.arrays;

import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        int[] t1 = new int[n];
        int contadorCeros = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el valor " + i + " para la tabla: ");
            int n2 = sc.nextInt();
            t1[i] = n2;
        }
        for (int i = 0; i < t1.length; i++) {
            if (t1[i] > 0) {
                contadorPositivos++;
            }
            if (t1[i] < 0) {
                contadorNegativos++;
            }
            if (t1[i] == 0) {
                contadorCeros++;
            }
        }
        System.out.println(contadorCeros + "" + contadorNegativos + "" + contadorPositivos);
    }
}
