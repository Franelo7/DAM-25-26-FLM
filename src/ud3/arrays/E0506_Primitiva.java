package ud3.arrays;

import java.util.Arrays;

public class E0506_Primitiva {

    static int[] tablaAleatoria(int numInicio, int numFin, int longitud) {
        int[] tabla = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            tabla[i] = (int) (Math.random() * (numFin - numInicio - 1)) + numInicio;
        }
        return tabla;

    }

    static int numAciertos(int[] apuesta, int[] ganador) {
        int aciertos = 0;
        for (int num : apuesta) {
            int pos = Arrays.binarySearch(ganador, num);
            if (pos >= 0) {
                aciertos++;
            }

        }
        return aciertos;
    }

    public static void main(String[] args) {
        int[] apuesta = { 7, 10, 11, 24, 6, 13 };
        int[] resultado = tablaAleatoria(1, 49, 6);
        Arrays.sort(resultado);
        System.out.println("Salieron los numeros: " + Arrays.toString(resultado));
        System.out.println("Aciertos " + numAciertos(apuesta, resultado));

    }

}
