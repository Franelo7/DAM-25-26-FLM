package ud2.estructurasdecontrol;

public class E0314_TablasMultiplicar {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            System.out.println("-------------");
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d * %d = %d %n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
