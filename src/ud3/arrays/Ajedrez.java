package ud3.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Fran
 */

public class Ajedrez {

    public static void main(String[] args) {
        char[][] tablero = inicializarTablero();
        boolean turnoBlancas = true;
        boolean fin = false;
        mostrarTableroConLeyenda(tablero);
        System.out.println(turnoBlancas ? "Turno de BLANCAS" : "Turno de NEGRAS");
        int[] mov = leerMovimiento();
        while (!fin) {
            mover(tablero, mov);
            // validarMovimiento
            // ejecutarMovimiento
            // comprobarJaqueOJaqueMate
            mostrarTableroConLeyenda(tablero);
            leerMovimiento();
        }
        System.out.println("Fin de la partida!!");
        
    }

    static void mostrarTableroColoresCasillas(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = 'B';
                } else {
                    tablero[i][j] = 'N';
                }

            }
        }
    }

    static char[][] inicializarTablero() {

        char[][] nuevoTablero = {
                { 't', 'c', 'a', 'd', 'r', 'a', 'c', 't' },
                { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
                { 'T', 'C', 'A', 'D', 'R', 'A', 'C', 'T' }
        };
        return nuevoTablero;
    }

    static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]);
                System.out.print(' ');
                ;
            }
            System.out.println();
        }

    }

    static void mostrarTableroConLeyenda(char[][] tablero) {
        System.out.println();
        System.out.println("     A  B  C  D  E  F  G  H");
        System.out.println();

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (j == 0) {
                    System.out.print((8 - i) + "    ");
                }
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.print("    " + (8 - i));
            System.out.println();

        }
        System.out.println();
        System.out.println("     A  B  C  D  E  F  G  H");
        System.out.println();
    }

    private static void mover(char[][] tablero, int[] mov){
            tablero[mov[2]][mov[3]] = tablero[mov[0]][mov[1]];
            tablero[mov[0]][mov[1]] = '-';

        }

    private static int[] leerMovimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Movimiento: Ejemplo e2 e4: ");
        String entrada = sc.nextLine();
        char columnaOrigen = entrada.charAt(0); // columnaOrigen e
        char filaOrigen = entrada.charAt(1); // filaOrigen 2
        char columnaDestino = entrada.charAt(3); // columnaDestino e
        char filaDestino = entrada.charAt(4); // filaDestino 4

        int[] movimiento = {
                7 - (filaOrigen - '1'),
                columnaOrigen - 'a',
                7 - (filaDestino -'1'),
                columnaDestino - 'a'
        };
        return movimiento;
    }

    
}
