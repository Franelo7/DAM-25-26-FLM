package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0315_TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de n: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println();
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
        }
    }
}
