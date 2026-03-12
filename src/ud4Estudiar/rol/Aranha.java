package ud4Estudiar.rol;

import java.util.Random;

class Aranha extends Monstruo {
    private static Random rnd = new Random();

    public Aranha() {
        this.nombre = "Araña";
        this.ataque = rnd.nextInt(10, 50);
        this.defensa = rnd.nextInt(20, 40);
        this.velocidad = rnd.nextInt(40, 70);
        this.pvMax = rnd.nextInt(30, 80);
        this.pvActual = pvMax;
    }

}