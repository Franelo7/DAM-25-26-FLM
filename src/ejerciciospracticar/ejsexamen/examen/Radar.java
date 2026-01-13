package ejerciciospracticar.ejsexamen.examen;

import java.util.Scanner;

public class Radar {
    public static void main(String[] args) {
        double distanciaTramo, velocidadTramo;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Distancia del tramo (KM): ");
            distanciaTramo = sc.nextDouble();
            System.out.print("Velocidad Máxima (KM/h) ");
            velocidadTramo = sc.nextDouble();
            try {
                getStartRadar(sc, distanciaTramo, velocidadTramo);
            } catch (Exception InputMismatchException) {
                System.out.println("Introduce un valor correcto");
                System.out.println();
                getStartRadar(sc, 0, 0);
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Introduce un valor correcto");
            System.out.println();
        }

    }

    static void getStartRadar(Scanner sc, double distanciaTramo, double velocidadTramo) {
        double tiempo = distanciaTramo / velocidadTramo * 3600;
        double velMediaTotal = 0;
        int cochesControlados = 0;
        double velMax = 0;
        int multasImpuestas = 0;
        boolean startRadar = false;
        if (distanciaTramo > 0 || velocidadTramo > 0) {
            startRadar = true;
        }
        while (startRadar) {
            System.out.print("Tiempo en recorrer el tramo en segundos: ");
            double tiempoRecorrer = sc.nextDouble();
            if (tiempoRecorrer <= 0) {
                startRadar = false;
            } else {
                double velMedia = distanciaTramo / (tiempoRecorrer / 3600);
                velMediaTotal += velMedia;
                double multa = tiempo - tiempo * 0.2;
                cochesControlados++;

                if (tiempoRecorrer < tiempo) {
                    if (tiempoRecorrer <= multa) {
                        System.out.println("Multa grave por exceso de velocidad. Perdida de puntos");
                        System.out.printf("Velocidad media %.2f Kmh %n", velMedia);
                        multasImpuestas++;
                    } else {
                        System.out.println("Multa por exceso de velocidad");
                        System.out.printf("Velocidad media %.2f Kmh %n", velMedia);
                        multasImpuestas++;
                    }
                } else {
                    System.out.println("Dentro del límite de velocidad");
                    System.out.printf("Velocidad media %.2f Kmh %n", velMedia);
                }
                if (velMedia > velMax) {
                    velMax = velMedia;
                }
            }
        }
        System.out.println();
        System.out.println("Estadísticas finales:");
        System.out.println("---------------------");
        System.out.println("Total coches controlados: " + cochesControlados);
        System.out.printf("Velocidad máxima fue de %.2f Kmh %n", velMediaTotal / cochesControlados);
        System.out.printf("Velocidad máxima fue de %.2f Kmh %n", velMax);
        System.out.println("Multas impuestas: " + multasImpuestas);
    }
}
