package ejerciciospracticar.masejercicios;
public class E0402_Rango {
    public static void rango(int n1, int n2) {
        for (int i = 0; i <= n1 || i <= n2; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        rango(1, 10);
    }
}
