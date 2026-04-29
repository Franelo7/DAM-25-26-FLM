package ud5estudiar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class E1206 {
    public static void main(String[] args) {

        Collection<Integer> lista = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int random = rnd.nextInt(10) + 1;
            lista.add(random);
        }
        System.out.println("Lista Original: ");
        System.out.println(lista);

        System.out.println("Eliminando valor 5: ");

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next() == 5) {
                it.remove();
            }
        }
        System.err.println(lista);
    }
}
