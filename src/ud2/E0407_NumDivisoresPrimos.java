package ud2;

public class E0407_NumDivisoresPrimos {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(numDivisoresPrimos(n));
    }

    static int numDivisoresPrimos(int n) {
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (50 % i == 0 && E0406_Primo.esPrimo(i) == true) {
                contador++;
            }
        }
        return contador;
    }

}
