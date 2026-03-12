package ud4Estudiar.rol;

import java.util.Random;

public class CombateSingular {

    public static void main(String[] args) {
        Personaje orco = new Personaje("ElXokas", Raza.ORCO);
        Personaje enano = new Personaje("Paco de Lucia", Raza.ENANO);

        System.out.println("=== Fichas iniciales ===");
        orco.mostrar();
        System.out.println();
        enano.mostrar();
        System.out.println();

        // Decidir quién empieza
        Personaje atacante, defensor;
        Random rnd = new Random();

        if (orco.agilidad > enano.agilidad) {
            atacante = orco;
            defensor = enano;
        } else if (enano.agilidad > orco.agilidad) {
            atacante = enano;
            defensor = orco;
        } else {
            // Empate → aleatorio
            if (rnd.nextBoolean()) {
                atacante = orco;
                defensor = enano;
            } else {
                atacante = enano;
                defensor = orco;
            }
        }

        System.out.println("Comienza el combate: " + atacante.nombre + "\n");

        // Combate por turnos
        while (atacante.estaVivo() && defensor.estaVivo()) {
            atacante.atacar(defensor);
            System.out.println(); // salto de línea para claridad
            // Intercambiar roles
            Personaje temp = atacante;
            atacante = defensor;
            defensor = temp;
        }

        System.out.println("\n=== Fichas finales ===");
        orco.mostrar();
        System.out.println();
        enano.mostrar();
    }
}