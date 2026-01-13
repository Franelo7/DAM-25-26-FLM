package ejerciciospracticar.estructurasdecontrol;
import java.util.Random;
import java.util.Scanner;

public class E0305 {
    /*
     * E0305. Desarrollar un juego que ayude a mejorar el cálculo mental de la suma.
     * El jugador tendrá
     * que introducir la solución de la suma de dos números aleatorios comprendidos
     * entre 1 y 100.
     * Mientras la solución sea correcta, el juego continuará. En caso contrario, el
     * programa terminará y
     * mostrará el número de operaciones realizadas correctamente.
     * Amplía el programa para que muestre el número de aciertos al terminar.
     * Variante. Permite al usuario un número limitado de fallos.
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int contador = 0;
        int contadoraciertos = 0;
        while (contador < 3) {
            int n1 = rnd.nextInt(101);
            int n2 = rnd.nextInt(101);
            System.out.printf("La suma de: %d+%d= \n", n1, n2);
            System.out.print("Introduce el resultado de la suma: ");
            int userR = sc.nextInt();

            int resultado = n1 + n2;
            if (resultado == userR) {
                contadoraciertos++;
                System.out.println("Enhorabuena has acertado, número de aciertos = " + contadoraciertos);
            } else {
                contador++;
                System.out.println("Mal, te has equivocado, número de fallos = " + contador);
            }
        }
    }
}
