package ud3.arrays;

public class FuncionContar {
    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 10, 5, 6, 10, 8, 9, 10 };
        int clave = 10;
        System.out.println(contar(t, clave));
    }

    static int contar(int t[], int clave) {
        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contador++;
            }
        }
        return contador;
    }
}
