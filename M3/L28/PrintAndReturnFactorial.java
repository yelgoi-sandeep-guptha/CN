package M3.L28;

public class PrintAndReturnFactorial {

    private static int returnFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * returnFact(n - 1);
    }

    private static void printFact(int n, int ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        ans = ans * n;
        printFact(n - 1, ans);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("The Factorial of " + n + " is : ");
        printFact(n, 1);
        System.out.println(returnFact(n));
    }
}
