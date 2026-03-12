package ud4Estudiar.rol;

import java.util.Random;

class Orco extends Monstruo {
    private static Random rnd = new Random();

    public Orco() {
        this.nombre = "Orco";
        this.ataque = rnd.nextInt(30) + 51;
        this.defensa = rnd.nextInt(30) + 21;
        this.velocidad = rnd.nextInt(30) + 31;
        this.pvMax = rnd.nextInt(30) + 101;
        this.pvActual = pvMax;
    }

}