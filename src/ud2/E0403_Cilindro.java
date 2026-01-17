package ud2;

import java.util.Scanner;

public class E0403_Cilindro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio de la base: ");
        int r = sc.nextInt();
        System.out.print("Introduce la altura: ");
        int h = sc.nextInt();
        System.out.printf("El área es: %.2f %n", area(r, h));
        System.out.printf("El volumen es: %.2f %n", volumen(r, h));

    }

    static double area(int r, int h) {
        double area = 2 * Math.PI * r * (h + r);
        return area;
    }

    static double volumen(int r, int h) {
        double volumen = Math.PI * Math.pow(r, 2) * h;
        return volumen;
    }
}
