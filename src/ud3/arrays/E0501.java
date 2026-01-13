package ud3.arrays;

import java.util.Random;

public class E0501 {
    public static void main(String[] args) {

        int[] tabla = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < tabla.length; i++) {
            int numAleatorio = rnd.nextInt(100) + 1;
            tabla[i] = numAleatorio;
        }

        // Método 1
        int sumaArray = 0;

        for (int numero : tabla) {
            sumaArray += numero;
        }

        System.out.println(sumaArray);

        int sumaArray2 = 0;
        for (int i = 0; i < tabla.length; i++) {
            sumaArray2 += tabla[i];
        }

        System.out.println(sumaArray2);
    }
}
