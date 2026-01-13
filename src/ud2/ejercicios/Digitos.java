package ud2.ejercicios;
import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for (int i = 1; i <= n; i *= 10) {
            System.out.println(n / i % 10);
        }
    }
}
