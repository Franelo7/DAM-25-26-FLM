package ud2;

public class E0402_Rango {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 5;
        rango(n1, n2);
    }

    static void rango(int n1, int n2) {
        for (int i = n1; i < n2; i++) {
            System.out.print(i + ", ");

        }
        System.out.print(n2);
    }
}
