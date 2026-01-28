package ud3.arrays;

public class FuncionBuscar {
    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 10, 5, 6, 10, 8, 9, 10 };
        System.out.println(buscar(t, 3));
    }

    static int buscar(int t[], int clave) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                return i;
            }
        }
        return -1;
    }
}
