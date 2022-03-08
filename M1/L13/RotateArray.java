package M1.L13;

public class RotateArray {

    private static void swapElements(int[] arr, int si, int ei) {
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
    }

    private static void reverse(int[] arr, int si, int ei) {
        while (si < ei) {
            swapElements(arr, si, ei);
            si++;
            ei--;
        }
    }

    private static void rotateArray(int[] arr, int d) {

        if (arr.length == 0) {
            return;
        }

        if (d >= arr.length) {
            d = d % arr.length;
        }

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - d - 1);
        reverse(arr, arr.length - d, arr.length - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Array before rotation ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        rotateArray(arr, 3);

        System.out.println("Array After rotation ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
