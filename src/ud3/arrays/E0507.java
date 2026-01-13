package ud3.arrays;

import java.util.Arrays;

public class E0507 {
    static boolean buscar(int t[], int clave) {
        for (int i = 0; i < t.length; i++)
            if (t[i] == clave)
                return true;
        return false;
    }

    static int[] sinRepetidos(int t[]) {
        int[] tablaNueva = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (buscar(tablaNueva, t[i]) == false) {
                tablaNueva = Arrays.copyOf(tablaNueva, tablaNueva.length + 1);
                tablaNueva[tablaNueva.length - 1] = t[i];
            }
        }
        return tablaNueva;
    }

    public static void main(String[] args) {
        int[] tabla1 = { 3, 4, 3, 7 };
        int tabla_Sin_Repetidos[] = sinRepetidos(tabla1);
        System.out.println(Arrays.toString(tabla_Sin_Repetidos));

    }
}
