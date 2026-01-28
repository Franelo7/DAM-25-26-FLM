package ud3.arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class E0505 {
    static int[] rellenaPares(int longitud, int fin) {
        Random rnd = new Random();
        int[] t = new int[longitud];
        for (int i = 0; i < t.length; i++) {
            int aleatorio = rnd.nextInt(fin + 1);
            if (aleatorio % 2 != 0 || aleatorio < 2) {
                i--;
            } else {
                t[i] = aleatorio;
            }
        }
        Arrays.sort(t);
        return t;
    }

    public static void main(String[] args) {
        int longitud = 5;
        int fin = 10;
        System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
    }
}
