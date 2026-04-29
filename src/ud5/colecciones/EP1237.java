package ud5.colecciones;

import java.util.Map;

import ud4.examen.Jugador; 

public class EP1237 {

    static void altaJugador(Map<Integer, Jugador> plantilla,
            Integer dorsal, Jugador jugador) {
        plantilla.put(dorsal, jugador);
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        return plantilla.remove(dorsal);
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNombre());
        }
    }

    static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {

        for (Jugador j : plantilla.values()) {
            if (j.getPosicion().name().equalsIgnoreCase(posicion)) {
                System.out.println(j.getNombre() + " (" + j.getPosicion() + ") ");
            }
        }

    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla,
            Integer dorsal, Jugador jugador) {
        if (plantilla.containsKey(dorsal)) {
            Jugador actual = plantilla.get(dorsal);
            actual.setNombre(jugador.getNombre());
            return true;
        }
        return false;

    }

}
