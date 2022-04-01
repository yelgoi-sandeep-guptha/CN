package M2.Test4;

public class SplitArray {

    private static boolean split(int arr[]) {
        return helper(arr, arr.length, 0, 0, 0);
    }

    private static boolean helper(int arr[], int n, int si, int sum3, int sum5) {
        if (si == n) {
            return sum3 == sum5;
        }
        if (arr[si] % 5 == 0) {
            sum5 += arr[si];
        } else if (arr[si] % 3 == 0) {
            sum3 += arr[si];
        } else {
            return helper(arr, n, si + 1, sum3 + arr[si], sum5)
                    || helper(arr, n, si + 1, sum3, sum5 + arr[si]);
        }
        return helper(arr, n, si + 1, sum3, sum5);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 }; // {1,4,3}
        /**
         * Sum of both parts is equal
         * - All elements in the input, which are divisible by 5 should be in same
         * group.
         * - All elements in the input, which are divisible by 3 (but not divisible by
         * 5) should be in other group.
         * - Elements which are neither divisible by 5 nor by 3, can be put in any
         * group.
         */
        if (split(arr)) {
            System.out.println("The sum both parts are equal");
        } else {
            System.out.println("The sum both parts are not equal");
        }
    }
}
