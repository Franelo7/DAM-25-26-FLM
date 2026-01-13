package ejerciciospracticar.ejsexamen.ud2.estructurasdecontrol;

import java.util.Random;
import java.util.Scanner;

public class E0303_NumeroSecreto {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int nRandom = rnd.nextInt(100) + 1;
        boolean comienzo = true;
        int nIntentos = 0;
        System.out.println(nRandom);
        while (comienzo) {
            System.out.println("Introduce un número del 1-100");
            int n = sc.nextInt();
            if (n == -1) {
                System.out.println("El número secreto era: " + nRandom);
                comienzo = false;
            } else {
                nIntentos++;
                if (n > nRandom) {
                    System.out.println("El número es menor");
                } else if (n < nRandom) {
                    System.out.println("El número es mayor");
                }
                if (n == nRandom) {
                    System.out.println("Enhorabuena has acertado el número!!!");
                    System.out.println("El número de intentos fue de: " + nIntentos);
                    comienzo = false;
                }
            }
        }

    }
}
