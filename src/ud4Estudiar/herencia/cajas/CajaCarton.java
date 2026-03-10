package ud4Estudiar.herencia.cajas;

class CajaCarton extends Caja {
    static double metrosCarton = 0;

    public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo, unidad);
        if (this.unidad == Unidad.M) {
            ancho = ancho * 100;
            alto = alto * 100;
            fondo = fondo * 100;
        }
    }

    @Override
    double getVolumen() {
        return 0.8 * (ancho * alto * fondo);
    }

    double calcularMetros() {
        return 2 * (ancho * alto + ancho * fondo + alto * fondo);
    }

    public static void main(String[] args) {
        CajaCarton c1 = new CajaCarton(100, 100, 2, Unidad.M);
        c1.setEtiqueta("Mis primos payos de holanda");
        System.out.println(c1.calcularMetros());
    }
}