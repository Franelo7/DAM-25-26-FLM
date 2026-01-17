package ud3.strings;

public class E0611_Codificar {
    public static void main(String[] args) {
        String conjunto1 = "eikmpqrstuv";
        String conjunto2 = "pviumterkqs";
        String palabra = "PaquiTo";

        System.out.println(codifica(conjunto1, conjunto2, palabra));
    }

    static String codifica(String conjunto1, String conjunto2, String palabra) {
        palabra = palabra.toLowerCase();
        String resultado = "";

        for (int i = 0; i < palabra.length(); i++) {
            if (conjunto1.indexOf(palabra.charAt(i)) == -1) {
                resultado += palabra.charAt(i);
            } else {
                resultado += conjunto2.charAt(conjunto1.indexOf(palabra.charAt(i)));
            }
        }

        return resultado;
    }
}
