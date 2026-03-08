package ud4Estudiar.clases;

public class CuentaCorriente {
    int numeroCuenta;
    public Persona titular;
    private int saldo;
    private static String NBANCO = "Santander";
    public Gestor gestor;

    public CuentaCorriente(Persona p, int n) {
        this.numeroCuenta = n;
        this.titular = p;
        this.saldo = 0;

    }

    public void añadirSaldo(double n) {
        saldo += n;

    }

    public void retirarDinero(double n) {
        if (saldo >= n) {
            saldo -= n;
            System.out.println("Saldo: " + saldo);
        } else {
            System.out.println("No tiene suficiente saldo");
            System.out.println("Saldo: " + saldo);

        }
    }

    public void mostrar() {
        System.out.println("========== Cuenta Corriente ==========");
        System.out.println("Nombre: " + titular.nombre);
        System.out.println("DNI: " + titular.dni);
        System.out.println("Teléfono: " + titular.telefono);
        System.out.println("Dirección: " + titular.direccion);
        System.out.println("Saldo: " + saldo);
        System.out.println("Banco: " + NBANCO);
        if (gestor != null) {
            gestor.mostrarGestor();
        }

    }

    public static void cambiarBanco(String nuevoBanco) {
        NBANCO = "Abanca";
    }

    public void añadirGestor(Gestor g) {
        gestor = g;
    }

    public void transferecia(CuentaCorriente cDestino, CuentaCorriente cOrigen, double cantidad) {
        if (cOrigen.saldo >= cantidad) {
            cOrigen.saldo -= cantidad;
            cDestino.saldo += cantidad;
            System.out.println("Transferencia Realizada!!");
        } else {
            System.out.println("Fondos insufiecientes");
        }
    }
}