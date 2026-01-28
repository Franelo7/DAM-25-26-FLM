package ud3.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0511_CamaraSecreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de la contraseña: ");
        int n = sc.nextInt();
        int[] t1 = introducir(n, sc);
        int[] t2 = combinacionSecreta(n);
        boolean comprobar = comprobar(t1, t2);

        while (!comprobar) {
            pistas(t1, t2, comprobar);
            t1 = introducir(n, sc);
            comprobar = comprobar(t1, t2);
            if (comprobar) {
                pistas(t1, t2, comprobar);
            }
        }
    }

    static int[] introducir(int n, Scanner sc) {
        int[] t1 = new int[n];
        for (int i = 0; i < t1.length; i++) {
            System.out.println("Introduce los dígitos");
            t1[i] = sc.nextInt();
        }
        return t1;
    }

    static void pistas(int[] t1, int[] t2, boolean comprobar) {
        if (comprobar) {
            System.out.println("Acertaste!!");
        } else {

            for (int i = 0; i < t1.length; i++) {
                if (t1[i] == t2[i]) {
                    System.out.println("Dígito " + (i + 1) + " correcto");
                }
                if (t1[i] > t2[i]) {
                    System.out.println("Dígito " + (i + 1) + " introducido menor");
                }
                if (t1[i] < t2[i]) {
                    System.out.println("Dígito " + (i + 1) + " introducido mayor");
                }
            }
        }
    }

    static boolean comprobar(int[] t1, int[] t2) {
        if (Arrays.equals(t1, t2)) {
            return true;
        }
        return false;

    }

    static int[] combinacionSecreta(int n) {
        Random rnd = new Random();
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            int rand = rnd.nextInt(10);
            t[i] = rand;
        }
        return t;
    }
}
