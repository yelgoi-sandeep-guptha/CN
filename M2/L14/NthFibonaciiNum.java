package M2.L14;

public class NthFibonaciiNum {

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("The " + n + "th fibonacii number in series : " + fib(n));
    }
}
