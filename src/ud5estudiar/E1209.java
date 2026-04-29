package ud5estudiar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E1209 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un número: ");
            n = sc.nextInt();
            l.add(n);
        } while (n > 0);

        for (Integer i : l) {
            if (i % 2 == 0) {
                System.out.println( l.indexOf(i));
            }
        }

    }
}
