package ud3.arrays;

/**
 * @author Fran
 */

public class FuncionBuscar {
    static int buscar(int t[], int clave) {
        boolean esClave = false;
        int posicion = -1;
        for (int j = 0; j < t.length && esClave == false; j++) {
            if (t[j] == clave) {
                esClave = true;
                posicion = j;
            }
        }
        return posicion;
    }

}
