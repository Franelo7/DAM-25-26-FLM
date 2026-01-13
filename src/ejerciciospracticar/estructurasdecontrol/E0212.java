package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;
/*
 * E0212. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que tener en
cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años bisiestos).
 */

public class E0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el dia: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int año = sc.nextInt();
        sc.close();
        boolean fechainicio = false;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                fechainicio = dia >= 1 && dia <= 31;
                break;

            case 4, 6, 9, 11:
                fechainicio = dia >= 1 && dia <= 30;
                break;

            case 2:
                boolean esBisiesto = año % 400 == 0 || año % 4 == 0 && año % 100 != 0;
                fechainicio = dia >= 1 && (dia <= 28 || dia == 29 && esBisiesto);
                break;
        }

        System.out.println(fechainicio ? "Fecha correcta" : "Fecha incorrecta");

    }
}
