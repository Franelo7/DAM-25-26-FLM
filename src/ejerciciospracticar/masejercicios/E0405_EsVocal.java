package ejerciciospracticar.masejercicios;
public class E0405_EsVocal {
    public static boolean esVocal(String v) {
       
       boolean vocal = false;
        switch (v) {
        case "a", "e", "i", "o", "u" :
            vocal = true;
            break;
       }
       return vocal;
    }

    public static void main(String[] args) {
       System.out.println(esVocal("b")); 
       System.out.println(esVocal("a")); 
    }
}
