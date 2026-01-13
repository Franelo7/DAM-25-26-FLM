package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

public class E0313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Introduce la nota: ");
            int n = sc.nextInt();

            if (n < 4) {
                suspensos++;
            } else if (n == 4) {
                condicionados++;
            } else if (n >= 5) {
                aprobados++;
            }

        }
        System.out.println("El número de aprobados es de " + aprobados);
        System.out.println("El número de condicionados es de " + condicionados);
        System.out.println("El número de suspensos es de " + suspensos);
    }
}
