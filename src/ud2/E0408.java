package ud2;

import java.util.Scanner;

public class E0408 {
    public static void main(String[] args) {
        System.out.println(calculadora(4, 2, 1));
    }

    static double calculadora(double n, double n2, int operacion) {
        double resultado = 0;
        if (operacion == 1) {
            resultado = n + n2;
        }
        if (operacion == 2) {
            resultado = n - n2;
        }
        if (operacion == 3) {
            resultado = n * n2;

        }
        if (operacion == 4) {
            resultado = n / n2;

        }
        return resultado;
    }
}
