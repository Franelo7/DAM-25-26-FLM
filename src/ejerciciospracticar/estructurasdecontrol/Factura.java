package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

/*
Escribe un programa para emitir la factura de compra de un producto,
introduciendo el precio del producto y el número de unidades compradas. La factura deberá añadir
al total un IVA (Impuesto del Valor Añadido) del 21%. Si el precio final con IVA es superior a 100
euros se aplicará un descuento del 5%.
Ejemplos para pruebas:
● Precio = 10 €, Unidades = 5 => Precio Final = 60,50 €
● Precio = 20 €, Unidades = 7 => Precio Final = 160,93 €

 */

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean comienzo = true;
        while (comienzo) {
            double total = 0;
            while (true) {
                System.out.print(
                        "Introduce el precio del producto sin iva: (0  o negativo si quieres salir del programa) ");
                double precio = sc.nextDouble();
                if (precio == 0 || precio < 0) {
                    break;
                } else {
                    System.out.print("Introduce la cantidad: ");
                    double cantidad = sc.nextDouble();
                    double precioiva = ((precio * 0.21) + precio) * cantidad;
                    if (precioiva >= 100) {
                        double preciodescuento = precioiva - (precioiva * 0.05);
                        System.out.printf("El precio con todos los decuentos aplicados es %.2f€ \n", preciodescuento);
                        total += preciodescuento;
                    } else {
                        System.out.printf("El precio con IVA es de %.2f€ \n ", precioiva);
                        total += precioiva;

                    }
                    System.out.printf("La suma del carrito es de %.2f€ \n", total);
                }
            }
            System.out.println("Hasta Pronto!!");
            comienzo = false;
        }
        /*
         * System.out.print("Introduce el precio del producto sin iva: ");
         * double precio = sc.nextDouble();
         * System.out.print("Introduce la cantidad: ");
         * double cantidad = sc.nextDouble();
         * 
         * double precioiva = ((precio * 0.21) + precio) * cantidad;
         * if (precioiva >= 100) {
         * double preciodescuento = precioiva - (precioiva * 0.05);
         * System.out.println("El precio con todos los descuentos aplicados es: " +
         * preciodescuento);
         * } else {
         * System.out.println("El precio con IVA es de: " + precioiva);
         * }
         */
        sc.close();
    }
}
