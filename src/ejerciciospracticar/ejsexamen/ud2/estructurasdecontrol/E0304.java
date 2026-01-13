package ejerciciospracticar.ejsexamen.ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean comienzo = true;
        int nArbol = 0;
        int hMax = 0;
        int etiqueta = 0;
        while (comienzo) {
            System.out.println("Introduce la altura del árbol en cm: ");
            int h = sc.nextInt();
            if (h == -1) {
                comienzo = false;
            } else {
                nArbol++;
                if (h > hMax) {
                    hMax = h;
                    etiqueta = nArbol;
                }
            }

        }
        System.out.println("La altura más alta fue del árbol número " + etiqueta + " y su altura fue de " + hMax);
    }
}
