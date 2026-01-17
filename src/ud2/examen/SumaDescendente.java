package ud2.examen;

import java.util.Scanner;

public class SumaDescendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.println(sumaDescendente(numero));

    }

    static int sumaDescendente(int numero) {
        int suma = numero;
        for (int i = 10; i <= numero; i *= 10) {
            suma += numero % i;
        }
        return suma;
    }

}