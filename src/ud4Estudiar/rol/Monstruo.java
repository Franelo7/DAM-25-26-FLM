package ud4Estudiar.rol;

import java.util.Random;

abstract public class Monstruo {
    String nombre;

    int ataque;
    int defensa;
    int velocidad;

    int pvActual;
    int pvMax;
    private static Random rnd = new Random();

    public boolean perderVida(int puntos) {
        this.pvActual -= puntos;
        if (pvActual < 1) {
            return true;
        }
        return false;
    }

    public boolean estaVivo() {
        if (pvActual > 0) {
            return true;
        }
        return false;
    }

    public int atacar(Personaje p) {
        int nAtaque = rnd.nextInt(100) + 1 + this.ataque;
        int nDefensa = rnd.nextInt(100) + 1 + p.agilidad;
        System.out.println(this.nombre + "(" + this.pvActual + ") ataca a "
                + p.nombre + "(" + p.pvActual + ")");

        // Calcular daño
        int dano = nAtaque - nDefensa;

        if (dano <= 0) {
            System.out.println("El ataque falla o es esquivado");
            return 0;
        }

        // Limitar daño a la vida restante del enemigo
        if (dano > p.pvActual) {
            dano = p.pvActual;
        }

        p.perderVida(dano);

        System.out.println("Daño realizado: " + dano);

        if (!p.estaVivo()) {
            System.out.println(p.nombre + " ha muerto. Ha ganado " + this.nombre);
        }

        return dano;

    }

    static Monstruo generaMonstruoAleatorio() {
        int nR = rnd.nextInt(100) + 1;
        Monstruo m = new Monstruo() {

        };
        if (nR <= 40) {
            m = new Orco();
        }
        if (nR > 40 && nR <= 70) {
            m = new Aranha();
        }
        if (nR > 70 && nR <= 90) {
            m = new Troll();
        }
        if (nR > 90 && nR <= 100) {
            m = new Dragon();
        }

        return m;
    }

    public void mostrar() {
        System.out.println("===== MONSTRUO =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + velocidad);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Vida: " + pvActual + "/" + pvMax);

    }

    @Override
    public String toString() {
        return nombre + " (" + pvMax + ")";
    }

    public static void main(String[] args) {
        Monstruo m1 = generaMonstruoAleatorio();
        m1.mostrar();
        Personaje p1 = new Personaje("Payo");
        m1.atacar(p1);
        

    }

}
