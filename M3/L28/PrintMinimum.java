package M3.L28;

public class PrintMinimum {

    private static void printMin(int[] arr, int si, int min) {
        if (si == arr.length) {
            System.out.println(min);
            return;
        }
        if (arr[si] < min) {
            min = arr[si];
        }
        printMin(arr, si + 1, min);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, -5, 6, 0 };
        System.out.print("The minimum element in the array is : ");
        printMin(arr, 1, arr[0]);
    }
}
