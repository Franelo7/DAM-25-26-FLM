package ud2.ejercicios;
import java.util.Scanner;

public class EP0316_Triangulo {
    static Scanner sc = new Scanner(System.in);

    private static void menu() {
        boolean comienzo = true;
        while (comienzo) {
            System.out.println("Introduce el valor para comenzar: ");
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.println("0. Salir");
            int menu = sc.nextInt();
            if (menu == 0) {
                System.out.println("Saliendo!!!");
                comienzo = false;
            } else {
                if (menu > 1) {
                    System.out.println("Introduce N2: ");
                    int n2 = sc.nextInt();
                    System.out.println("Introduce Y: ");
                    int y = sc.nextInt();
                    rectangulo(n2, y);

                } else {
                    System.out.println("Introduce N: ");
                    int n = sc.nextInt();
                    triangulo(n);
                }
            }
        }
    }

    public static void rectangulo(int n2, int y) {

        for (int i = 1; i <= n2; i++) {
            System.out.println();
            for (int j = 1; j <=  y; j++) {
                System.out.print("* ");

            }
        }
    }

    private static void triangulo(int n) {
    for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        menu();

    }

    

}