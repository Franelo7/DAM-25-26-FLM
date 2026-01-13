package ud2.ejercicios;

import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        final int NUM_LANZAMIENTOS = 1000;

        Random rnd = new Random();
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;

        for (int i = 1; i <= NUM_LANZAMIENTOS; i++) {
            int random = rnd.nextInt(6) + 1;
            if (random == 1) {
                uno++;
            } else if (random == 2) {
                dos++;
            } else if (random == 3) {
                tres++;
            } else if (random == 4) {
                cuatro++;
            } else if (random == 5) {
                cinco++;
            } else {
                seis++;
            }
        }

        double porcentajeUno = 100 * uno / NUM_LANZAMIENTOS;
        double porcentajeDos = 100 * dos / NUM_LANZAMIENTOS;
        double porcentajeTres =  100 * dos / NUM_LANZAMIENTOS;
        double porcentajeCuatro = 100 * dos / NUM_LANZAMIENTOS;
        double porcentajeCinco = 100 * dos / NUM_LANZAMIENTOS;
        double porcentajeSeis = 100 * dos / NUM_LANZAMIENTOS;


        System.out.println("LANZANDO UN DADO 1000 VECES");
        System.out.println();
        System.out.println("RESULTADOS: ");
        System.out.printf("El dado 1 salió: %d veces %.2f%% %n", uno, porcentajeUno);
        System.out.printf("El dado 2 salió: %d veces %.2f%% %n", dos, porcentajeDos);
        System.out.printf("El dado 3 salió: %d veces %.2f%% %n", tres, porcentajeTres);
        System.out.printf("El dado 4 salió: %d veces %.2f%% %n", cuatro, porcentajeCuatro);
        System.out.printf("El dado 5 salió: %d veces %.2f%% %n", cinco, porcentajeCinco);
        System.out.printf("El dado 6 salió: %d veces %.2f%% %n", seis, porcentajeSeis);
    }
}
