package ejerciciospracticar.masejercicios;
public class E0406_Primo {
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

    public static void main(String[] args) {
        System.out.println(esPrimo(4));

    }
}
