package ud3.arrays;

import java.util.Arrays;

public class E0510 {
    static int[] eliminarMayores(int t[], int valor) {
        Arrays.sort(t);
        for (int i = 0; i < t.length; i++) {
            if (t[i] > valor) {
                t[i] = t[t.length - 1];
                t = Arrays.copyOf(t, t.length - i);
            }

        }
        return t;
        
    }

    public static void main(String[] args) {
        int[] t = { 1, 23, 11, 3, 11, 2 };
        int valor = 10;
        System.err.println(Arrays.toString(eliminarMayores(t, valor)));
    }
}
