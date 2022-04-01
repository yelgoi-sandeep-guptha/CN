package M2.Test4;

public class MinimumCount {

    private static int minCount(int n) {
        if (n <= 1) {
            return n;
        }
        int ans = n;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (square > n) {
                break;
            }
            ans = Math.min(ans, 1 + minCount(n - square));
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 12; // 3^2 + 1^2 + 1^2
        System.out.println("The count of minimum numbers, sum of whose squares is equal to N : " + minCount(n));
    }
}
