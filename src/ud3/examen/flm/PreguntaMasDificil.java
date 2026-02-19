package ud3.examen.flm;

import java.util.Arrays;

/**
 * @author Fran
 */
public class PreguntaMasDificil {
    public static void main(String[] args) {
        double notas[][] = { { 4, 10, 0, 8 }, { 8, 2, 9.5, 3 }, { 2, 1, 0, 0 }, { 9, 6, 0, 0 }, { 10, 3, 10, 9.5 } };
        System.out.println("La media más baja es: " + mediaPreguntaMasDificil(notas));
    }

    static double mediaPreguntaMasDificil(double[][] notas) {
        double[] medias = new double[notas.length - 1];
        int h = 0;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = 0; j < notas.length; j++) {
                medias[i] += notas[j][i];
            }
            h++;
        }
        Arrays.sort(medias);
        double mediaMasBaja = medias[0] / notas.length;
        return mediaMasBaja;
    }
}
