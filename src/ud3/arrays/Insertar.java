package ud3.arrays;

import java.util.Arrays;

public class Insertar {
    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(insertarAlFinal(t, 6)));
        System.out.println(Arrays.toString(insertarAlInicio(t, 6)));
        System.out.println(Arrays.toString(insertarEnPosicion(t, 6, 3)));
    }

    static public int[] insertarAlFinal(int[] t, int num) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = num;
        return t;
    }

    static public int[] insertarAlInicio(int[] t, int num) {
        t = Arrays.copyOf(t, t.length + 1);
        System.arraycopy(t, 0, t, 1, t.length - 1);
        t[0] = num;
        return t;
    }

    static public int[] insertarEnPosicion(int[] t, int num, int pos) {
        t = Arrays.copyOf(t, t.length + 1);
        System.arraycopy(t, pos, t, pos + 1, t.length - pos - 1);
        t[pos] = num;
        return t;
    }

}
