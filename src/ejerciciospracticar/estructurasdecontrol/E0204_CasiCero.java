package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

public class E0204_CasiCero {
    /*
     * Implementar un programa que pida por teclado un número decimal e indique si
     * es un número casi-cero que son aquellos, positivos o negativos, que se
     * acercan a 0 por menos de
     * 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero.
     * Ejemplos de números
     * casi-cero son el 0,3, el -0,99 o el 0,123; algunos números que no se
     * consideran casi-ceros son: el
     * 12,3, el 0 o el -1.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número casi 0: ");
        double var = sc.nextDouble();
        if (var == 0) {
            System.out.printf("El número %.2f  no es un número casi 0", var);
        } else if (var > -1 && var < 1) {
            System.out.printf("El número %.2f es un número casi 0", var);
        } else {
            System.out.printf("El número %.2f  no es un número casi 0", var);

        }
        sc.close();
    }
    
}
