package M2.L14;

public class LastIndex {
    private static int helper(int[] arr, int x, int index) {
        if (index == arr.length) {
            return -1;
        }
        int smallAns = helper(arr, x, index + 1);

        if (smallAns != -1) {
            return smallAns;
        }
        if (arr[index] == x) {
            return index;
        }

        return -1;
    }

    private static int lastIndex(int[] arr, int x) {
        return helper(arr, x, 0);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 3 };
        int x = 4;
        System.out.println(x + " is found at " + lastIndex(arr, x) + " index");
    }
}
