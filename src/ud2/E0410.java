package ud2;

public class E0410 {
    public static void main(String[] args) {
        int a = 4;
        int n = 4;
        System.out.println(elevarIterativa(a, n));
        System.out.println(elevarRecursiva(a, n));
    }

    static int elevarIterativa(int a, int n) {
        int resultado = a;
        for (int i = 1; i < n; i++) {
            resultado = a * resultado;
        }
        return resultado;
    }

    static int elevarRecursiva(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * elevarRecursiva(a, n - 1);
        }
    }
}
