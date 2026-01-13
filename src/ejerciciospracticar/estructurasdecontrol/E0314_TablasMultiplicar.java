package ejerciciospracticar.estructurasdecontrol;
public class E0314_TablasMultiplicar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
             System.out.println("==========================================");
            System.out.println("Tabla del " + i);
            System.out.println("==========================================");
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d x %d = %d  \n", i, j, i * j);
            }
        }
    }
}
