package ud2.ejercicios;
public class rectangulo {
    public static void main(String[] args) {
        int columnas = 5;
        int filas = 10;

        for (int i = 1; i <= columnas; i++) {
            System.out.print("* ");
            for (int j = 1; j <= filas - 2; j++) {
                if (i == 1 || i == columnas) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }
}
