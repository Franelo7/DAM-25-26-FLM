package ud4Estudiar.clases;

public class Gestor {
    private String nombre;
    public final String telefono;
    double importeMax;

    public Gestor(String nombre, String telefono, double importeMax) {
        this.nombre = nombre;
        this.telefono = telefono;
        if (this.importeMax < 10000) {
            this.importeMax = 10000;
        } else {
            this.importeMax = importeMax;

        }
    }

    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        if (this.importeMax < 10000) {
            this.importeMax = 10000;
        }
    }

    public void mostrarGestor() {
        System.out.println("========== Gestor ==========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Importe Máximo: " + importeMax);
    }
}
