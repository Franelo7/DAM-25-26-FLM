package ud4.test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pregunta p1 = new Pregunta(
                "Cual es la capital de Francia",
                Arrays.asList("Madrid", "París", "Roma"), 1);

        Pregunta p2 = new Pregunta(
                "Cuanto es 2+2",
                Arrays.asList("3", "4", "5"), 1);

        Examen examen = new Examen("Examen de prueba");
        examen.addPregunta(p1);
        examen.addPregunta(p2);
        System.out.println(examen);
        System.out.println("Pregunta 1 correcta si elijo 1" + p1.corregir(1));
    }

}
