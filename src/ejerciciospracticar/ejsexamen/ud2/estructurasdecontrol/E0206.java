package ejerciciospracticar.ejsexamen.ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0206 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce n1: ");
        n1 = sc.nextInt();
        System.out.print("Introduce n2: ");
        n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println(n1 + " Es mayor que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " Es mayor que " + n1);

        } else {
            System.out.println("Son iguales");
        }

    }
}
