package ud3.arrays;

import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los numeros: ");
        int numero = sc.nextInt();

        int [] cajita = new int[numero];

        for (int i = 0; i < cajita.length; i++) {
            System.out.print("Introduce el numero" + (i + 1) + ": ");
            cajita[i] = sc.nextInt();
        }

        int sumaPositivos = 0;
        int contadorDePositivos = 0;
        int sumaNegativos = 0;
        int contadorDeNegativos = 0;

    }
}
