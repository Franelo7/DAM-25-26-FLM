package ud3.arrays;

public class Sumas {
    static int[] sumas(int t[]) {
        if (t == null) {
            return null;
        }
        int sumaTotal = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        for (int i = 0; i < t.length; i++) {
            int num = t[i];
            sumaTotal += num;
            if (num > 0) {
                sumaPositivos += num;
            } else if (num < 0) {
                sumaNegativos += num;
            }
        }
        int[] resultado = new int[3];
        resultado[0] = sumaTotal;
        resultado[1] = sumaPositivos;
        resultado[2] = sumaNegativos;
        return resultado;

    }

    public static void main(String[] args) {

    }

}
