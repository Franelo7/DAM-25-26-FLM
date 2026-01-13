package ejerciciospracticar.ejsexamen.ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0212 {
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
                System.out.println("Error Incorecto");
                yield -1;
            }
        };
        if (dia <= dias) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
    }
}
