package M2.Recursion_Assignment;

public class SumOfDigits {

    private static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println("The Sum of digits " + sumOfDigits(n));
    }
}
