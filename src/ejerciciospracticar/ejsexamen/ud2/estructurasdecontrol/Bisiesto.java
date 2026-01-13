package ejerciciospracticar.ejsexamen.ud2.estructurasdecontrol;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int n = sc.nextInt();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
