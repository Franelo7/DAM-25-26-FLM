package ud3.arrays;

import java.util.Arrays;

/**
 * @author Fran 
 */

/*
    E0505. Escribe la función: static int[] rellenaPares(int longitud, int
    fin) que crea y devuelve una tabla ordenada de la longitud especificada rellena con
    números pares aleatorios en el rango desde 2 hasta el valor de fin inclusive.
 */

public class E0505 {
    static int[] rellenaPares(int longitud, int fin) {
        int[] tabla = new int[longitud];

        for (int i = 0; i < tabla.length; i++) {
            int aleatorio = (int) (Math.random() * (fin / 2) + 1);
            tabla[i] = aleatorio * 2;
        }

        Arrays.sort(tabla);
        return tabla;

    }

    public static void main(String[] args) {
        int[] resultado = rellenaPares(10, 30);
        System.out.println(Arrays.toString(resultado));
    }
}
