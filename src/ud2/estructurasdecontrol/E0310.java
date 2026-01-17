package ud2.estructurasdecontrol;

public class E0310 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                contador += i;
            }
        }
        System.out.println("Contador: " + contador);
    }
}
