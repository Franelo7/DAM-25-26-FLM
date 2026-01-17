package ud2.estructurasdecontrol;

public class E0209 {
    public static void main(String[] args) {
        int n = 100;
        int contador = 0;
        // v1
 
        if (n <= 99999 && n > 9999) {
            System.out.println("El número tiene 5 cifras");
        } else if (n <= 9999 && n > 999) {
            System.out.println("El número tiene 4 cifras");
        } else if (n <= 999 && n > 99) {
            System.out.println("El número tiene 3 cifras");
        } else if (n <= 99 && n > 9) {
            System.out.println("El número tiene 2 cifras");
        } else {
            System.out.println("El número tiene una cifras");
        }

        // v2

        for (int i = 10; i <= n * 10; i *= 10) {
            contador++;
        }
        System.out.println(contador);

    
    }
}
