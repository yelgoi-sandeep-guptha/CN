package M2.L15;

public class BinarySearch {

    private static int binarySearch(int[] arr, int element, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == element) {
            return mid;
        }
        if (arr[mid] > element) {
            return binarySearch(arr, element, start, mid - 1);
        } else {
            return binarySearch(arr, element, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int element = 5;
        int index = binarySearch(arr, element, 0, arr.length);
        System.out.println("The element " + element + " found at " + (index + 1) + " Position");
    }
}
