package ud4Estudiar.rol;

import java.util.Random;

class Troll extends Monstruo {
    private static Random rnd = new Random();

    public Troll() {
        this.nombre = "Troll";
        this.ataque = rnd.nextInt(30, 120);
        this.defensa = rnd.nextInt(50, 70);
        this.velocidad = rnd.nextInt(20, 40);
        this.pvMax = rnd.nextInt(40, 70);
        this.pvActual = pvMax;
    }

}