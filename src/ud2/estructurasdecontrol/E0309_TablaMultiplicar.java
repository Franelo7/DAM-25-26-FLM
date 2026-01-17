package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0309_TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre 1 y 10: ");
        int n = sc.nextInt();
        if (n <= 10 && n >= 1) {
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d x %d = %d %n", n, i, n * i);
            }
        } else {
            System.out.println("El número introducido no está entre 1 y 10");
        }
    }
}
