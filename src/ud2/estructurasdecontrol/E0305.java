package ud2.estructurasdecontrol;

import java.util.Random;
import java.util.Scanner;

public class E0305 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        int r1, r2, resultado, n;
        int contador = 0;
        int fallos = 0;

        do {
            r1 = rnd.nextInt(10) + 1;
            r2 = rnd.nextInt(10) + 1;
            resultado = r1 + r2;

            System.out.print(r1 + " + " + r2 + " = ");
            n = sc.nextInt();
            if (resultado == n) {
                contador++;
            } else {
                fallos++;
            }
        } while (fallos < 3);
        System.out.println("Numero de aciertos: " + contador);

    }
}
