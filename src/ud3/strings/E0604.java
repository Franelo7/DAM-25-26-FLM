/**
 * @author Fran
 */
package ud3.strings;

import java.util.Scanner;

public class E0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase por teclado: ");
        String cad1 = sc.nextLine();
        sc.close();
        contarEspacios(cad1);
       char cad2 = cad1.charAt(2);
       System.out.println(cad2);

    }

    public static void contarEspacios(String cad1) {
        int n = cad1.length();
        String cad2 = cad1.replaceAll(" ", "");
        int n2 = cad2.length();
        int total = n - n2;
        System.out.println("El número de espacios en blanco es de: " + total);
    }
}
