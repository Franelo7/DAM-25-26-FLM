package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {

    static void desordenar(int t[]) {
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            int rand = rnd.nextInt(t.length);
            int aux = t[i];
            t[i] = t[rand];
            t[rand] = aux;

        }

    }

    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4 };
        desordenar(t);
        System.err.println(Arrays.toString(t));
    }
}
