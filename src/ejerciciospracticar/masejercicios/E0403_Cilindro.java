package ejerciciospracticar.masejercicios;
import java.util.Scanner;

public class E0403_Cilindro {

    public static double calculoArea(double r, double h) {
        double area = 2 * Math.PI * r * (h + r);
        return area;

    }

    public static double calculoVolumen(double r, double h) {
        double volumen = Math.PI * Math.pow(r, 2) * h;
        return volumen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        double r = sc.nextDouble();
        System.out.println("Introduce la altura: ");
        double h = sc.nextDouble();

        System.out.println(calculoArea(r, h) + " m2");
        System.out.println(calculoVolumen(r, h) + " m3");
    }
}
