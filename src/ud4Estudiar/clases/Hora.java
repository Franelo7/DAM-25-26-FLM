package ud4Estudiar.clases;

public class Hora {
    private byte hora;
    private byte minuto;
    private byte segundo;

    public Hora(byte hora, byte minuto, byte segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostrar() {
        System.out.printf("%02d:%02d:%02d  %n", hora, minuto, segundo);
    }

    public void incrementar() {

        if (segundo == 59) {
            segundo = 0;
            if (minuto == 59) {
                minuto = 0;
                if (hora == 23) {
                    hora = 0;
                } else {
                    hora++;
                }
            } else {
                minuto++;
            }

        } else {
            segundo++;
        }

    }
}
