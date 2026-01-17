package ud2;

public class E0412_Fibbonacci {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n) {
        return (n <= 1) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
