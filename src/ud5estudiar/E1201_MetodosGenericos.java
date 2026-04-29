package ud5estudiar;

import java.util.Arrays;

public class E1201_MetodosGenericos {
    public static <U> U[] add(U e, U[] t) {
        U[] nueva = Arrays.copyOf(t, t.length + 1);
        nueva[nueva.length] = e;
        return nueva;
    }

    public static <U> boolean buscar(U e, U[] t) {
        for (U obj : t) {
            if (obj.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public static <U> U[] concatenar(U[] t1, U[] t2) {
        U[] tablaNueva = Arrays.copyOf(t1, t1.length + t2.length);
        System.arraycopy(t2, 0, tablaNueva, t1.length, t2.length);
        return tablaNueva;
    }

    public static <U, V> Object[] concatenar2(U[] t1, V[] t2) {
        Object[] tablaNueva = new Object[t1.length + t2.length];
        System.arraycopy(t1, 0, tablaNueva, 0, t1.length);
        System.arraycopy(t2, 0, tablaNueva, t1.length, t2.length);
        return tablaNueva;
    }

}
