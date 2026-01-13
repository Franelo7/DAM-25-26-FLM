package ud3.strings;

import java.util.Scanner;

public class E603 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("!Jugador 1 introduce la contraseña");

        String contraseña = sc.nextLine();

        boolean continuar = true;

        int contador = 0;
        int intentos = 3;

        while (continuar == true && contador < 3) {

            System.out.println("!jugador2 Introduce la posible contraseña");

            String contraseñaJugador2 = sc.nextLine();

            boolean iguales;

            iguales = contraseña.equalsIgnoreCase(contraseñaJugador2);

            if (iguales == true) {
                System.out.println("Has acertado!");
                continuar = false;
            } else {
                System.out.println("No es la contraseña correcta vuelve a intentarlo");
                contador++;
                intentos--;
                System.out.println("te quedan " + intentos + " Intentos");
            }
        }

    }
}