package ud2;

public class E0406_Primo {
    public static void main(String[] args) {
        int contador = 0;
        for (int n = 1; n <= 100; n++) {
            if (esPrimo(n) == true) {
                contador++;
            }
        }
        System.out.println(contador);
    }

    static boolean esPrimo(int n) {
        int contador = 0;
        if (n == 1 || n == 0) {
            return false;
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                return true;
            } else {
                return false;
            }
        }
    }
}
