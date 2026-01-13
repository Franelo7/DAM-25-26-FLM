package ejerciciospracticar.ejsexamen.ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0207 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce n1: ");
        n1 = sc.nextInt();
        System.out.print("Introduce n2: ");
        n2 = sc.nextInt();
        System.out.print("Introduce n3: ");
        n3 = sc.nextInt();
        if (n3 > n2 && n2 > n1 && n3 > n1) {
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);
        } else if (n3 > n2 && n1 > n2 && n3 > n1) {
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
        } else if (n2 > n3 && n2 > n1 && n3 > n1) {
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n1);
        } else if (n2 > n3 && n2 > n1 && n1 > n3) {
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);
        } else if (n1 > n3 && n1 > n2 && n3 > n2) {
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n2);
        } else {
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
        }
    }
}
