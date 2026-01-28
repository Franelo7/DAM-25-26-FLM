package ud3.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GeneraArrayAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(arrayAleatorio(n)));
    }

    static int[] arrayAleatorio(int n) {
        int[] t = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            int random = rnd.nextInt(19) - 9;
            t[i] = random;
        }
        return t;
    }
}
