package ud3.strings;

import java.util.Scanner;

public class E0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s13 = s1.replaceAll(" ", "");
        String s21 = s2.replaceAll(" ", "");
        if (s13.length() < s21.length()) {
            System.out.println(s1);
            System.out.println("Es más corta");
        } else {
            System.out.println(s2);
            System.out.println("Es más corta");
        }
    }
}
