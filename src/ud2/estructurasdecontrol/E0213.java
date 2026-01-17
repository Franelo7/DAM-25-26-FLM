package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s;
        System.out.println("Introduce la hora: ");
        h = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        m = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        s = sc.nextInt();

        if (s == 59) {
            m++;
            s = 00;
        }
        if (m >= 59) {
            h++;
            m = 00;
        }
        if (h >= 24) {
            h = 00;
        }
        System.out.printf("Un segundo después, serán las: %02d:%02d:%02d", h, m, s);
    }
}
