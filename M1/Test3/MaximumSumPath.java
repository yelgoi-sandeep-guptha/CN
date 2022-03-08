package M1.Test3;

public class MaximumSumPath {

    private static long maximumSumPath(int arr1[], int arr2[]) {

        int m = arr1.length;
        int n = arr2.length;

        int i = 0, j = 0;

        long result = 0, sum1 = 0, sum2 = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                result += Math.max(sum1, sum2);

                sum1 = 0;
                sum2 = 0;

                while (i < m && j < n && arr1[i] == arr2[j]) {
                    result += arr1[i++];
                    j++;
                }
            }
        }

        while (i < m) {
            sum1 += arr1[i++];
        }

        while (j < n) {
            sum2 += arr2[j++];
        }

        result += Math.max(sum1, sum2);

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 10, 15, 20, 25 };
        int[] arr2 = { 2, 4, 5, 9, 15 };

        System.out.println("Path through the intersections that produces maximum sum is " + maximumSumPath(arr1, arr2));
    }
}
