package ud4Estudiar.herencia;

public class HoraExacta extends Hora {
    int segundos;

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos = segundos;
    }

    public void setSegundo(int segundos) {
        if (segundos > 0 && segundos < 60) {
            this.segundos = segundos;
        }
    }

    public void inc() {
        segundos++;
        if (segundos == 59) {
            segundos = 0;
            minuto++;
        }
        if (minuto == 59) {
            minuto = 0;
            hora++;
        }
        if (hora == 24) {
            hora = 0;
        }
    }

    @Override
    public boolean equals(Object otro) {
        HoraExacta a = (HoraExacta) otro;
        return (this.hora == a.hora && this.minuto == a.minuto && this.segundos == a.segundos);
    }
}
