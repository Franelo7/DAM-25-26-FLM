package ud4Estudiar.clases;

import java.util.Scanner;

public class E0706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora: ");
        byte hora = sc.nextByte();
        System.out.print("Introduce la minutos: ");
        byte minuto = sc.nextByte();
        System.out.print("Introduce la segundos: ");
        byte segundo = sc.nextByte();
        System.out.print("Introduce el numero de horas: ");
        int horas = sc.nextInt() * 3600;

        Hora h = new Hora(hora, minuto, segundo);

        for (int i = 0; i <= horas; i++) {
            h.incrementar();
            h.mostrar();
        }

    }
}
