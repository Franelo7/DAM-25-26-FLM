package ud3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {
    public static void main(String[] args) {
        double[] t1 = encuesta();
        maxMinMedia(t1);

    }

    static void maxMinMedia(double[] t1) {
        Arrays.sort(t1);
        double suma = 0;

        int contadorPorDebajo = 0;
        int contadorPorEncima = 0;

        for (int i = 0; i < t1.length; i++) {
            suma += t1[i];
        }
        double media = suma / t1.length;
        for (int i = 0; i < t1.length; i++) {

            if (t1[i] > media) {
                contadorPorEncima++;
            } else if (t1[i] < media) {
                contadorPorDebajo++;
            }

        }
        System.out.println("El sueldo máximo es: " + t1[t1.length - 1]);
        System.out.println("El sueldo mínimo es: " + t1[0]);
        System.out.println("La media de sueldos es de: " + media);
        System.out.println("Hay un total de " + contadorPorEncima + " sueldos por encima de la media");
        System.out.println("Hay un total de " + contadorPorDebajo + " sueldos por debajo de la media");
    }

    static double[] encuesta() {
        Scanner sc = new Scanner(System.in);
        boolean iniciar = true;
        double sueldo;
        double[] t = new double[0];
        while (iniciar) {
            System.out.println("Introduce tu sueldo (-1 para salir): ");
            sueldo = sc.nextDouble();
            if (sueldo == -1) {
                iniciar = false;
            } else {
                t = Arrays.copyOf(t, t.length + 1);
                t[t.length - 1] = sueldo;
            }
        }
        return t;
    }
}
