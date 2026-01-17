package ud2.ejercicios;

public class EP0316_Triangulo {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
