package ud2;

import java.util.Scanner;

public class ComprobarHora {
    public static void main(String[] args) {
        int hora, minutos, segundos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora: ");
        hora = sc.nextInt();
        System.out.print("Minutos: ");
        minutos = sc.nextInt();
        System.out.print("Segundos: ");
        segundos = sc.nextInt();
        compruebaHora(hora, minutos, segundos);
        System.out.println(compruebaHoraBoolean(hora, minutos, segundos));
    }

    static void compruebaHora(int hora, int minutos, int segundos) {
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            System.out.println("La hora es correcta");
        } else {
            System.out.println("La hora no es correcta");
        }
    }
      static boolean compruebaHoraBoolean(int hora, int minutos, int segundos) {
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            return true;
        } else {
            return false;
        }
    }
}
