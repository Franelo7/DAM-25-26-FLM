package ud2.ejercicios;

import java.util.Scanner;

public class EP0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número DNI: ");
        int n = sc.nextInt();
        int resto = n % 23;
        String[] letras = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
                "H", "L", "C", "K", "E" };
        System.out.println(n + letras[resto]);
    }
}
