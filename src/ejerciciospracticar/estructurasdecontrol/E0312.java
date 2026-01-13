package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

public class E0312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int contadorSuspensos = 0;
        int contadorAprobados = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce tu nota: ");
            n = sc.nextInt();
            if (n < 5) {
                contadorSuspensos++;
            } else {
                contadorAprobados++;
            }
        }
        if (contadorAprobados > 1) {
            System.out.println("Hay " + contadorAprobados + " aprobados");
            if (contadorSuspensos > 1) {
                System.out.println("Hay " + contadorSuspensos + " suspensos");
            }
        } else {
            System.out.println("Hay " + contadorSuspensos + " suspensos");

        }

    }
}
