package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

public class E0315_TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de N: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
