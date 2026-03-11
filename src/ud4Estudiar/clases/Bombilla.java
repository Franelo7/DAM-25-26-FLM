package ud4Estudiar.clases;

public class Bombilla {
    private boolean bombilla;
    private static boolean interruptorGeneral;

    public Bombilla() {
        this.bombilla = false;
    }

    public void off() {
        this.bombilla = false;
    }

    public void on() {
        this.bombilla = true;
    }

    public static boolean isInterruptorGeneral() {
        return interruptorGeneral;
    }

    public static void setInterruptorGeneral(boolean interruptorGeneral) {
        Bombilla.interruptorGeneral = interruptorGeneral;
    }

    public static void apagarGeneral() {
        setInterruptorGeneral(false);
    }

    public static void encenderGeneral() {
        setInterruptorGeneral(true);
    }

    public boolean estadoBombilla() {
        return bombilla && interruptorGeneral;
    }

}
