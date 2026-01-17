package ud2.estructurasdecontrol;

import java.util.Scanner;

public class EntradasConcierto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aforo Máximo: ");
        int aforo = sc.nextInt();
        System.out.println("Precio entrada: 10,99");
        double precio = 10.99;
        System.out.print("Número de entradas vendidas: ");
        int entradasVendidas = sc.nextInt();
        if (entradasVendidas <= (aforo * 0.2)) {
            System.out.println("Se cancela el concierto");
        } else if (entradasVendidas <= aforo * 0.5) {
            precio = precio - precio * 0.5;
            System.out.println("Nuevo Precio de Entrada " + precio);
        }

    }
}
