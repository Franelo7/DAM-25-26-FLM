package ud3.arrays;

import java.util.Arrays;

import java.util.Random;

public class EP0513 {
    static int[] copiaDesordenada(int[] tOrdenada) {
        int[] t = tOrdenada.clone();
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            int rand = rnd.nextInt(t.length);
            int aux = t[i];
            t[i] = t[rand];
            t[rand] = aux;

        }
        return t;
    }

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4 };
        int[] numerosDesordenados = copiaDesordenada(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numerosDesordenados));
    }
}