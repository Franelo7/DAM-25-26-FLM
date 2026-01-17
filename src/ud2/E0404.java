package ud2;

public class E0404 {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;
        System.out.println(obtenerMaximo(n1, n2));
        System.out.println(obtenerMaximo2(n1, n2));
    }

    static int obtenerMaximo(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    static int obtenerMaximo2(int n1, int n2) {
       int max = Math.max(n1, n2);
        return max;
    }
}
