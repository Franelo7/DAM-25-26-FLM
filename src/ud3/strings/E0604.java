package ud3.strings;

public class E0604 {
    public static void main(String[] args) {
        String cad = "cuantos pelos tengo en el culo";
        System.out.println(contarEspacios(cad));
    }

    static int contarEspacios(String cad) {
        int contador = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (Character.isWhitespace(cad.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
}
