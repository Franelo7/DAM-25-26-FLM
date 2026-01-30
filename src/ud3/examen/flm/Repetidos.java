package ud3.examen.flm;

import java.util.Arrays;

/**
 * @author Fran
 */
public class Repetidos {
    public static void main(String[] args) {
        int t[] = { 1, 3, 5, 3, 7, 4, 2, 8, 2, 4, 6, 2, 6 };
        System.out.println(Arrays.toString(repetidos(t)));
    }

    static int[] repetidos(int t[]) {
        int[] tRepetidos = new int[0];

        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i] == t[j] && t[i] != 0) {
                    t[j] = 0;
                    tRepetidos = Arrays.copyOf(tRepetidos, tRepetidos.length + 1);
                    tRepetidos[tRepetidos.length - 1] = t[i];

                }
            }
        }

        return tRepetidos;
    }
}
