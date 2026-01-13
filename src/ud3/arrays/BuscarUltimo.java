package ud3.arrays;

public class BuscarUltimo {
    public static int buscar (int t[], int clave){
        int ultima = -1;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                clave = ultima;
            }
        }
        return ultima;
    }
}
