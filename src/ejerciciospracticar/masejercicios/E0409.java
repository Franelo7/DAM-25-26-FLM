package ejerciciospracticar.masejercicios;
public class E0409 {
    public static void calcularMaximo(int n1, int n2, int n3) {
        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 > n3) {
                    System.out.printf("El número %d > %d > %d", n1, n2, n3);
                } else {
                    System.out.printf("El número %d > %d > %d", n1, n3, n2);

                }
            }

        } else if (n2 > n3) {
            if (n1 > n3) {
                System.out.printf("El número %d > %d > %d", n2, n1, n3);
            } else {
                System.out.printf("El número %d > %d > %d", n2, n3, n1);
            }

        } else {
            System.out.printf("El número %d > %d > %d", n3, n2, n1);
        }

    }

    public static void main(String[] args) {
        calcularMaximo(6, 9, 4);
    }
}