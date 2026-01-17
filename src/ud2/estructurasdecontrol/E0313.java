package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0313 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        int contadorSuspenso = 0;
        int contadorCondicionado = 0;
        int contadorAprobado = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce una nota: ");
            n = sc.nextInt();
            if (n < 5) {
                if (n == 4) {
                    contadorCondicionado++;
                } else {
                    contadorSuspenso++;
                }
            } else {
                contadorAprobado++;
            }

        }
        System.out.println("Hay " + contadorSuspenso + " suspensos");
        System.out.println("Hay " + contadorCondicionado + " condicionados");
        System.out.println("Hay " + contadorAprobado + " aprobados");
    }
}
