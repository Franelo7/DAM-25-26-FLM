package ud3.strings;

import java.util.Scanner;

public class E0605 {
    public static String invertirCadena(String cad) {
        String copiaReversa = "";
        for (int i = cad.length() - 1; i >= 0; i--) {
            copiaReversa += cad.charAt(i);
        }
        return copiaReversa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce la frase que quieras invertir: ");
        String cad = sc.nextLine();
        System.out.println(invertirCadena(cad));
        sc.close();
    }
}
