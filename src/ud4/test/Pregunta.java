package ud4.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pregunta {
    private String enunciado;
    private List<String> respuestas;
    private int indiceCorrecta;

    public Pregunta(String enunciado, List<String> respuestas, int indiceCorrecta) {
        if (respuestas == null || respuestas.size() < 2) {
            throw new IllegalArgumentException("Debe haber al menos dos respuestas");

        }
        if (indiceCorrecta < 0 || indiceCorrecta >= respuestas.size()) {
            throw new IllegalArgumentException("Índice de respuesta correcta no válido");
        }
        this.enunciado = enunciado;
        this.respuestas = new ArrayList<>(respuestas);
        this.indiceCorrecta = indiceCorrecta;
    }

    public boolean corregir(int opcionElegida) {
        return opcionElegida == indiceCorrecta;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(enunciado).append("\n");

        char letra = 'a';
        for (String r : respuestas) {
            sb.append(letra).append(") ").append(r).append("\n");
            letra++;
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pregunta)) {
            return false;
        }
        Pregunta otra = (Pregunta) obj;
        return Objects.equals(enunciado, otra.enunciado) && Objects.equals(respuestas, otra.respuestas);

    }
}
