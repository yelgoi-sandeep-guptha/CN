package M2.L14;

public class SumOfArray {

    private static int helper(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + helper(arr, index + 1);
    }

    private static int sum(int[] arr) {
        return helper(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("The sum of elements in the array is " + sum(arr));
    }
}
