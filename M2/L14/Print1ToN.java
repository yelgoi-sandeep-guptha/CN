package M2.L14;

public class Print1ToN {

    private static void printNumbers(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }
}
