package ud2;

public class E0411_MCD {
    public static void main(String[] args) {
        System.out.println(mcd(4, 2));
    }

    static int mcd(int a, int b) {
        int mcd = 0;
        // Casos Base
        if (a == 0)
            mcd = b;
        else if (b == 0)
            mcd = a;
        else if (b > a)
            mcd = mcd(a, b - a);
        else
            mcd = mcd(a - b, b);

        return mcd;
    }
}
