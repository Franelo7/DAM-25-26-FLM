package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

public class App {

    public static int sumaHasta(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaHasta(n - 1);

        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        System.out.println(sumaHasta(n));
        sc.close();
        /*
         * int suma = 0;
         * for (int i = 1; i <= n; i++) {
         * suma += i;
         * }
         * System.out.println("El número es " + suma);
         * 
         */
    }
}
