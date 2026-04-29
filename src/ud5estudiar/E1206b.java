package ud5estudiar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class E1206b {
    public static void main(String[] args) {

        Collection<Integer> lista = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int random = rnd.nextInt(201) - 100;
            lista.add(random);
        }
        System.out.println("Lista Original: ");
        System.out.println(lista);

        Collection<Integer> listaPositivos = new ArrayList<>();
        Collection<Integer> listaNegativos = new ArrayList<>();
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            int p = it.next();
            if (p > 0) {
                listaPositivos.add(p);
            } else {
                listaNegativos.add(p);

            }
        }
        System.out.println("Valores Positivos: ");
        System.err.println(listaPositivos);
        System.out.println("Valores Negativos: ");
        System.err.println(listaNegativos);

    }
}
