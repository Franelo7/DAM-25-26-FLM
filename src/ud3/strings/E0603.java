package ud3.strings;

import java.util.Scanner;

public class E0603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("JUGADOR 1 -> Introduce la contreña: ");
        String password = sc.nextLine();
        password = password.toLowerCase();
        char[] t = password.toCharArray();
        String intentosJugador2;

        boolean iniciar = true;
        int error = 0;
        while (iniciar) {
            int contador = 0;
            System.out.print("Introduce la contraseña: ");
            intentosJugador2 = sc.nextLine();
            intentosJugador2 = intentosJugador2.toLowerCase();
            char[] t2 = intentosJugador2.toCharArray();
            for (int i = 0; i < t2.length; i++) {
                if (t[i] == t2[i]) {
                    contador++;
                } else {
                    error++;
                    System.out.println("Contraseña incorrecta, inténtalo de nuevo: ");
                    System.out.println("Errores: " + error);
                }
            }
            if (error > 3) {
                System.out.println("Número máximo de errores");
                iniciar = false;

            }
            if (contador == t.length) {
                System.out.println("Adivinaste la contraseña!!!!");
                iniciar = false;
            }

        }

    }
}
