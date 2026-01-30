package ud3.examen.flm;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Fran
 */
public class HoraFeliz {
    public static void main(String[] args) {
        Random rnd = new Random();
        int hora = rnd.nextInt(24);
        int minuto = rnd.nextInt(60);
        int minutosRestantes = 0;
        System.out.printf("Hora feliz: %02d:%02d %n", hora, minuto);
        int duracionHoraFeliz = hora + 1;
        LocalDateTime horaSistema = LocalDateTime.now();
        if (hora == horaSistema.getHour() || duracionHoraFeliz == horaSistema.getHour()) {

            System.out.println("Estás en la hora feliz!!!!");

        } else {
            if (hora == horaSistema.getHour() || duracionHoraFeliz == horaSistema.getHour()) {
                if (minuto != horaSistema.getMinute()) {
                    if (minuto > horaSistema.getMinute()) {
                        minutosRestantes = minuto - horaSistema.getMinute();
                    } else {
                        minutosRestantes = horaSistema.getMinute() - minuto;
                    }
                    System.out.println("Quedan " + minutosRestantes + " minutos para la hora feliz");
                }
            }

            if (hora != horaSistema.getHour()) {
                if (hora > horaSistema.getHour()) {
                    hora = hora - horaSistema.getHour();
                } else {
                    hora = horaSistema.getHour() - hora;
                    minutosRestantes = minuto - horaSistema.getMinute();
                }
                if (minuto < horaSistema.getMinute()) {
                    minutosRestantes = horaSistema.getMinute() - minuto;
                } else {
                    minutosRestantes = minuto - horaSistema.getMinute();
                }
                minutosRestantes += hora * 60;
            }
            System.out.println("Quedan " + minutosRestantes + " minutos para la hora feliz");
        }
    }

}
