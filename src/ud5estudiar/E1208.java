package ud5estudiar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class E1208 {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 20; i++) {
            int random = rnd.nextInt(100) + 1;
            lista.add(random);
        }

        Integer[] t = lista.toArray(new Integer[0]);
        Arrays.sort(t);

        lista.removeAll(lista);
        lista.addAll(Arrays.asList(t));
        System.out.println("De mayor a menor: ");
        System.out.println(lista);


        
        Arrays.sort(t, Collections.reverseOrder());
        lista.removeAll(lista);
        lista.addAll(Arrays.asList(t));
        System.out.println("De menor a mayor: ");
        System.out.println(lista);
    }
}
