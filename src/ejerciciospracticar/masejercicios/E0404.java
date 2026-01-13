package ejerciciospracticar.masejercicios;
public class E0404 {
    public static void calcularMaximo(int n1, int n2) {
        if (n1 > n2) {
            System.out.printf("El número %d es mayor que %d", n1, n2);
        } else {
            System.out.printf("El número %d es mayor que %d", n2, n1);

        }
    }

    public static void main(String[] args) {
        calcularMaximo(2, 4);
    }
}
