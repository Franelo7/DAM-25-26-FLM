package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class EP0513 {
    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(copiaDesordenada(t)));
    }

    static int[] copiaDesordenada(int[] t) {
        Random rnd = new Random();
        int[] t1 = Arrays.copyOf(t, t.length);
        for (int i = 0; i < t1.length; i++) {
            int rand = rnd.nextInt(t1.length);
            int aux = t1[i];
            t1[i] = t1[rand];
            t1[rand] = aux;
        }
        return t1;
    }
}
