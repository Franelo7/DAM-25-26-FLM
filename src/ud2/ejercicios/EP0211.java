package ud2.ejercicios;

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        System.out.println(esCapicua(n));
    }

    public static boolean esCapicua(int n) {
        int invertido = 0;
        int nSinVariar = n;
        while (n != 0) {
            invertido = invertido * 10 + n % 10;
            n = n / 10;
        }
        if (invertido == nSinVariar) {
            return true;
        } else {
            return false;
        }
    }


}
