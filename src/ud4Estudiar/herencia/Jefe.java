package ud4Estudiar.herencia;

public class Jefe extends Empleado {
    String cargo;
    double bonus;

    public Jefe(String nombre, byte edad, double estatura, double salario, String cargo, double bonus) {
        super(nombre, edad, estatura, salario);
        this.bonus = bonus;
        this.cargo = cargo;

    }

}
