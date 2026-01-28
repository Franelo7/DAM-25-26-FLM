package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class E0506_Primitiva {
    public static void main(String[] args) {
        int[] apuesta = { 3, 4, 5, 3, 1, 5 };
        int[] ganadora = tablaAleatoria(1, 99, 6);
        System.out.println(numAciertos(apuesta, ganadora));
    }

    static int[] tablaAleatoria(int numInicio, int numFin, int longitud) {
        Random rnd = new Random();
        int t[] = new int[longitud];
        for (int i = 0; i < t.length; i++) {
            double random = Math.random() * (numFin - numInicio - 1) + numInicio;
            t[i] = (int) random;
        }
        return t;
    }

    static int numAciertos(int[] apuesta, int[] ganadora) {
        int contador = 0;
        Arrays.sort(ganadora);
        for (int i = 0; i < ganadora.length; i++) {
            for (int j = i; j < ganadora.length; j++) {
                if (apuesta[i] == ganadora[j]) {
                    contador++;
                }
            }
        }
        return contador;
    }

}
