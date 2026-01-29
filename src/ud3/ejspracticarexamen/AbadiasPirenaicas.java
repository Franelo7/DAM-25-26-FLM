package ud3.ejspracticarexamen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AbadiasPirenaicas {
    public static void main(String[] args) {
        int[] alturas = { 3000, 3500, 3200, 3400, 3200 };
        // 0 1 2 3 4
        int abadias = 0;
        int resultado = 0;
        int[] posiciones = new int[0];
        for (int i = 0; i < 4; i++) {
            if (alturas[i] < alturas[i + 1]) {
                continue;
            }
            for (int j = i; j < 4; j++) {
                if (alturas[i] > alturas[j + 1]) {
                    abadias++;
                }
            }
            resultado = abadias - i;
            posiciones = Arrays.copyOf(posiciones, posiciones[1]);
            posiciones[i] = resultado;
        }
        System.out.println(resultado);
    }
}
