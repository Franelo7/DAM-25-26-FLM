package ud4Estudiar.herencia;

public class Persona {
    protected String nombre;
    protected byte edad;
    protected double estatura;

    public Persona(String nombre, byte edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return nombre + " " + edad + " " + estatura;
    }

    @Override
    public boolean equals(Object otro) {// compara this con otro
        Persona otraPersona = (Persona) otro;
        return (this.nombre.equals(otraPersona.nombre) && this.edad == otraPersona.edad);
    }
}
