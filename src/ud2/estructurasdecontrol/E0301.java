package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0301 {
    public static void main(String[] args) {
        boolean activar = true;
        Scanner sc = new Scanner(System.in);
        while (activar) {
            System.out.print("Introduce un número: ");
            int n = sc.nextInt();
            if (n == 0) {
                activar = false;
            } else {
                if (n % 2 == 0) {
                    System.out.println("El número es par");
                } else {
                    System.out.println("El número es impar");
                }
                if (n > 0) {
                    System.out.println("El número es positivo");
                } else {
                    System.out.println("El número es negativo");
                }
                System.out.println("El cuadrado del número es " + Math.pow(n, 2));
            }
        }
    }
}
