package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0311_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para calcular el factorial: ");
        int n = sc.nextInt();
        int x = n;
        for (int i = n - 1; i >= 1; i--) {
            n = n * i;
        }
        System.out.println("El factorial es: "+ n);
    }
}
