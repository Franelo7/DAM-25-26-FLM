package ud4Estudiar.clases;

public class MainBombilla {
    public static void main(String[] args) {

        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla.encenderGeneral();
        b1.on();
        Bombilla.apagarGeneral();

        System.out.println(b1.estadoBombilla());
        System.out.println(b2.estadoBombilla());

    }
}
