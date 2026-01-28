package ud3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E0503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t[] = new int[n];
        n = n - 1;

        for (int i = n; i >= 0; i--) {
            int n2 = sc.nextInt();
            t[i] = n2;
        }
        System.out.println(Arrays.toString(t));
    }
}
