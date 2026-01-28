package ud3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t[] = new double[5];
        for (int i = 0; i < 5; i++) {
            double n = sc.nextDouble();
            t[i] = n;
        }
        System.out.println(Arrays.toString(t));
    }
}
