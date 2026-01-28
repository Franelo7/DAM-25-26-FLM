package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class E0501 {
    public static void main(String[] args) {
        System.out.println(suma(arrayAleatorio(10)));
    }

    static int suma(int[] t) {
        int suma = 0;
        for (int i = 0; i < t.length; i++) {
            suma += t[i];
        }
        return suma;
    }

    static int[] arrayAleatorio(int n) {
        int[] t = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            int random = rnd.nextInt(100) + 1;
            t[i] = random;
        }
        return t;
    }
}
