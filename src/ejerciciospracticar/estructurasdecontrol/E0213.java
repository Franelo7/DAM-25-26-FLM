package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

public class E0213 {
    /*
     * E0213. Escribir un programa que pida una hora de la siguiente forma: hora,
     * minutos y segundos.
     * El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
     * hora actual
     * (10:41:59) => hora actual + 1 segundo (10:42:00)
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las horas: ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();
        sc.close();
        if (segundos == 59) {
            segundos = 00;
            minutos++;
            if (minutos == 60) {
                minutos = 00;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }

        } else {
            segundos++;
        }
        System.out.printf("Son las %02d:%02d:%02d", hora, minutos, segundos);
        
    }
}