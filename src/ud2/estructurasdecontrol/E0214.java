package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0214 {
    public static void main(String[] args) {
        int dia, mes, año;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia: ");
        dia = sc.nextInt();
        System.out.print("Mes: ");
        mes = sc.nextInt();
        System.out.print("Año: ");
        año = sc.nextInt();

        int dias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 2 -> {
                yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            default -> {
                System.out.println("Error");
                yield -1;
            }
        };
        if (mes >= 12 && dia == dias) {
            año++;
            mes = 0;
        }
        if (dia == dias) {
            mes++;
            dia = 1;
        } else {
            dia++;
        }

        System.out.println(dia + "/" + mes + "/" + año);
    }
}
