package ud2;

public class E0409 {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;
        int n3 = 10;
        System.out.println(obtenerMaximo(n1, n2, n3));
        System.out.println(obtenerMaximo2(n1, n2, n3));

    }

    static int obtenerMaximo(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        }
        if (n1 > n2 && n3 > n1) {
            return n3;
        }
        if (n2 > n1 && n2 > n3) {
            return n2;
        }
        if (n2 > n1 && n3 > n2) {
            return n3;
        }
        return n3;
    }

    static int obtenerMaximo2(int n1, int n2, int n3) {
        if (E0404.obtenerMaximo(n1, n2) > n3) {
            return E0404.obtenerMaximo(n1, n2);
        } else {
            return n3;
        }
    }

}
