package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class E0508 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] t = new int[10];
        for (int i = 0; i < t.length; i++) {
            int rand = rnd.nextInt(100) + 1;
            t[i] = rand;
        }

        System.out.println(Arrays.toString(getPares(t)));
        System.out.println(Arrays.toString(getImpares(t)));
    }

    static int[] getPares(int t[]) {
        int[] tPares = new int[0];
        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                tPares = Arrays.copyOf(tPares, tPares.length + 1);
                tPares[contador] = t[i];
                contador++;
            }
        }
        return tPares;
    }

    static int[] getImpares(int t[]) {
        int[] tImpares = new int[0];
        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0) {
                tImpares = Arrays.copyOf(tImpares, tImpares.length + 1);
                tImpares[contador] = t[i];
                contador++;
            }
        }
        return tImpares;
    }
}
