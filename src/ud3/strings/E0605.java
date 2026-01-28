package ud3.strings;

public class E0605 {
    public static void main(String[] args) {
        String cad = "Hola Mundo";
        System.out.println(invertirCadena(cad));
    }

    static String invertirCadena(String cad) {
        String alReves = "";
        for (int i = cad.length()-1; i >= 0; i--) {
            alReves += cad.charAt(i);
        }
        return alReves;
    }

}
