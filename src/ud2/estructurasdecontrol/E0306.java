package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número para aprender a contar: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ", ");
        }
    }
}
