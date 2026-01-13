package ud3.strings;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un caracter");
        char valor = sc.nextLine().charAt(0);

        if (Character.isDigit((char) valor)) {
            System.out.println("Es un dígito");
        } else {
            System.out.println("Es una letra");

        }
        if (Character.isUpperCase((char) valor)) {
            System.out.println("Es mayúscula");
            System.out.println(Character.toLowerCase(valor));

        } else {
            System.out.println("Es minúscula");
            System.out.println(Character.toUpperCase(valor));

        }

    }
}
