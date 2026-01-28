package ud3.arrays;

public class Referencias {
    public static void main(String[] args) {
        int[] t1 = new int[10];
        int[] t2 = t1;
        int[] t3 = t1;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
