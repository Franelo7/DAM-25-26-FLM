package ud2.estructurasdecontrol;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Introduce la cantidad: ");
        int cantidad = sc.nextInt();
        double precioIva = precio * cantidad + precio * cantidad * 0.21;
        if (precioIva > 100) {
            double precioDescuento = precioIva * 0.05;
            precioIva = precioIva - precioDescuento;
            System.out.println("El precio con el descuento aplicado es de: " + precioIva);
        } else {
            System.out.println("El precio es de: " + precioIva);

        }

    }
}
