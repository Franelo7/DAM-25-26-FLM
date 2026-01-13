package ejerciciospracticar.estructurasdecontrol;
import java.util.Random;
import java.util.Scanner;

public class E0303_NumeroSecreto {
    /*
     * E0303_NumeroSecreto. Codificar el juego “el número secreto”, que consiste en
     * acertar un
     * número entre 1 y 100 (generado aleatoriamente). Para ello se introduce por
     * teclado una serie de
     * números, para los que se indica: “mayor” o “menor”, según sea mayor o menor
     * con respecto al
     * número secreto. El proceso termina cuando el usuario acierta o cuando se
     * rinde (introduciendo un
     * -1)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int random = rnd.nextInt(101);
        boolean acabar = true;
        System.out.println(random);
        while (acabar) {
            while (true) {
                System.out.print("Intenta adivinar el número: ");
                int n = sc.nextInt();
                if (n == 0 || n < 0) {
                    System.out.println("Gracias por intentarlo, suerte en la próxima!!");
                    System.out.println("El número era el " + random);
                    break;
                }
                if (random == n) {
                    System.out.println("Acertaste el número");
                    break;
                } else {
                    System.out.println("No acertaste el número");
                    if (n > random) {
                        System.out.println("El número es menor");
                    } else {
                        System.out.println("El número es mayor");
                    }
                }

            }
            acabar = false;
        }

    }
}
