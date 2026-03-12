package ud4Estudiar.rol;

import java.util.Random;

public class Personaje {

    String nombre;
    Raza raza;

    int fuerza;
    int agilidad;
    int constitucion;

    int nivel;
    int experiencia;

    int pvActual;
    int pvMax;

    private static final int VIDA_BASE = 50;
    private static Random rnd = new Random();

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion,
            int nivel, int experiencia) {

        if (nombre == null || nombre.isEmpty() || raza == null ||
                fuerza < 1 || agilidad < 1 || constitucion < 1 || nivel < 1 || experiencia < 0)
            throw new IllegalArgumentException("Parámetros inválidos");

        this.nombre = nombre;
        this.raza = raza;

        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;

        this.nivel = nivel;
        this.experiencia = experiencia;

        pvMax = VIDA_BASE + constitucion;
        pvActual = pvMax;
    }

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion,
            int inteligencia, int intuicion, int presencia) {

        this(nombre, raza, fuerza, agilidad, constitucion, 1, 0);
    }

    public Personaje(String nombre, Raza raza) {

        this(nombre, raza,
                atributoRandom(), atributoRandom(), atributoRandom(),
                atributoRandom(), atributoRandom(), atributoRandom());
    }

    public Personaje(String nombre) {

        this(nombre, Raza.HUMANO);
    }

    private static int atributoRandom() {
        return rnd.nextInt(100) + 1;
    }

    public int sumarExperiencia(int puntos) {
        int nivelesGanados = 0;
        this.experiencia += puntos;

        while (this.experiencia >= 1000) {
            this.experiencia -= 1000;
            subirNivel();
            nivelesGanados++;
        }

        return nivelesGanados;
    }

    public void subirNivel() {
        this.nivel++;
        this.agilidad = (int) (agilidad * 1.05);
        this.fuerza = (int) (fuerza * 1.05);
        this.constitucion = (int) (constitucion * 1.05);

        pvMax = VIDA_BASE + constitucion;
    }

    public void curar() {
        int vidaOriginal = constitucion + VIDA_BASE;
        if (pvActual < vidaOriginal) {
            pvActual = vidaOriginal;
        }
    }

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

    public int atacar(Personaje enemigo) {
        int nAtaque = rnd.nextInt(100) + 1 + this.fuerza;
        int nDefensa = rnd.nextInt(100) + 1 + enemigo.agilidad;

        System.out.println(this.nombre + "(" + this.pvActual + ") ataca a "
                + enemigo.nombre + "(" + enemigo.pvActual + ")");

        // Calcular daño
        int dano = nAtaque - nDefensa;

        if (dano <= 0) {
            System.out.println("El ataque falla o es esquivado");
            return 0;
        }

        // Limitar daño a la vida restante del enemigo
        if (dano > enemigo.pvActual) {
            dano = enemigo.pvActual;
        }

        enemigo.perderVida(dano);

        // Experiencia
        this.sumarExperiencia(dano);
        enemigo.sumarExperiencia(dano);

        System.out.println("Daño realizado: " + dano);

        if (!enemigo.estaVivo()) {
            System.out.println(enemigo.nombre + " ha muerto. Ha ganado " + this.nombre);
        }

        return dano;
    }

    public int atacar(Monstruo m) {
        int nAtaque = rnd.nextInt(100) + 1 + this.fuerza;
        int nDefensa = rnd.nextInt(100) + 1 + m.defensa;
        System.out.println(this.nombre + "(" + this.pvActual + ") ataca a "
                + m.nombre + "(" + m.pvActual + ")");

        // Calcular daño
        int dano = nAtaque - nDefensa;

        if (dano <= 0) {
            System.out.println("El ataque falla o es esquivado");
            return 0;
        }

        // Limitar daño a la vida restante del enemigo
        if (dano > m.pvActual) {
            dano = m.pvActual;
        }

        m.perderVida(dano);

        System.out.println("Daño realizado: " + dano);

        if (!m.estaVivo()) {
            System.out.println(m.nombre + " ha muerto. Ha ganado " + this.nombre);
        }

        return dano;
    }

    public void mostrar() {

        System.out.println("===== PERSONAJE =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Vida: " + pvActual + "/" + pvMax);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Agilidad: " + agilidad);
        System.out.println("Constitución: " + constitucion);
    }

    @Override
    public String toString() {
        return nombre + " (" + pvActual + "/" + pvMax + ")";
    }
}