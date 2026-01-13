package ud3.arrays;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Tiempos {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);

        LocalDate vacaciones = LocalDate.of(2025, 12, 19);
        System.out.println(vacaciones);

        if (hoy.isAfter(vacaciones)) {
            System.out.println("Estamos de vacaciones");
        } else {
            System.out.println("Aún no estamos de vacaciones");
            long periodo = hoy.until(vacaciones, ChronoUnit.DAYS);
           
            System.out.println("Faltan... " + periodo + " dias");
        }
    }
}
