package M2.L14;

public class IsArraySorted {

    private static boolean isArraySorted(int[] arr, int i, int n) {
        if (i == n - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isArraySorted(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        if (isArraySorted(arr, 0, arr.length)) {
            System.out.println("Array is sorted !!!");
        } else {
            System.out.println("Array is not sorted ");
        }

    }
}
