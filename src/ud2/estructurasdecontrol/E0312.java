package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        int contadorSuspenso = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce una nota: ");
            n = sc.nextInt();
            if (n < 5) {
                contadorSuspenso++;
            }

        }
        System.out.println("Hay " + contadorSuspenso + " suspensos");
    }
}
