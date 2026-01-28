package ud3.strings;

import java.util.Arrays;

public class E0606 {
    public static void main(String[] args) {
        System.out.println(sinVocales("alba"));
       // System.out.println(sinVocales("alvaro perez"));
       // System.out.println(sinVocales("álvaro pérez"));
        System.out.println(sinVocales("Álvaro Pérez"));

    }

    static String sinVocales(String cad) {
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        char[] t = cad.toCharArray();
        char[] t2 = vocales.toCharArray();
        for (int i = 0; i < cad.length(); i++) {
            for (int j = 0; j < t2.length; j++) {
                if (t[i] == t2[j]) {
                    t[i] = 0;
                }
            }
        }
        String sinVocales = String.copyValueOf(t);
        return sinVocales;
    }
}
