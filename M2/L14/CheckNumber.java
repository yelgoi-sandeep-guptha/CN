package M2.L14;

public class CheckNumber {

    private static boolean helper(int[] arr, int x, int index) {
        if (index == arr.length) {
            return false;
        }

        if (arr[index] == x) {
            return true;
        }

        return helper(arr, x, index + 1);
    }

    private static boolean check(int[] arr, int x) {
        return helper(arr, x, 0);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int x = 4;
        if (check(arr, x)) {
            System.out.println(x + " is present in array");
        } else {
            System.out.println(x + " is not present in array ");
        }
    }
}
