package ud3.arrays;

import java.util.Arrays;

public class E0510 {
    public static void main(String[] args) {
        int t[] = { 30, 20, 10, 10, 50 };
        int valor = 30;
        int num = 10;
        System.out.println(Arrays.toString(borrarTodosOrdenado(t, num)));
    }

    static public int[] borrarOrdenado(int[] t, int num) {
        Arrays.sort(t);
        int pos = Arrays.binarySearch(t, num);
        if (pos >= 0) {
            t[pos] = 0;
            Arrays.sort(t);
            System.arraycopy(t, pos + 1, t, 0, t.length - 1);
            t = Arrays.copyOf(t, t.length - pos - 1);
            return t;
        }
        return null;
    }

    static public int[] borrarTodosOrdenado(int[] t, int num) {
        Arrays.sort(t);
        for (int i = 0; i < t.length; i++) {
            int pos = Arrays.binarySearch(t, num);
            if (pos >= 0) {
                t[pos] = 0;
                Arrays.sort(t);
                System.arraycopy(t, pos + 1, t, 0, t.length - 1);
                t = Arrays.copyOf(t, t.length - pos - 1);
            }
        }
        return t;
    }

    static int[] eliminarMayores(int t[], int valor) {
        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > valor) {
                t[i] = 0;

            }
        }
        Arrays.sort(t);
        for (int i = 0; i < t.length; i++) {
            if (t[i] == 0) {
                contador++;
            }
        }
        System.arraycopy(t, contador, t, 0, t.length - contador);
        t = Arrays.copyOf(t, t.length - contador);
        return t;
    }
}
