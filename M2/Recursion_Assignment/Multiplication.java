package M2.Recursion_Assignment;

public class Multiplication {

    private static int mul(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        return m + mul(m, n - 1);
    }

    public static void main(String[] args) {
        int m = 41;
        int n = 31;
        System.out.println("The Product of " + m + " and " + n + " is " + mul(m, n));
    }
}
