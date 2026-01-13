package ud3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sueldos = new double[0];

        System.out.print("Introduce el sueldo: ");
        double sueldo = sc.nextDouble();
        while (sueldo != -1) {
            // Procesar entrada: Añadir el sueldo al array
            sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
            sueldos[sueldos.length - 1] = sueldo;
            // Leer siguiente
            System.out.print("Introduce el sueldo: ");
            sueldo = sc.nextDouble();
        }
        if (sueldo > 0) {

            // ordenar sueldos
            Arrays.sort(sueldos);

            System.out.println();

            for (int i = sueldos.length - 1; i >= 0; i--) {
                System.out.print(sueldos[i] + " ");
            }

            System.out.println();

            System.out.println("Máximo sueldo " + sueldos[sueldos.length - 1]);
            System.out.println("Mínimo sueldo " + sueldos[0]);

            double suma = 0;
            for (double s : sueldos) {
                suma += s;
            }
            double media = suma / sueldos.length;
            System.out.println("Media de sueldos: " + media);

            int contSueldosMayoresMedias = 0;
            int contSueldosMenoresMedias = 0;
            for (double s : sueldos) {
                if (s > media)
                    contSueldosMayoresMedias++;
                else if (s < media)
                    contSueldosMenoresMedias++;
            }
            System.out.println("Número de sueldos por encima de la media: " + contSueldosMayoresMedias);
            System.out.println("Número de sueldos por debajo de la media: " + contSueldosMenoresMedias);
        }
    }

}
