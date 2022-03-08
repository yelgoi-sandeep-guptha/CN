package M1.CourseTest1;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 3, 6, 7, 7 };
        int n = 6;
        int k = 2;
        if (n > k) {
            int result = 0;
            for (int i = 0; i < k; i++) {
                result += arr[i];
            }

            int sum = result;
            for (int i = k; i < n; i++) {
                sum = sum + arr[i] - arr[i - k];
                result = Math.max(result, sum);
            }

            System.out.println("The Maximum sum of the sub array is " + result);
        }
    }
}
