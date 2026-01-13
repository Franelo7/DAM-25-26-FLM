package ud2.ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EstadisticaEstaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean comienzo = true;
        int contador = 0;
        int altura = 0;
        int alturaMax = 0;
        int alturaMin = 0;

        while (comienzo) {
            System.out.print("Introduce la altura en CM: ");
            try {
                int h = sc.nextInt();
                if (h > 1) {
                    contador++;
                    altura += h;
                    if (h > alturaMax) {
                        alturaMax = h;
                    } else if (alturaMin > h && h > 0) {
                        alturaMin = h;
                    }
                } else {
                    comienzo = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("error");
                comienzo = false;
            }
        }

        double media = (double) altura / contador / 100;
        System.out.printf("La media es de %.2f m %n", media);
        System.err.println("La altura máxima es: " + alturaMax);
        System.err.println("La altura mínima es: " + alturaMin);
        System.out.println("La cantidad de alumnos es de: " + contador);

    }
}
