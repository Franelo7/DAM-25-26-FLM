package ud3.strings;

public class E0607 {
    public static void main(String[] args) {
        String frase = "Paquito es un pedazo de maricon y un maricon";
        String palabra = "maricon";
        System.out.println(contarOcurrencias(frase, palabra));
    }

    static int contarOcurrencias(String frase, String palabra) {
        int contador = 0;
        int posicionamientoBusqueda = 0;
        while (frase.indexOf(palabra, posicionamientoBusqueda) != -1) {
            contador++;
            posicionamientoBusqueda = frase.indexOf(palabra, posicionamientoBusqueda) + 1;
        }

        return contador;
    }
}
