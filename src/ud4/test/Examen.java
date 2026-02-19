package ud4.test;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    private String titulo;
    private List<Pregunta> preguntas;

    public Examen(String titulo) {
        this.titulo = titulo;
        this.preguntas = new ArrayList<>();
    }

    public void addPregunta(Pregunta p) {
        if (!preguntas.contains(p)) {
            preguntas.add(p);
        } else {
            System.out.println("La pregunta ya existe");
        }
    }

    public int numPreguntas() {
        return preguntas.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EXAMEN: ").append(titulo).append("\n\n");

        for (int i = 0; i < preguntas.size(); i++) {
            sb.append((i + 1)).append(". ");
            sb.append(preguntas.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
}
