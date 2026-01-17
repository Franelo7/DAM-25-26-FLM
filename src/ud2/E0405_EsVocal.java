package ud2;

public class E0405_EsVocal {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(esVocal(c));
    }

    static boolean esVocal(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
                || c == 'U' || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' || c == 'Á' || c == 'É'
                || c == 'Í' || c == 'Ó' || c == 'Ú') {
            return true;
        } else {
            return false;
        }
    }

}
