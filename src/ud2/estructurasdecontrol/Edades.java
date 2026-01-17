package ud2.estructurasdecontrol;

import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edadMax = 0;
        int edadMin = 0;
        boolean activar = true;
        while (activar) {
            System.out.print("Introduce tu edad: ");
            int n = sc.nextInt();
            if (n == -1) {
                activar = false;
            } else {
                if (n > edadMax) {
                    edadMax = n;
                }
                if (edadMin == 0) {
                    edadMin = n;
                }
                if (edadMin > n) {
                    edadMin = n;
                }
            }

        }
        System.out.println("La edad máxima es de: " + edadMax);
        System.out.println("La edad mínima es de: " + edadMin);
    }
}
