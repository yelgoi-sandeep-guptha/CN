package M2.L14;

public class NoOfDigits {
    private static int count(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        int n = 182;
        System.out.println("The number of Digits in " + n + " is : " + count(n));
    }
}
