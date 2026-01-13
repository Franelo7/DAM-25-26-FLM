package ejerciciospracticar.estructurasdecontrol;
import java.util.Scanner;

public class Bisiesto {
    /*
     * Año Bisiesto (Bisiesto.java). Haz un programa que pida por teclado un número
     * de año y que
     * muestre un mensaje indicando si el año es bisiesto o no.
     * Investiga el algoritmo para calcular si un año es bisiesto o no.
     * “Año bisiesto es el divisible entre 4, salvo que sea año secular es decir
     * divisible por 100, en cuyo
     * caso también ha de ser divisible entre 400.”
     * 
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int var = sc.nextInt();
        if (var % 4 == 0 || var % 100 == 0 || var % 400 == 0) {
            System.out.println("El año " + var + " es bisiesto");

        } else {

            System.out.println("El año " + var + " no es bisiesto");
        }
        sc.close();
     }
    
}
