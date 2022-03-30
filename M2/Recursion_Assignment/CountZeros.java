package M2.Recursion_Assignment;

public class CountZeros {

    private static int count(int n) {
        if (n < 9) {
            if (n == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (n % 10 == 0) {
            return 1 + count(n / 10);
        }
        return count(n / 10);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The Number of Zeros in " + n + " is " + count(n));
    }
}
