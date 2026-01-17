package ud2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce a: ");
            a = sc.nextInt();
            System.out.print("Introduce b: ");
            b = sc.nextInt();
            try {
                extracted(a, b);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.printf("%d:%d = 0", a, b);

            }
        } catch (InputMismatchException e) {
            System.out.println("Introduce valores enteros!!!");
            System.out.println(e.toString());
        }

    }

    private static void extracted(int a, int b) throws Exception {
        if (b == 0 || a == 0) {
            throw new Exception("Añade valores mayores a 0");
        }

    }
}
