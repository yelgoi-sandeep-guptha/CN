package M2.Test4;

import java.util.Arrays;

public class MaximumProfit {

    private static int maxProfit(int[] arr, int n) {
        Arrays.sort(arr);
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int Profit = arr[i] * (n - i);
            if (ans < Profit) {
                ans = Profit;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int arr[] = { 30, 20, 53, 14 };
        System.out.println("The maximum Profit can be earned " + maxProfit(arr, n));
    }
}
