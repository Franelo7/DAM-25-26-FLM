package ud3.arrays;

public class E0504 {
    public static void main(String[] args) {
        int[] t = { 1, 20, 2, 3, 10, 13 };
        System.out.println(maximo(t));
    }

    static int maximo(int t[]) {
        int max = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }
}
