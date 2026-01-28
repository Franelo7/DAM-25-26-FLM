package ud3.arrays;

import java.util.Arrays;

public class E0512 {
    public static void main(String[] args) {
        int[][] t = new int[5][5];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t[i][j] = 10 * i + j;
            }
        }
        System.out.println(Arrays.deepToString(t));
    }
}
