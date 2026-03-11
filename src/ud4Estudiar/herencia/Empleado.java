package ud4Estudiar.herencia;

public class Empleado extends Persona {

    protected double salario;

    public Empleado(String nombre, byte edad, double estatura, double salario) {
        super(nombre, edad, estatura);
        this.salario = salario;
    }

    public void subirSalario(double porcentaje) {
        salario = salario * porcentaje / 100 + salario;
    }

    @Override
    public String toString() {
        return nombre + " (" + salario + ")";
    }
}
