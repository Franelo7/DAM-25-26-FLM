package ejerciciospracticar.ejsexamen.ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x;
        System.out.print("Escribe valor de a: ");
        a = sc.nextInt();
        System.out.print("Escribe valor de b: ");
        b = sc.nextInt();
        System.out.print("Escribe valor de c: ");
        c = sc.nextInt();
        double raiz = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        if (raiz < 0) {
            System.out.println("No hay soluciones con números reales");
        } else {
            x = (-b + raiz) / 2 * a;
            double x2 = (-b - raiz) / 2 * a;
            System.out.println(x);
            System.out.println(x2);
        }
    }
}
