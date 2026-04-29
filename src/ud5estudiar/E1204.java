package ud5estudiar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class E1204 {
    public static void main(String[] args) {
        boolean empezar = true;
        List<Integer> lista = new ArrayList<>();
        Collection<Integer> collection = lista;
        int numero;
        Scanner sc = new Scanner(System.in);
        while (empezar) {
            System.out.println("Introduce un numero: ");
            numero = sc.nextInt();
            if (numero < 0) {
                empezar = false;
            } else {
                lista.add(numero);
            }
        }

        System.out.print("Numeros Pares: ");
        for (Integer i : collection) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next() % 3 == 0) {
                it.remove();
            }
        }

        System.out.println(lista);
    }
}
