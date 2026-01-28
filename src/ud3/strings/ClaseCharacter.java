package ud3.strings;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = s.charAt(0);
        if (Character.isDigit(c)) {
            System.out.println("Es un dígito");
        }
        if (Character.isLetter(c)) {
            System.out.println("Es una letra");
        }
        if (Character.isUpperCase(c)) {
            System.out.println("Es mayúscula");
            System.out.println(Character.toLowerCase(c));
        }
        if (Character.isLowerCase(c)) {
            System.out.println("Es minúscula");
            System.out.println(Character.toUpperCase(c));
        }
    }
}
