package ejerciciospracticar.masejercicios;
public class ComprobarHora {

    static void compruebaHora(int hora, int minutos, int segundos) {
        boolean horaCorrecta = hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0
                && segundos <= 59;
        if (horaCorrecta) {
            // es correcta
            System.out.println("Hora correcta");
        } else {
            // no es correcta
            System.out.println("Hora incorrecta");
        }
    }

public static void main(String[] args) {
    compruebaHora(10, 50, 1);
}
}
