package ejerciciospracticar.ejsexamen.ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0202 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce n1: ");
        n1 = sc.nextInt();
        System.out.print("Introduce n2: ");
        n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}
