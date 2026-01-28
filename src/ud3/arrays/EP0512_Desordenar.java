package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {
    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 5, 6 };
        desordenar(t);
    }

    static void desordenar(int t[]) {
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            int rand = rnd.nextInt(t.length);
            int aux = t[i];
            t[i] = t[rand];
            t[rand]= aux;
        }
        System.out.println(Arrays.toString(t));
    }
}
