package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0308 {
    public static void main(String[] args) {
        final int NUMEROS = 10;
        Scanner sc = new Scanner(System.in);
        int n;
        double n1 = 0;
        for (int i = 1; i <= NUMEROS; i++) {
            System.out.print("Escribe un número: ");
            n = sc.nextInt();
            n1 += n;
        }
        System.out.println("La media es: " + n1 / 10);
    }
}
