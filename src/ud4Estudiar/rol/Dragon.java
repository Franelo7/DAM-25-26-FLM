package ud4Estudiar.rol;

import java.util.Random;

class Dragon extends Monstruo {
    private static Random rnd = new Random();

    public Dragon() {
        this.nombre = "Dragón";
        this.ataque = rnd.nextInt(100, 200);
        this.defensa = rnd.nextInt(60, 100);
        this.velocidad = rnd.nextInt(80, 120);
        this.pvMax = rnd.nextInt(120, 250);
        this.pvActual = pvMax;
    }

}