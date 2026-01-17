package ud2.estructurasdecontrol;

import java.util.Scanner;

public class E0302 {
    public static void main(String[] args) {
        boolean comenzar = true;
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int alumnos = 0;
        int mayorEdad = 0;
        while (comenzar) {
            System.out.println("Introduce la edad: ");
            int edad = sc.nextInt();
            if (edad < 0) {
                comenzar = false;
            } else {
                total += edad;
                alumnos++;
                if (edad >= 18) {
                    mayorEdad++;
                }
            }
        }
        System.out.println("La suma de todas la edades es de: " + total);
        System.out.println("La media de edad es de: " + total / alumnos);
        System.out.println("El número de alumnos es de: " + alumnos);
        System.out.println("Hay un total de " + mayorEdad + " alumnos mayores de edad");
    }
}
