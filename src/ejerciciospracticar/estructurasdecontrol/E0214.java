package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

public class E0214 {

    /*
     * E0214. Crear una aplicación que solicite al usuario una fecha (día, mes, año)
     * y muestre la fecha
     * correspondiente al día siguiente
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el día: ");
        int dia = sc.nextInt();
        System.out.print("Escribe el mes: ");
        int mes = sc.nextInt();
        System.out.print("Escribe el año: ");
        int año = sc.nextInt();
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10:
                if (dia == 31) {
                    dia = 1;
                    mes++;
                    if (mes == 12) {
                        mes = 1;
                        año++;
                    }
                } else {
                    dia++;
                }
                break;
            case 4, 6, 9, 11:
                if (dia == 30) {
                    dia = 1;
                    mes++;
                    if (mes == 12) {
                        mes = 1;
                        año++;
                    }
                } else {
                    dia++;
                }
                break;
            case 2:
                if (dia == 28) {
                    dia = 1;
                    mes++;
                    if (dia == 29) {
                        dia = 1;
                        mes++;
                    }
                    if (mes == 12) {
                        mes = 1;
                        año++;
                    }
                }
                break;

            case 12:
                if (dia == 31) {
                    dia = 1;
                    mes = 1;
                    año++;
                } else {
                    dia++;
                }

                System.out.printf("La fecha más un dia es %02d/%02d/%02d", dia, mes, año);
        }
    }
}
