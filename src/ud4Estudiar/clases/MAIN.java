package ud4Estudiar.clases;

public class MAIN {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juana", "12345678B", "677013941", "Piolla");
        Persona p2 = new Persona("Pepa", "22345678B", "277013941", "Lerez");

        CuentaCorriente c1 = new CuentaCorriente(p1, 1);
        CuentaCorriente c2 = new CuentaCorriente(p2, 2);
        Gestor g1 = new Gestor("Carlos", "89812341");

        c1.añadirSaldo(150);
        c1.retirarDinero(110);
        c1.transferecia(c2, c1, 50);
        CuentaCorriente.cambiarBanco("Abanca");
        c1.añadirGestor(g1);
        c1.mostrar();
        c2.mostrar();
    }

}
