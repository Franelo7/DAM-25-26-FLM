package ud3.arrays;

/**
 * @author Fran
 */
public class FuncionContar {
    static int contar(int t[], int clave) {
        int contador = 0;
        for (int j = 0; j < t.length; j++) {
            if (t[j] == clave) {
                contador++;
            }
        }
        return contador;
    }
public static void main(String[] args) {

}
}