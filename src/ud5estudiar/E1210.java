package ud5estudiar;

import java.util.*;

public class E1210 {
    public static void main(String[] args) {
        List<Integer> listaOriginal = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 12; i++) {
            listaOriginal.add(rnd.nextInt(10) + 1);
        }
        System.out.println("Lista Inicial: " + listaOriginal);

        Set<Integer> sinRepetidos = new TreeSet<>();
        Set<Integer> repetidos = new TreeSet<>();

        for (Integer num : listaOriginal) {

            if (!sinRepetidos.add(num)) {
                repetidos.add(num);
            }
        }

        Set<Integer> soloUnaVez = new TreeSet<>(sinRepetidos);
        soloUnaVez.removeAll(repetidos);

        System.out.println("Conjunto sin repetidos: " + sinRepetidos);
        System.out.println("Repetidos: " + repetidos);
        System.out.println("No repetidos (una sola vez): " + soloUnaVez);
    }
}