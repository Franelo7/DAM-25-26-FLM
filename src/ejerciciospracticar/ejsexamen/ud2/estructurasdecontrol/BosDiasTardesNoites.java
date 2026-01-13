package ejerciciospracticar.ejsexamen.ud2.estructurasdecontrol;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class BosDiasTardesNoites {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        if (time.getHour() >= 7 && time.getHour() <= 13 ) {
            System.out.println("Bos Días");
        } else if (time.getHour() >= 14 && time.getHour() <= 20 ) {
            System.out.println("Boas Tardes");
        } else {
            System.out.println("Boas Noites");
        }
        
    }
}
