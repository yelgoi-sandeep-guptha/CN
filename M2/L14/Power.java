package M2.L14;

public class Power {
    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 10;
        int n = 2;
        System.out.println("The Result of x power n is " + power(x, n));
    }
}