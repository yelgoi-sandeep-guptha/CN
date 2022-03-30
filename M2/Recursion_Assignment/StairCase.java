package M2.Recursion_Assignment;

public class StairCase {

    private static int staircase(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Total Number of ways child can run up the stairs : " + staircase(n));
    }
}
