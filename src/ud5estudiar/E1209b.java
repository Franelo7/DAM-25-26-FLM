package ud5estudiar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class E1209b {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaPrimos = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            int random = rnd.nextInt(1000) + 1;
            lista.add(random);
        }

        for (Integer i : lista) {
            if (ud2.Util.esPrimo(i)) {
                System.out.println(i + " - " + lista.indexOf(i));
                listaPrimos.add(i);
            }
        }
        Collections.sort(listaPrimos);
        System.out.println(listaPrimos);
    }
}
