package ud4Estudiar.herencia.cajas;

public class Caja {
    int ancho;
    int alto;
    int fondo;
    Unidad unidad;
    String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    double getVolumen() {
        if (this.unidad == Unidad.CM) {
            double an = ancho / 100;
            double al = alto / 100;
            double f = fondo / 100;

            return an * al * f;
        }
        if (this.unidad == Unidad.M) {

            return ancho * fondo * alto;
        }
        return -1;
    }

    void setEtiqueta(String etiqueta) {
        if (etiqueta.length() > 30) {
            System.out.println("MAX 30 CARACTERES");
            setEtiqueta(etiqueta);
        } else {
            this.etiqueta = etiqueta;
        }
    }

    @Override

    public String toString() {
        return etiqueta + " Volumen: " + getVolumen();
    }

    public static void main(String[] args) {
        Caja c1 = new Caja(100, 100, 2, Unidad.CM);
        c1.setEtiqueta("Mis primos payos de holanda");
        System.out.println(c1);
    }
}
