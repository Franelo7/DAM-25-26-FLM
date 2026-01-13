package ejerciciospracticar.masejercicios;
public class E0407_NumDivisoresPrimos {

    public static boolean esPrimo(int n) {
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        boolean primo = contador > 2;
        return !primo;
    }

    static int numDivisoresPrimos(int n) {
        int numDivisoresPrimos = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && esPrimo(i)) {
                numDivisoresPrimos++;
            }
        }

        return numDivisoresPrimos;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            int numDivisoresPrimos = numDivisoresPrimos(i);
            System.out.println(i + " - " + numDivisoresPrimos);
        }
    }
}
