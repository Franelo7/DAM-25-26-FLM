package ud4Estudiar.herencia;

public class Hora {
    int hora;
    int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    void inc() {
        minuto++;
        if (minuto == 60) {
            hora++;
            minuto = 0;
        }
        if (hora == 24) {
            hora = 0;
        }
    }

    boolean setMinuto(int minuto) {
        if (minuto > 0 && minuto < 60) {
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    boolean setHora(int hora) {
        if (hora > 0 && hora < 24) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }
}
