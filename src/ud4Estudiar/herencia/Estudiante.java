package ud4Estudiar.herencia;

public class Estudiante extends Persona {

    protected double nota1av;
    protected double nota2av;
    protected double nota3av;

    public Estudiante(String nombre, byte edad, double estatura, double nota1av, double nota2av, double nota3av) {
        super(nombre, edad, estatura);
        this.nota1av = nota1av;
        this.nota2av = nota2av;
        this.nota3av = nota3av;
    }

    @Override
    public String toString() {
        return nombre + " (" + nota1av + ") " + " (" + nota2av + ") " + "(" + nota3av + ")";
    }

    public double notaMedia() {
        return (nota1av + nota2av + nota3av) / 3;
    }
}
