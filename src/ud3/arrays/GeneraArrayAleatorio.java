package ud3.arrays;

import java.util.Random;

public class GeneraArrayAleatorio {
    public static void main(String[] args) {
        int cantidad = 10;
        int[] a = arrayAleatorio(cantidad);
        for (int i = 0; i < cantidad; i++) {
            System.out.println(a[i]);
        }
    }

    static int[] arrayAleatorio(int n) {
        Random rd = new Random();
        int r;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            r = rd.nextInt(19) - 9;
            array[i] = r;
        }
        return array;
    }
}
