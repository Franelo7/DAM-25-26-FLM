package ud3.strings;

import java.util.Arrays;
import java.util.Random;

public class E0614_Juego_Anagrama {
    public static void main(String[] args) {
        String str = "amor";
        System.out.println(generarAnagrama(str));
    }

    public static String generarAnagrama(String str) {
        char[] t = str.toCharArray();
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            int Posrnd = rnd.nextInt(t.length);
            t[i] = t[Posrnd];
            
        }
        return Arrays.toString(t);
    }
}
