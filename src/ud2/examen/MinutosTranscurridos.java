package ud2.examen;

import java.util.Scanner;

public class MinutosTranscurridos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora en formato hhmm: ");
        int horaUno = sc.nextInt();
        System.out.print("Introduce una hora en formato hh:mm: ");
        int horaDos = sc.nextInt();
        int horaA = horaUno / 100;
        int horaB = horaDos / 100;
        int minutoA = horaUno % 100;
        int minutoB = horaDos % 100;
        System.out.println(minutosTranscurridos(horaA, minutoA, horaB, minutoB));

    }

    static int minutosTranscurridos(int horaA, int minutoA, int horaB, int minutoB) {
        int minutosTranscurridos = 0;
        if (horaA > 23 || horaB > 23 || minutoA > 59 || minutoB > 59 || horaA < 0 || horaB < 0 || minutoA < 0
                || minutoB < 0) {
            return -1;
        }
        if (horaA > horaB) {
            minutosTranscurridos += (horaA - horaB) * 60;
            minutosTranscurridos += (minutoA - minutoB);
        } else if (horaB > horaA) {
            minutosTranscurridos += (horaB - horaA) * 60;
            minutosTranscurridos += (minutoB - minutoA);
        } else {
            if (minutoA > minutoB) {
                minutosTranscurridos = minutoA - minutoB;
            } else {
                minutosTranscurridos = minutoB - minutoA;
            }
        }

        return minutosTranscurridos;
    }
}
