package ud3.arrays;
/**
 * Fran
 */
public class Referencias {
    public static void main(String[] args) {
        int[] tabla1 = new int[10];
        int[] tabla2 = tabla1;
        int[] tabla3 = tabla1;
        
        System.out.println(tabla1);
        System.out.println(tabla2);
        System.out.println(tabla3);
    }
}
