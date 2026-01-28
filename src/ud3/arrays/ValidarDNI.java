package ud3.arrays;

import java.util.Arrays;

public class ValidarDNI {
    public static void main(String[] args) {
        int numero = 77481421;
        char letra = 'X';
        System.out.println(esValidoDNI(numero, letra));
    }

    static boolean esValidoDNI(int numero, char letra) {
        char[] t = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E' };
        int valor = numero % 21;
        char t1 = t[valor];
        if (letra == t1) {
            return true;
        }
        return false;
    }
}
