package ud3.strings;

import java.util.Scanner;

public class E0602 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase por teclado ");

        String frase1 = sc.nextLine();

        System.out.println("Introduce otra frase por teclado ");

        String frase2 = sc.nextLine();

        int longitud1 = frase1.length();
        int longitud2 = frase2.length();

        if (longitud1 < longitud2) {
            System.out.println("La primera frase es mas corta");
        } else if (longitud1 == longitud2) {

            System.out.println("Las frases son iguales");
        } else {

            System.out.println("la segunda frase es mas corta");

        }
    }
}
