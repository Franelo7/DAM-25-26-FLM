package ejerciciospracticar.ejsexamen.ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0201 {
    public static void main(String[] args) {
        int n1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce n1: ");
        n1 = sc.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número no es par");
        }
    }
}
