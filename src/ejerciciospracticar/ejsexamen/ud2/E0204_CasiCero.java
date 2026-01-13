package ejerciciospracticar.ejsexamen.ud2;

import java.util.Scanner;

public class E0204_CasiCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double n = sc.nextDouble();
        if (n < 0 || n >= -1 || n == 0) {
            System.out.println("El número no se considera casi 0");
        } else {
            System.out.println("El numero es un casi 0");
        }
    }
}
