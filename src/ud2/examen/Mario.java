package ud2.examen;

import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura del muro: ");
        int alturaMuro = sc.nextInt();
        int alturaMario = 1;
        int saltosArriba = 0;
        int saltosAbajo = 0;
        while (alturaMuro > 0) {
            if (alturaMario < alturaMuro) {
                saltosArriba++;
                alturaMario = alturaMuro;
              
            } else if (alturaMario > alturaMuro) {
                saltosAbajo++;
                alturaMario = alturaMuro;
            }
            System.out.println("Introduce la altura del muro: ");
            alturaMuro = sc.nextInt();
        }
        System.out.println("Saltos arriba: " + saltosArriba);
        System.out.println("Saltos abajo: " + saltosAbajo);
    }
}
