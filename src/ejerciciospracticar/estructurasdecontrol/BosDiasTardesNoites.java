package ejerciciospracticar.estructurasdecontrol;
import java.time.LocalTime;

/*
 * BosDiasTardesNoites. Programa que amose un saúdo distinto en función da hora do día. Para os
seguintes valores da hora (inclusives):
Entre as 7 e as 13: “Bos días”
 Entre as 14 e as 20: “Boas tardes”
● Entre as 21 e as 6: “Boas noites”
 */

public class BosDiasTardesNoites {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        if (ahora.getHour() >= 7 && ahora.getHour() <= 13) {
            System.out.println("Buenos días");
        } else if (ahora.getHour() >= 13 && ahora.getHour() <= 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }
}
