package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

public class E0206 {
    /*
     * E0206. Solicitar dos números y mostrar cuál es el mayor o si son iguales.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la primera variable a comparar: ");
        int var1 = sc.nextInt();
        System.out.print("Escribe la segunda variable a comparar: ");
        int var2 = sc.nextInt();

        if (var1 == var2) {
            System.out.println("Son iguales");

        } else if (var1 > var2) {
            System.out.println(var1 + " es mayor que " + var2);
        } else {
            System.out.println(var2 + " es mayor que " + var1);
        }
        sc.close();
    }

}
