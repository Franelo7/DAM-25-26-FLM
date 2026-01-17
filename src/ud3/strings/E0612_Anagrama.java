package ud3.strings;

/**
 * @author Fran
 */
public class E0612_Anagrama {
    public static void main(String[] args) {
        String palabra = "amor";
        String anagrama = "mora";
        System.out.println(anagramaDe(palabra, anagrama));

    }

    static boolean anagramaDe(String palabra, String anagrama) {
        if (palabra.length() != anagrama.length()) {
            return false;
        } else {
            int contador = 0;
            for (int i = 0; i < palabra.length(); i++) {
                char n = palabra.charAt(i);
                for (int j = 0; j < anagrama.length(); j++) {
                    if (n == anagrama.charAt(j)) {
                        contador++;
                    }
                }
            }
            if (contador == palabra.length()) {
                return true;
            } else {
                return false;
            }
        }

    }
}
