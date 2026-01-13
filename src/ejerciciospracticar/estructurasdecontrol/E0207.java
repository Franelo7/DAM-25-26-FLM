package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

public class E0207 {
    /*
     * E0207. Pedir tres números y mostrarlos ordenados de mayor a menor.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) { // a es el mayor
            if (b >= c) {
                System.out.println("Orden: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Orden: " + a + ", " + c + ", " + b);
            }
        } else if (b >= a && b >= c) { // b es el mayor
            if (a >= c) {
                System.out.println("Orden: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Orden: " + b + ", " + c + ", " + a);
            }
        } else { // c es el mayor
            if (a >= b) {
                System.out.println("Orden: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Orden: " + c + ", " + b + ", " + a);
            }
        }
        sc.close();
    }
}
